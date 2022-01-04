/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * smlee1@kyobobook.com      2021. 9. 6.
 *
 ****************************************************/
package kyobobook.application.domain.common;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;

/**
 * @Project     : fo-order-api
 * @FileName    : ResponseResult.java
 * @Date        : 2021. 9. 6.
 * @author      : smlee1@kyobobook.com
 * @description : 요청에 대한 응답 전문용
 */
@Slf4j
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseMessage {

    @ApiModelProperty(value = "요청 처리 결과 Object", required = false)
    Object data;
    @ApiModelProperty(value = "처리 상태 코드", required = true, example = "200")
    int statusCode;
    @ApiModelProperty(value = "처리 결과 메세지", required = false, example = "정상처리 되었습니다.")
    String resultMessage;
    @ApiModelProperty(value = "처리 결과 상세 메세지", required = false, example = "처리중 오류 발생시 상세 메세지 노출.")
    String detailMessage;

    /**
     * @Method      : getConvertFromMapToData
     * @Date        : 2021. 9. 8.
     * @author      : smlee1@kyobobook.com
     * @description :
     * @param <T>
     * @param clazz
     * @return
     */
    public <T> T getConvertFromMapToData(Class<T> clazz) {
        ObjectMapper mapper = new ObjectMapper();
        return clazz.cast(mapper.convertValue(this.data, clazz));
    }

    /**
     * set 메소드 명 생성
     * @param fieldName
     * @return
     */
    private String makeMethodName(String fieldName) {
        return "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
    }

    /**
     * Return Data Object 의 value 값을 데이터 유형에 맞춰 반환
     * @param field - 데이터 타입 확인을 위한 필드
     * @param exampleValue - 바인딩 할 value
     * @return
     */
    private Object parseParameterType(Field field, Object exampleValue) {
        Object returnValue = "";

        if(field.getType().equals(int.class) || field.getType().equals(Integer.class)) {
            returnValue = Integer.parseInt(exampleValue.toString());
        } else if(field.getType().equals(long.class) || field.getType().equals(Long.class)) {
            returnValue = Long.parseLong(exampleValue.toString());
        } else if(field.getType().equals(double.class) || field.getType().equals(Double.class)) {
            returnValue = Double.parseDouble(exampleValue.toString());
        } else if(field.getType().equals(float.class) ||  field.getType().equals(Float.class)) {
            returnValue = Float.parseFloat(exampleValue.toString());
        } else if(field.getType().equals(short.class) ||  field.getType().equals(Short.class)) {
            returnValue = Short.parseShort(exampleValue.toString());
        } else if(field.getType().equals(byte.class) ||  field.getType().equals(Byte.class)) {
            returnValue = Byte.parseByte(exampleValue.toString());
        } else if(field.getType().equals(boolean.class) ||  field.getType().equals(Boolean.class)) {
            returnValue = Boolean.parseBoolean(exampleValue.toString());
        } else {
            returnValue = exampleValue;
        }

        return returnValue;
    }

    /**
     * Field 에 Data 바인딩
     * @param clazz
     * @param targetObj
     * @param field
     * @param fieldValue
     * @throws Exception
     */
    private void setFieldData(Class<?> clazz, Object targetObj, Field field, Object fieldValue) throws Exception {
        String methodNameSet = this.makeMethodName(field.getName());
        Method method = clazz.getDeclaredMethod(methodNameSet, field.getType());

        if(method != null) {
            Object paramValue = this.parseParameterType(field, fieldValue);
            method.invoke(targetObj, paramValue);
        }
    }


    /**
     * kyobobook.application.domain 내의 클래스를 필드로 사용한 경우 해당 domain 클래스 field 에 example 데이터 셋팅
     * @param clazz - ResponseMessage 의 data 필드에 들어갈 원 Object 의 class
     * @param targetObj - clazz 타입으로 생성된 field 값을 바인팅 할 대상 클래스 Object
     * @param field - targetObject 내에 domain 클래스 field 의 java.lang.reflect.Field
     * @param fieldClass - field 에 해당하는 Object 의 class
     * @param dataLength - 생성할 데이터 건수 0 이면 단일 Object 생성, 1 이상이면 List Type 로 생성
     * @throws Exception
     */
    private void initDomainField(Class<?> clazz, Object targetObj, Field field, Class<?> fieldClass, int dataLength) throws Exception {
        Constructor<?> constructor = fieldClass.getConstructor(null);
        Object dataObject = constructor.newInstance(null);

        // 내부 domain 클래스의 field 값 셋팅
        this.createMockData(fieldClass, dataObject, 0);

        if(dataLength > 0) {
            // 데이터 타입이 List 인 경우 dataLength 길이 만큼 List 형태로 생성
            List<Object> mockDataList = new ArrayList<Object>();
            for(int dataIdx = 0; dataIdx < dataLength; dataIdx ++) {
                mockDataList.add(dataObject);
            }
            // response data 타입의 Object 에 셋팅된 domain 클래스 세팅
            this.setFieldData(clazz, targetObj, field, mockDataList);
        } else {
            // response data 타입의 Object 에 셋팅된 domain 클래스 세팅
            this.setFieldData(clazz, targetObj, field, dataObject);
        }

    }


    /**
     * Mock API 생성, Swagger API 를 사용해 Mock 데이터 생성
     * @param clazz
     * @param targetObj
     * @param length
     * @throws Exception
     */
    private void createMockData(Class<?> clazz, Object targetObj, int length) throws Exception {
        Field [] arrField = clazz.getDeclaredFields();

        for(Field field : arrField) {

            if(field.getType().getPackageName().indexOf("kyobobook.application.domain") > -1) {

                // domain pacakge 내의 kyobobook.application.domain 패키지의 domain class 를 필드로 사용하는 경우
                Class<?> fieldClass = field.getType();
                this.initDomainField(clazz, targetObj, field, fieldClass, 0);

            } else if(field.getType().isAssignableFrom(List.class)) {

                // List 타입으로 generic type 의 클래스가 kyobobook.application.domain 하위 클래스 사용시
                ParameterizedType paramType = (ParameterizedType) field.getGenericType();
                Class<?> fieldClass = (Class<?>) paramType.getActualTypeArguments()[0];
                this.initDomainField(clazz, targetObj, field, fieldClass, length);

            } else {
                // 기타 stack 필드의 value 셋팅
                ApiModelProperty property = field.getAnnotation(ApiModelProperty.class);
                if(property != null) {
                    this.setFieldData(clazz, targetObj, field, property.example());
                }
            }
        }
    }

    /**
     * Mock API 의 임시 데이터 셋팅
     * data 에 바인딩 되는 Object 내부에 field 가 stack field 만 있는 경우 단건 Mock 데이터 생성
     * @param clazz - ResponseMessage 의 data 필드에 들어가는 데이터 타입의 class
     * @return
     */
    public ResponseMessage setExample(Class<?> clazz) {
        return this.setExample(clazz, 1);
    }

    /**
     * Mock API 의 임시 데이터 셋팅
     * @param clazz - ResponseMessage 의 data 필드에 들어가는 데이터 타입의 class
     * @param length - Return 하는 데이터의 size, ArrayList 타입으로 반환되는 길이
     * @return
     */
    public ResponseMessage setExample(Class<?> clazz, int dataLength) {
        return this.setExample(clazz, dataLength, 1);
    }

    /**
     * Mock API 의 임시 데이터 셋팅
     * @param clazz - ResponseMessage 의 data 필드에 들어가는 데이터 타입의 class
     * @param dataLength
     * @param fieldLength
     * @return
     */
    public ResponseMessage setExample(Class<?> clazz, int dataLength, int fieldLength) {
        return this.setExampleByMultiField(clazz, dataLength, fieldLength);
    }

    /**
     * Mock API 의 임시 데이터 셋팅
     * data 는 단건으로 내부 필드에 list 타입이 있는 경우 해당 필드를 fieldLength 만큼 셋팅해서 반환
     * @param clazz - ResponseMessage 의 data 필드에 들어가는 데이터 타입의 class
     * @param fieldLength - data 인스턴스 내부 필드가 list 타입인 경우 데이터 바인딩 사이즈.
     * @return
     */
    public ResponseMessage setExampleByMultiField(Class<?> clazz, int fieldLength) {
        return this.setExampleByMultiField(clazz, 0, fieldLength);
    }

    /**
     * Mock API 의 임시 데이터 셋팅
     * @param clazz - ResponseMessage 의 data 필드에 들어가는 데이터 타입의 class
     * @param dataLength - ResponseMessage 의 data 필드에 들어가는 데이터 사이즈.
     *                     clazz 의 인스턴스가 dataLength 만큼 목록으로 들어감.
     * @param fieldLength - data 인스턴스 내부 필드가 list 타입인 경우 데이터 바인딩 사이즈.
     * @return
     */
    public ResponseMessage setExampleByMultiField(Class<?> clazz, int dataLength, int fieldLength) {
        try {
            Constructor<?> constructor = clazz.getConstructor(null);
            Object dataObject = constructor.newInstance(null);

            // MockData 생성
            this.createMockData(clazz, dataObject, fieldLength);

            // length 만큼 데이터 복제
            if(dataLength > 1) {
                List<Object> dataList = new ArrayList<Object>();
                for(int dataIdx = 0; dataIdx < dataLength; dataIdx ++) {
                    dataList.add(dataObject);
                }
                this.data = dataList;
            } else {
                this.data = dataObject;
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }

        return this;
    }

}

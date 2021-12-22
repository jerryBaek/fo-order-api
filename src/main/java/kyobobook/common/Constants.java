/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * kimsehoon@kyobobook.com      2021. 11. 23.
 *
 ****************************************************/
package kyobobook.common;

/**
 * @Project : fo-order-api
 * @FileName : Constants.java
 * @Date : 2021. 11. 23.
 * @author : kimsehoon@kyobobook.com
 * @description : 상수
 */
public final class Constants {

    private Constants() {
        throw new IllegalStateException("Constants class");
    }

    /** 빈공백 */
    public static final String EMPTY = "";

    /** 공백 */
    public static final String SPACE = " ";

    /** 예 */
    public static final String YES = "Y";

    /** 아니오 */
    public static final String NO = "N";

    /** 오류 */
    public static final String ERROR = "ERROR";

    /** 업무코드 */
    public static final String SERVICE_CODE = "ord";

    /** 접두 경로 */
    public static final String PATH_PREFIX = Constants.SpecialCharacters.SLASH + Constants.SERVICE_CODE;

    /**
     * @Project : fo-order-api
     * @FileName : Constants.java
     * @Date : 2021. 12. 3.
     * @author : kimsehoon@kyobobook.com
     * @description : 특수문자
     */
    public static final class SpecialCharacters {

        private SpecialCharacters() {
            throw new IllegalStateException("SpecialCharacters class");
        }

        /** 슬래시 */
        public static final String SLASH = "/";

    }

    /**
     * @Project : fo-order-api
     * @FileName : Constants.java
     * @Date : 2021. 11. 23.
     * @author : kimsehoon@kyobobook.com
     * @description : 메시지 소스 상수
     */
    public static final class MessageSource {

        private MessageSource() {
            throw new IllegalStateException("MessageSource class");
        }

        /** 완료 */
        public static final String COMPLETE = "common.process.complete";
        /** 오류 */
        public static final String ERROR = "common.process.error";

    }

    /**
     * @Project : fo-order-api
     * @FileName : Constants.java
     * @Date : 2021. 12. 22.
     * @author : kimsehoon@kyobobook.com
     * @description : API응답메시지 상수
     */
    public static final class ApiResponse {

        private ApiResponse() {
            throw new IllegalStateException("ApiResponse class");
        }

        /** 200 메시지 접두문자 */
        public static final String MESSAGE_200_PREFIX = "<pre>Request han been successfully<br/>{<br/>  \"data\": {}, <font color=\"red\">data 항목은 ";
        /** 200 메시지 접미문자 */
        public static final String MESSAGE_200_POSTFIX = " 참고</font><br/>  \"statusCode\": 200,<br/>  \"resultMessage\": \"정상처리 되었습니다.\",<br/>  \"detailMessage\": \"처리중 오류 발생시 상세 메세지 노출.\"<br/>}</pre>";
        /** 404 메시지 */
        public static final String MESSAGE_404 = "Page Not Found";
        /** 500 메시지 */
        public static final String MESSAGE_500 = "An error occurred";

    }

}

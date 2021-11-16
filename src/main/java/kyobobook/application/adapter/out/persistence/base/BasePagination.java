/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * kimsehoon@kyobobook.com      2021. 11. 15.
 *
 ****************************************************/
package kyobobook.application.adapter.out.persistence.base;

/**
 * @Project     : fo-order-api
 * @FileName    : BasePagination.java
 * @Date        : 2021. 11. 15.
 * @author      : kimsehoon@kyobobook.com
 * @description : 페이지 기반 객체
 */
public abstract class BasePagination {

    /** 페이지당 컨텐츠 수 */
    public Integer contentsPerPage;
    
    /** 시작 인덱스 */
    public Integer startIndex;
    
    /** 페이지 번호 */
    public Integer pageNo = 1;
    
    /**
     * @Method      : setStartIndex
     * @Date        : 2021. 11. 15.
     * @author      : kimsehoon@kyobobook.com
     * @description : 페이징 정보 설정
     * @param contentsPerPage 페이지당컨텐츠수
     * @param pageNo 시작페이지번호
     */
    public void setStartIndex(Integer contentsPerPage, Integer pageNo) {
        this.contentsPerPage = contentsPerPage;
        this.pageNo = pageNo;
        this.startIndex = (pageNo - 1) * contentsPerPage;
    }
    
}

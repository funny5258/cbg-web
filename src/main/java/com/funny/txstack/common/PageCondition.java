package com.funny.txstack.common;

/**
 * Created by funny on 2016/12/14.
 */
public class PageCondition {
    protected Integer pageNo = 1;
    protected Integer pageSize = 10;

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}

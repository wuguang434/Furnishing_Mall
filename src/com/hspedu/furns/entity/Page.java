package com.hspedu.furns.entity;

import java.util.List;

public class Page<T> {

    //因为每页显示多少条记录,是其他地方也可以使用
    public static final Integer PAGE_SIZE=3;
    //显示第几页
    private Integer pageNo;
    //表示每页显示几条记录
    private Integer pageSize = PAGE_SIZE;
    //表示共有多少页,计算得到
    private Integer pageTotalCount;
    //表示一共有多少条记录,通过totalRow和pageSize
    //计算得到pageTotalCount
    private Integer totalRow;
    //表示当前页,
    private List<T> items;
    //分页导航的字符串
    private String url;

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

    public Integer getPageTotalCount() {
        return pageTotalCount;
    }

    public void setPageTotalCount(Integer pageTotalCount) {
        this.pageTotalCount = pageTotalCount;
    }

    public Integer getTotalRow() {
        return totalRow;
    }

    public void setTotalRow(Integer totalRow) {
        this.totalRow = totalRow;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

package cn.chinatelecom.esurvey.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PageInfo<T> {

    /**
     * 总条数
     */
    private Long total;

    /**
     * 每页条数
     */
    private Integer pageSize;


    /**
     * 总页数
     */
    private Integer pages;


    /**
     * 当前页数
     */
    private Integer pageNum;

    /**
     * 当前页记录
     */
    private List<T> list;

    public PageInfo() {
    }

    public PageInfo(Long total, Integer pageSize, Integer pages, Integer pageNum, List<T> list) {
        this.total = total;
        this.pageSize = pageSize;
        this.pages = pages;
        this.pageNum = pageNum;
        this.list = list;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}

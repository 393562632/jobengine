package cn.chinatelecom.esurvey.model.query;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class StatisticQuery implements Serializable {


    private static final long serialVersionUID = -5214464495592805830L;

    /** key： 问题id， value： 选项列表 */
    private Map<String, List<String>>  query;

    // 开始时间
    private Date from;

    // 结束时间
    private Date to;

    private Integer perPage;

    public Map<String, List<String>> getQuery() {
        return query;
    }

    public void setQuery(Map<String, List<String>> query) {
        this.query = query;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public Integer getPerPage() {
        return perPage;
    }

    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }


}

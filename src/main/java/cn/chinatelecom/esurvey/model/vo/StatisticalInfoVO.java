package cn.chinatelecom.esurvey.model.vo;

// 统计回收量，浏览量，回收率，平均完成时间


import java.util.Date;
import java.util.Map;

public class StatisticalInfoVO {

    public long submitNo;

    public long viewNo;

    public int percent;

    public String averageTime;

    public String title;

    Map<Date, Long> countMap;

    public long getSubmitNo() {
        return submitNo;
    }

    public void setSubmitNo(long submitNo) {
        this.submitNo = submitNo;
    }

    public long getViewNo() {
        return viewNo;
    }

    public void setViewNo(long viewNo) {
        this.viewNo = viewNo;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public String getAverageTime() {
        return averageTime;
    }

    public void setAverageTime(String averageTime) {
        this.averageTime = averageTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Map<Date, Long> getCountMap() {
        return countMap;
    }

    public void setCountMap(Map<Date, Long> countMap) {
        this.countMap = countMap;
    }

    @Override
    public String toString() {
        return "StatisticalInfoVO{" +
                "submitNo=" + submitNo +
                ", viewNo=" + viewNo +
                ", percent=" + percent +
                ", averageTime='" + averageTime + '\'' +
                ", title='" + title + '\'' +
                ", countMap=" + countMap +
                '}';
    }
}

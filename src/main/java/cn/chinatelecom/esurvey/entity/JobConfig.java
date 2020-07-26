package cn.chinatelecom.esurvey.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Setter
@Getter
public class JobConfig {

    //  job运行评率，单位是秒
    int frequency;

    //  请求URL
    String url;

    //  请求参数, key 为对应的值 value为对应的值
    Map<String, String>  requestMap;

    //  字段映射关系列表
    List<RelationItem> relationItemList;

    @Override
    public String toString() {
        return "JobConfig{" +
                "frequency=" + frequency +
                ", url='" + url + '\'' +
                ", requestMap=" + requestMap +
                ", relationItemList=" + relationItemList +
                '}';
    }
}

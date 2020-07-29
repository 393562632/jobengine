package cn.chinatelecom.esurvey.entity;

import cn.chinatelecom.esurvey.entity.readers.Reader;
import cn.chinatelecom.esurvey.entity.readers.RelationItem;
import cn.chinatelecom.esurvey.entity.writers.Writer;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Setter
@Getter
public class JobConfig {

    //  job运行评率，单位是秒
    Long frequency;

    String apiName;
    //读的配置信息
    private Reader reader;

    //写的配置信息
    private Writer writer;

}

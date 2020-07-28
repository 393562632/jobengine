package cn.chinatelecom.esurvey.entity;

import cn.chinatelecom.esurvey.entity.readers.Reader;
import cn.chinatelecom.esurvey.entity.writers.Writer;
import lombok.Getter;
import lombok.Setter;

/**
 * @author hbw
 * @version 1.0
 * @date Created in 2020/7/27 14:12
 */
@Setter
@Getter
//json文件主要信息
public class Content {

    //读的配置信息
    private Reader reader;

    //写的配置信息
    private Writer writer;
}

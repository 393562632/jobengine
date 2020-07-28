package cn.chinatelecom.esurvey.entity;

import cn.chinatelecom.esurvey.entity.settings.Setting;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author hbw
 * @version 1.0
 * @date Created in 2020/7/27 14:15
 */
@Getter
@Setter
public class Job {
    //job的主要信息
    private List<Content> content;
    //配置信息
    private Setting setting;

    @Override
    public String toString() {
        return "Job{" +
                "content=" + content +
                ", setting=" + setting +
                '}';
    }
}

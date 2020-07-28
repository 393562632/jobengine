package cn.chinatelecom.esurvey.entity.writers;

import lombok.Getter;
import lombok.Setter;

/**
 * @author hbw
 * @version 1.0
 * @date Created in 2020/7/27 10:52
 */
@Setter
@Getter
public class Writer {
    //name
    private String name="hdfswriter";

    //配置信息
    private WParameter parameter;

    @Override
    public String toString() {
        return "Writer{" +
                "name='" + name + '\'' +
                ", parameter=" + parameter +
                '}';
    }
}

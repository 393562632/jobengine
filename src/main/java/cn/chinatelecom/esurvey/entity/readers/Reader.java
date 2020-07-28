package cn.chinatelecom.esurvey.entity.readers;

import cn.chinatelecom.esurvey.entity.readers.Parameter;
import lombok.Getter;
import lombok.Setter;

/**
 * @author hbw
 * @version 1.0
 * @date Created in 2020/7/27 10:52
 */
@Setter
@Getter
public class Reader {


    private String name="httpreader";

    private Parameter parameter;

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", parameter=" + parameter +
                '}';
    }
}

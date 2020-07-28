package cn.chinatelecom.esurvey.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @author hbw
 * @version 1.0
 * @date Created in 2020/7/27 13:41
 */
@Setter
@Getter
public class Cloumn {
    //字段名
    private String name;
    //字段类型
    private String type;

    public Cloumn(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Cloumn() {
    }

    @Override
    public String toString() {
        return "Cloumn{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

package cn.chinatelecom.esurvey.entity.readers;

import cn.chinatelecom.esurvey.entity.Cloumn;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author hbw
 * @version 1.0
 * @date Created in 2020/7/27 13:29
 */
@Setter
@Getter
public class Parameter {
    //接口访问地址
    private List<String> url;
    //请求方式
    private String httpMethod="get";

    private String header="";

    private int delayTime;
    //请求参数
    private List<RelationItem> requestParam;
    //请求返回码值
    private int successCode;
    //请求返回码
    private String successCodeJsonPath;
    //返回值json中取那个字段的值
    private String dataJsonPath;

    private List<Cloumn> column;

    @Override
    public String toString() {
        return "Parameter{" +
                "url='" + url + '\'' +
                ", httpMethod='" + httpMethod + '\'' +
                ", header='" + header + '\'' +
                ", requestParam=" + requestParam +
                ", successCode='" + successCode + '\'' +
                ", successCodeJosnPath='" + successCodeJsonPath + '\'' +
                ", dataJosnPath='" + dataJsonPath + '\'' +
                ", column=" + column +
                '}';
    }
}

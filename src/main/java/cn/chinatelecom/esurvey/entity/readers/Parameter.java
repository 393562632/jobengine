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
    private String httpUrl="";
    //请求方式
    private String httpMethod="get";
    //请求参数
    private List<RelationItem> requestParam;
    //请求返回码值
    private String successCode;
    //请求返回码
    private String successCodeJosnPath;
    //返回值json中取那个字段的值
    private String dataJosnPath;

    private List<Cloumn> column;

    @Override
    public String toString() {
        return "Parameter{" +
                "httpUrl='" + httpUrl + '\'' +
                ", httpMethod='" + httpMethod + '\'' +
                ", requestParam=" + requestParam +
                ", successCode='" + successCode + '\'' +
                ", successCodeJosnPath='" + successCodeJosnPath + '\'' +
                ", dataJosnPath='" + dataJosnPath + '\'' +
                ", column=" + column +
                '}';
    }
}

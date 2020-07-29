package cn.chinatelecom.esurvey.entity.writers;

import cn.chinatelecom.esurvey.entity.Cloumn;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author hbw
 * @version 1.0
 * @date Created in 2020/7/27 13:56
 */
@Setter
@Getter
public class WParameter {
    //hive地址
    private String defaultFS;
    //文件格式
    private String fileType="orc";
    //存储路径
    private String path;
    //文件名
    private String fileName;
    //写入的字段
    private List<Cloumn> column;
    //写入的方式
    private String writeMode="append";
    //文件分割符
    private String fieldDelimiter="\t";

    private String compress="NONE";


    @Override
    public String toString() {
        return "WParameter{" +
                "defaultFS='" + defaultFS + '\'' +
                ", fileType='" + fileType + '\'' +
                ", Path='" + path + '\'' +
                ", fileName='" + fileName + '\'' +
                ", cloumn=" + column +
                ", writeMode='" + writeMode + '\'' +
                ", fieldDelimiter='" + fieldDelimiter + '\'' +
                ", compress='" + compress + '\'' +
                '}';
    }
}

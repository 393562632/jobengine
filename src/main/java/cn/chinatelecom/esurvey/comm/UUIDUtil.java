package cn.chinatelecom.esurvey.comm;


import java.util.UUID;

public class UUIDUtil {


    // 获取今天午夜时间
    public static String getUUID () {
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        return uuid;
    }


}

package cn.chinatelecom.esurvey.config;

import cn.chinatelecom.esurvey.controller.JobController;
import cn.chinatelecom.esurvey.entity.Content;
import cn.chinatelecom.esurvey.entity.Job;
import cn.chinatelecom.esurvey.entity.JobConfig;
import cn.chinatelecom.esurvey.entity.JsonFile;
import cn.chinatelecom.esurvey.entity.settings.Setting;
import cn.chinatelecom.esurvey.entity.settings.Speed;
import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author hbw
 * @version 1.0
 * @date Created in 2020/7/27 14:52
 */
public class JsonWriteFileConfig {

    private final static Logger logger = LoggerFactory.getLogger(JobController.class);

    /**
     * 写文件到.Json
     * @param jobConfig
     * @param id
     * @throws IOException
     */
    public static void FashwriteFile(String path,JobConfig jobConfig,int id)
            throws IOException {
        // 返回的结果
        JsonFile jsonFile = new JsonFile();
        Job job = new Job();
        System.out.println(jobConfig.getReader());
        System.out.println(jobConfig.getWriter());
        Content content = new Content();
        content.setReader(jobConfig.getReader());
        content.setWriter(jobConfig.getWriter());
        List<Content> list = new ArrayList<>();
        list.add(content);
        job.setContent(list);
        Setting setting = new Setting();
        Speed speed = new Speed();
        setting.setSpeed(speed);
        job.setSetting(setting);
        jsonFile.setJob(job);
        String s = JSON.toJSONString(jsonFile);
        FileWriter fw = new FileWriter(path+id+".json");
        PrintWriter out = new PrintWriter(fw);
        out.write(s);
        out.println();
        fw.close();
        out.close();
    }

    public static void writeFile(String path,JobConfig jobConfig,int id){
        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonFile jsonFile = new JsonFile();
            Job job = new Job();
            System.out.println(jobConfig.getReader());
            System.out.println(jobConfig.getWriter());
            Content content = new Content();
            content.setReader(jobConfig.getReader());
            content.setWriter(jobConfig.getWriter());
            List<Content> list = new ArrayList<>();
            list.add(content);
            job.setContent(list);
            Setting setting = new Setting();
            Speed speed = new Speed();
            setting.setSpeed(speed);
            job.setSetting(setting);
            jsonFile.setJob(job);
            String value = mapper.writeValueAsString(jsonFile);
            System.out.println(value);
            OutputStream out =new FileOutputStream(path+id+".json");
            byte[] b=value.getBytes();
            for(int i=0;i<b.length;i++){
                out.write(b[i]);
            }
            out.close();
        } catch (IOException e) {
            logger.info("序列化失败......");
            e.printStackTrace();
        }
    }

}

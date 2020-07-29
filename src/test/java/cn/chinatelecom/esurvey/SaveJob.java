package cn.chinatelecom.esurvey;

import cn.chinatelecom.esurvey.entity.Cloumn;
import cn.chinatelecom.esurvey.entity.JobConfig;
import cn.chinatelecom.esurvey.entity.readers.Parameter;
import cn.chinatelecom.esurvey.entity.readers.Reader;
import cn.chinatelecom.esurvey.entity.readers.RelationItem;
import cn.chinatelecom.esurvey.entity.writers.WParameter;
import cn.chinatelecom.esurvey.entity.writers.Writer;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

public class SaveJob {

    private final static Logger logger = LoggerFactory.getLogger(SaveJob.class);


    @Test
    public void SaveJob() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://192.168.9.171:8989/jobEngine/addConfig";
        JobConfig jobConfig = new JobConfig();
        jobConfig.setFrequency(1L);
        Reader reader = new Reader();
        Parameter parameter = new Parameter();
        List<RelationItem> relationItems = new ArrayList<>();
        List<String> url1 = new ArrayList<>();
        url1.add("http://9p8yse.natappfree.cc/api?sex=1");
        parameter.setUrl(url1);
        parameter.setRequestParam(relationItems);
        parameter.setHeader("");
        parameter.setDelayTime(300);
        parameter.setSuccessCode(200);
        parameter.setSuccessCodeJsonPath("$.code");
        parameter.setDataJsonPath("$.data");
        List<Cloumn> cloumns = new ArrayList<>();
        cloumns.add(new Cloumn("name","STRING"));
        cloumns.add(new Cloumn("email","STRING"));
        parameter.setColumn(cloumns);
        reader.setParameter(parameter);
        jobConfig.setReader(reader);
        Writer writer = new Writer();
        WParameter parameter1 = new WParameter();
        parameter1.setDefaultFS("hdfs://192.168.9.180:9000");
        parameter1.setFileType("orc");
        parameter1.setPath("/user/hive/warehouse/orc_table");
        parameter1.setFileName("orc_table");
        List<Cloumn> cloumns2 = new ArrayList<>();
        cloumns2.add(new Cloumn("col1","STRING"));
        cloumns2.add(new Cloumn("col2","STRING"));
        parameter1.setColumn(cloumns2);
        writer.setParameter(parameter1);
        jobConfig.setWriter(writer);
        String body = JSON.toJSONString(jobConfig);
        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        headers.setContentType(type);
        headers.add("Accept", MediaType.APPLICATION_JSON.toString());
        HttpEntity<String> formEntity = new HttpEntity<String>(body, headers);
        String result= restTemplate.postForEntity(url,formEntity,String.class).getBody();
        logger.info(result);
    }


    @Test
    public void getAll() {
        RestTemplate restTemplate = new RestTemplate();
        String accessTokenRequestUrl = "http://localhost/jobEngine/listAll";
        String jstoken = restTemplate.getForObject(accessTokenRequestUrl,String.class);
        logger.info(jstoken);
    }


    @Test
    public void startJob() {
        RestTemplate restTemplate = new RestTemplate();
        String accessTokenRequestUrl = "http://192.168.9.171/jobEngine/start/1";
        String jstoken = restTemplate.getForObject(accessTokenRequestUrl,String.class);
        logger.info(jstoken);
    }

    @Test
    public void startJob2() {
        RestTemplate restTemplate = new RestTemplate();
        String accessTokenRequestUrl = "http://192.168.9.171:8989/jobEngine/start/4";
        String jstoken = restTemplate.getForObject(accessTokenRequestUrl,String.class);
        logger.info(jstoken);
    }

    @Test
    public void stopJob() {
        RestTemplate restTemplate = new RestTemplate();
        String accessTokenRequestUrl = "http://localhost/jobEngine/stop/1";
        String jstoken = restTemplate.getForObject(accessTokenRequestUrl,String.class);
        logger.info(jstoken);
    }

}

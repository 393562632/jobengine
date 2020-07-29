package cn.chinatelecom.esurvey.controller;


import cn.chinatelecom.esurvey.RestResult;
import cn.chinatelecom.esurvey.comm.BizException;
import cn.chinatelecom.esurvey.comm.LoggerUtils;
import cn.chinatelecom.esurvey.config.JsonWriteFileConfig;
import cn.chinatelecom.esurvey.entity.JobConfig;
import cn.chinatelecom.esurvey.entity.requestResult;
import cn.chinatelecom.esurvey.model.vo.QuestionnaireVO;
import cn.chinatelecom.esurvey.model.vo.vocode.AlpacaErrorCode;
import cn.chinatelecom.esurvey.service.JobService;
import cn.chinatelecom.esurvey.utils.ControllerLogUtils;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.validation.Valid;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jobEngine")
public class JobController {

    private final static Logger logger = LoggerFactory.getLogger(JobController.class);


    @Autowired
    private JobService jobService;

    @Value("${json.file.path}")
    private String filePath;
    @Value("${py.file.path}")
    private String pyFilePath;

    /**
     * 增加新配置
     * @param jobConfig
     * @param bindingResult
     * @return
     */
    @PostMapping(value = "/addConfig", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public RestResult saveJob(@RequestBody @Valid JobConfig jobConfig,
                              BindingResult bindingResult) {
        Date timer = new Date();
        String path = "/jobEngine/addConfig";
        RestResult restResult = ControllerLogUtils
                .LoggingBefore(jobConfig, path, bindingResult, timer);
        if (!RestResult.isSucess(restResult)) {
            return restResult;
        }
        try {
            Integer id = jobService.InsertConfig(jobConfig);
            logger.info(" id  =  " +  id);
            JsonWriteFileConfig.writeFile(filePath,jobConfig,id);
        } catch (Exception e) {
            logger.error("/jobEngine/addConfig 接口出错 timer : " + timer, e);
            return RestResult.genFailResult(AlpacaErrorCode.NULL_OBJ.getCode(), e.getMessage());
        }
        ControllerLogUtils.LoggingAfter(restResult, path, timer);
        return restResult;
    }

    /**
     * 查询配置列表
     * @return
     */
    @RequestMapping(value = "/listAll")
    public RestResult<List<QuestionnaireVO>> listAll() {
        Date timer = new Date();
        String path = "/jobEngine/listAll";
        ControllerLogUtils.LoggingBefore(null, path, timer);
        RestResult restResult = new RestResult();
        try {
            List<requestResult> list = jobService.getAll();
            restResult = RestResult.genSuccessResult(list);
        } catch (Exception e) {
            logger.error("/jobEngine/addConfig 接口出错 timer : " + timer, e);
            return RestResult.genFailResult(AlpacaErrorCode.NULL_OBJ.getCode(), e.getMessage());
        }
        ControllerLogUtils.LoggingAfter(JSON.toJSONString(restResult), path, timer);
        return restResult;
    }


    @RequestMapping(value = "/start/{id}")
    public RestResult<String> startJob(
            @PathVariable(value = "id", required = true) Integer id
    ) {
        RestResult<String> restResult;
        Date timer = new Date();
        String path = "/jobEngine/start/{id}";
        ControllerLogUtils.LoggingBefore(id, path, timer);
        try {
            jobService.startJob(id,pyFilePath,filePath);
            restResult = RestResult.genSuccessResult("启动成功");
            ControllerLogUtils.LoggingAfter(JSON.toJSONString(restResult), path, timer);
            return restResult;
        } catch (BizException e) {
            LoggerUtils.error(logger, e, "业务异常");
            return RestResult.genFailResult(Integer.parseInt(e.getBizCodeEnum().getCode()),
                    e.getBizCodeEnum().getMessage());
        } catch (Exception e) {
            LoggerUtils.error(logger, e, "系统异常");
            return RestResult.genFailResult("系统异常");
        }
    }

    @RequestMapping(value = "/stop/{id}")
    public RestResult<String> stopJob(
            @PathVariable(value = "id", required = true) Integer id
    ) {

        RestResult<String> restResult;
        Date timer = new Date();
        String path = "/jobEngine/stop/{id}";
        ControllerLogUtils.LoggingBefore(id, path, timer);
        try {
            jobService.stopJob(id);
            restResult = RestResult.genSuccessResult("停止成功");
            ControllerLogUtils.LoggingAfter(JSON.toJSONString(restResult), path, timer);
            return restResult;
        } catch (BizException e) {
            LoggerUtils.error(logger, e, "业务异常");
            return RestResult.genFailResult(Integer.parseInt(e.getBizCodeEnum().getCode()),
                    e.getBizCodeEnum().getMessage());
        } catch (Exception e) {
            LoggerUtils.error(logger, e, "系统异常");
            return RestResult.genFailResult("系统异常");
        }
    }



}

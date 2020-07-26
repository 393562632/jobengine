package cn.chinatelecom.esurvey.utils;


import cn.chinatelecom.esurvey.RestResult;
import cn.chinatelecom.esurvey.model.vo.vocode.AlpacaErrorCode;
import java.util.Date;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

@Component
public class BindingResults {

    public static RestResult getResult(BindingResult bindingResult, String path, Date timer) {
        RestResult restResult = RestResult.genSuccessResult("参数校验通过");
        if (bindingResult.hasErrors()) {
            for (FieldError fieldError : bindingResult.getFieldErrors()) {
                restResult = RestResult.genFailResult(AlpacaErrorCode.INPUT_PARAM_ERROR.getCode(),
                    fieldError.getDefaultMessage());
            }
            ControllerLogUtils.LoggingAfter(restResult, path, timer);
        }
        return restResult;
    }
}

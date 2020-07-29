package cn.chinatelecom.esurvey.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @author hbw
 * @version 1.0
 * @date Created in 2020/7/29 13:37
 */
@Getter
@Setter
public class requestResult {
    private Integer id;

    private String apiName;

    private Long frequency;

    private Integer status;
}

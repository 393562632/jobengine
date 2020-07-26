package cn.chinatelecom.esurvey.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RelationItem {

    // 返回字段名
    String responseName;

    // hive中的字段名
    String hiveName;

    // 返回类型
    String type;
}

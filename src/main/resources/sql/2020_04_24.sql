CREATE TABLE `file_info` (
`file_id` int NOT NULL AUTO_INCREMENT,
`release_id` int NOT NULL ,
`questionnaire_id` int NOT NULL,
`user_file_name`  varchar(512)  NOT NULL  comment '用户文件名称',
`server_file_name`  varchar(512)  NOT NULL comment '服务器文件名称',
`state_type`  varchar(128)  NOT NULL comment '状态 1： 有效， 0：无效',
`file_type`  varchar(128)  NOT NULL comment '文件类型备用字段： 1 为默认',
`uuid`  varchar(256)  NOT NULL unique comment 'uuid 文件唯一标识',
`gmt_create` timestamp NULL  comment '创建时间',
`gmt_modify` timestamp NULL comment '修改时间',
PRIMARY KEY (`file_id`)
);
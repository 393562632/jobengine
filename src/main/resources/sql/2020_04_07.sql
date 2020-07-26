CREATE TABLE `event_log` (
`event_id` int NOT NULL AUTO_INCREMENT,
`release_id` int NOT NULL ,
`questionnaire_id` int NOT NULL,
`session_id` varchar(256) NOT NULL,
`event_type`  varchar(128)  NOT NULL,
`gmt_create` timestamp NULL,
`gmt_modify` timestamp NULL,
PRIMARY KEY (`event_id`)
);

alter table answer add  column session_id varchar(256);

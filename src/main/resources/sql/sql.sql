drop database  IF EXISTS `jobEngine`;

create database jobEngine;
USE jobEngine;
SET NAMES utf8;
CREATE TABLE `job` (
`id` int(127) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT,
`apiName` VARCHAR(50) NULL COMMENT 'apiName',
`config` varchar(2048) NULL COMMENT '文件配置信息',
`status` int NULL default 0 COMMENT '文件状态 1 ： 标识激活， 0： 标识没有激活',
PRIMARY KEY (`id`)
);

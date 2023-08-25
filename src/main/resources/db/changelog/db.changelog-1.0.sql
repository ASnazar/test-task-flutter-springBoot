--liquibase formatted sql

CREATE TABLE IF NOT EXISTS `value`(
    id bigint NOT NULL AUTO_INCREMENT,
    `value` int DEFAULT NULL
)
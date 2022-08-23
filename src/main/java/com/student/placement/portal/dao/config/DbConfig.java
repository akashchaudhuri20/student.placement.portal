package com.student.placement.portal.dao.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
public class DbConfig {

    @Value(value = "${DB_NAME:pp}")
    public String dbName;

    @Value(value = "${DS_COUNT:2}")
    public int dbCount;

    @Value(value = "${TB_COUNT:3}")
    public int tableCount;

    public String actualDataSource = "pp";
}

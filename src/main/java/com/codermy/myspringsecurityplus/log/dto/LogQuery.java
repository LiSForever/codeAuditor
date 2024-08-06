package com.codermy.myspringsecurityplus.log.dto;

import lombok.Data;

import java.sql.Timestamp;
import java.util.List;


@Data
public class LogQuery {

    private String userName;

    private String logType;
    // private List<Timestamp> createTime;
}

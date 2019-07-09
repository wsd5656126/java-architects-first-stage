package com.wusd.entity;

import lombok.Data;

@Data
public class Log {
    private String logId;
    private String actionName;
    private Long createTime;
}

package com.wusd.session;

import lombok.Data;

@Data
public class Cache {
    private String key;
    private Object value;
    private Long timeout;
}

package com.wusd.util;

import java.util.UUID;

public class GUID {
    public static String random() {
        return UUID.randomUUID().toString();
    }
}

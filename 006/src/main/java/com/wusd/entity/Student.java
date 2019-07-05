package com.wusd.entity;

import com.wusd.SetProperty;
import com.wusd.SetTable;
import lombok.Data;

@Data
@SetTable("wusd_student")
public class Student {
    @SetProperty(name = "name", length = 50)
    private String name;
    @SetProperty(name = "age", length = 3)
    private Integer age;
}

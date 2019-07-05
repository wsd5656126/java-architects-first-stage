package com.wusd;

import java.util.ArrayList;
import java.util.List;

public class Test001 {
    public static void main(String[] args) {

    }
    @OneAnnotation(beanId = 123, className = "className", arrays = {"11", "222"})
    public void add() {

    }
    @SuppressWarnings("all")
    public void save() {
        List list = new ArrayList<>();
    }
}

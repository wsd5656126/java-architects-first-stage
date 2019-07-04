package com.wusd.json;

import com.alibaba.fastjson.JSON;
import com.sun.org.apache.xpath.internal.operations.Mod;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Model {
    private String name;
    private String url;

    public static void main(String[] args) {
        Model model = new Model();
        model.setName("盛东");
        model.setUrl("wusd");

        Model model2 = new Model();
        model2.setName("李洁");
        model2.setUrl("lij");

        List<Model> sites = new ArrayList<>();
        sites.add(model);
        sites.add(model2);

        Model2 model21 = new Model2();
        model21.setSites(sites);
        System.out.println(JSON.toJSONString(model21));
    }
}
@Data
class Model2 {
    private List<Model> sites;
}

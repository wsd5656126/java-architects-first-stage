package com.wusd.json;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * 组装JSON
 */
public class JSONTest2 {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        JSONArray sitesArray = new JSONArray();
        JSONObject bean1 = new JSONObject();
        bean1.put("name", "盛东");
        bean1.put("url", "wusd");
        sitesArray.add(bean1);

        JSONObject bean2 = new JSONObject();
        bean2.put("name", "盛东");
        bean2.put("url", "wusd");
        sitesArray.add(bean2);

        jsonObject.put("sites", sitesArray);
        System.out.println(jsonObject.toJSONString());
    }
}

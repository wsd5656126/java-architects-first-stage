package com.wusd.json;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * 解析json
 */
public class JSONTest {
    static String JSONSTR = "{\"sites\":[{\"name\":\"盛东\",\"url\":\"wusd\"},{\"name\":\"李洁\",\"url\":\"lij\"}]}";

    public static void main(String[] args) {
        // 将json字符串转换成json对象
        JSONObject jsonObject = JSONObject.parseObject(JSONSTR);
        // 获取json数组对象
        JSONArray sites = jsonObject.getJSONArray("sites");
        //迭代json数组
        for (Object o : sites) {
            JSONObject tempJSONObject = (JSONObject) o;
            String name = tempJSONObject.getString("name");
            String url = tempJSONObject.getString("url");

            System.out.println(name + "---" + url);
        }
    }
}

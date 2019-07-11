package com.wusd.controller;

import com.wusd.entity.gen.VideoInfo;
import com.wusd.util.GUID;
import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@Slf4j
public class TestController {
    private static final String TEST = "test";

    @RequestMapping("/test")
    public String test() {
        return "index";
    }

    @RequestMapping("/json")
    @ResponseBody
    public List<VideoInfo> getJson() {
        List<VideoInfo> videoInfos = new ArrayList<>();
        VideoInfo videoInfo = new VideoInfo();
        videoInfo.setId(1);
        videoInfos.add(videoInfo);
        return videoInfos;
    }

    public static void main(String[] args) {
      log.info("test");
    }
}

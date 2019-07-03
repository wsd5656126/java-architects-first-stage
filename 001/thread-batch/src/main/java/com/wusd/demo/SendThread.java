package com.wusd.demo;

import com.wusd.ListUtils;
import com.wusd.entity.UserEntity;

import java.util.ArrayList;
import java.util.List;

class UserThread extends Thread {
    private List<UserEntity> list;

    public UserThread(List<UserEntity> list) {
        this.list = list;
    }

    /**
     * 分批发送短信
     */
    @Override
    public void run() {
        for (UserEntity user : list) {
            System.out.println("threadName:" + Thread.currentThread().getName() + "-userId:" + user.getUserId() +
            "-userName:" + user.getUserName());
            //发短信
        }
    }
}

/**
 * 使用多线程技术分批发送短信
 */
public class SendThread {
    public static List<UserEntity> init() {
        List<UserEntity> list = new ArrayList<>();
        for (int i = 0; i < 140; i++) {
            UserEntity tempUser = new UserEntity();
            tempUser.setUserId("userId" + i);
            tempUser.setUserName("userName" + i);
            list.add(tempUser);
        }
        return list;
    }

    public static void main(String[] args) {
        // 1.初始化用户数据
        List<UserEntity> userEntities = init();
        // 2.计算创建多少个线程并且每一个线程需要执行"分批发送短信用户"
        // 每一个线程分批跑多少
        int userThreadPage = 50;
        // 计算所有线程数
        List<List<UserEntity>> splitUserList = ListUtils.splitList(userEntities, userThreadPage);
        int threadSize = splitUserList.size();
        for (int i = 0; i < threadSize; i++) {
            List<UserEntity> list = splitUserList.get(i);
            UserThread userThread = new UserThread(list);
            // 3.执行任务发送短信
            userThread.start();
        }
    }
}

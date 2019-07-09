package com.wusd.session;

import org.joda.time.DateTime;
import org.omg.CORBA.TIMEOUT;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CacheManager {
    private Map<String, Cache> cacheMap = new HashMap<>();
    public void put(String key, Object value) {
        put(key, value, null);
    }
    public synchronized void put(String key, Object value, Long timeout) {
        Cache cache = new Cache();
        cache.setKey(key);
        cache.setValue(value);
        if (timeout != null)
            cache.setTimeout(System.currentTimeMillis() + timeout);
        cacheMap.put(key, cache);
    }
    public synchronized void del(String key) {
        cacheMap.remove(key);
    }
    public synchronized Object get(String key) {
        Cache cache = cacheMap.get(key);
        if (cache != null) {
            return cache.getValue();
        }
        return null;
    }
    public synchronized void remove(String key) {
        System.out.println("key:" + key + "删除成功...");
        cacheMap.remove(key);
    }
    public synchronized void checkValidateDate() {
        for (String key : cacheMap.keySet()) {
            Cache cache = cacheMap.get(key);
            if (cache == null) {
                break;
            }
            Long timeout = cache.getTimeout();
            Long currentTime = System.currentTimeMillis();
            System.out.println(currentTime);
            if (currentTime > timeout) {
                remove(key);
            }
        }
    }

    public static void main(String[] args) {
        final CacheManager cacheManager = new CacheManager();
        cacheManager.put("username", "wusd", 5001l);
        System.out.println("保存成功...");
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        scheduledThreadPool.schedule(new Runnable() {
            @Override
            public void run() {
                cacheManager.checkValidateDate();
            }
        }, 5000, TimeUnit.MILLISECONDS);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }
        String username = (String) cacheManager.get("username");
        System.out.println("username:" +username);
    }
}

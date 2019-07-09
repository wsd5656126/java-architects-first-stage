package com.wusd;

import com.wusd.entity.User;
import com.wusd.general.util.GUID;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


@Slf4j
public class BeansToSql {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, NoSuchFieldException {
        Set<String> strings = fieldNames(User.class);
        User user = new User();
        user.setUserName("wusd");
        user.setUserId(GUID.random());
        user.setAge(26);
        Map<String, Object> fieldMap = fieldMap(user);
        String insert = BeansToSql.insertSql(user);
        log.info("");
    }

    public static <T> Set<String> fieldNames(Class<T> clazz) {
        Set<String> fieldNames = new HashSet<>();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            fieldNames.add(field.getName());
        }
        return fieldNames;
    }

    public static <T> Map<String, Object> fieldMap(T obj)
            throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> clazz = obj.getClass();
        Map<String, Object> map = new HashMap<>();
        Set<String> fieldNames = fieldNames(clazz);
        for (String fieldName : fieldNames) {
            String getMethodName = "get" + fieldName.substring(0, 1).toUpperCase()
                    + fieldName.substring(1, fieldName.length());
            Method method = clazz.getDeclaredMethod(getMethodName);
            Object result = method.invoke(obj);
            if (result != null) {
                map.put(fieldName, result);
            }
        }
        return map;
    }

    public static <T> String tableName(T t) {
        Class<?> clazz = t.getClass();
        String simpleName = clazz.getSimpleName();
        return simpleName.substring(0, 1).toLowerCase() + simpleName.substring(1, simpleName.length());
    }

    public static <T> String insertSql(T t) {
        String insertSql = "INSERT INTO %s (%s) VALUES (%s)";
        String tableName = tableName(t);
        Map<String, Object> fieldMap = null;
        try {
            fieldMap = fieldMap(t);
        } catch (Exception e) {
            return "";
        }
        Set<String> keySet = fieldMap.keySet();
        StringBuilder ksb = new StringBuilder();
        StringBuilder vsb = new StringBuilder();
        if (!keySet.isEmpty()) {
            for (String key : keySet) {
                ksb.append(key);
                ksb.append(",");
                Object o = fieldMap.get(key);
                if (o instanceof String) {
                    vsb.append("'");
                    vsb.append(fieldMap.get(key));
                    vsb.append("'");
                } else {
                    vsb.append(fieldMap.get(key));
                }
                vsb.append(",");
            }
            ksb.deleteCharAt(ksb.length() - 1);
            vsb.deleteCharAt(vsb.length() - 1);
        }
        if (ksb.length() > 0 && vsb.length() > 0) {
             insertSql = String.format(insertSql, tableName, ksb.toString(), vsb.toString());
             return insertSql;
        } else {
            return "";
        }
    }
}

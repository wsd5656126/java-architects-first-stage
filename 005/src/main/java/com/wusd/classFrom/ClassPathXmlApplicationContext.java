package com.wusd.classFrom;

import com.wusd.entity.UserEntity;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;

public class ClassPathXmlApplicationContext {
    private String xmlPath;

    public ClassPathXmlApplicationContext(String xmlPath) {
        this.xmlPath = xmlPath;
    }

    public Object getBean(String beanId) throws Exception {
        // spring 加载过程 或者spring ioc实现原理
        SAXReader saxReader = new SAXReader();
        Document read = saxReader.read(this.getClass().getClassLoader().getResourceAsStream(xmlPath));
        // 对应bean
        Element rootElement = read.getRootElement();
        Object obj = null;
        // 对应多个bean
        List<Element> elements = rootElement.elements();
        for (Element element : elements) {
            String id = element.attributeValue("id");
            // 如果不是beanId, 执行如下代码 (非常重要)
            if (!beanId.equals(id)) {
                continue;
            }
            String className = element.attributeValue("class");
            Class<?> forName = Class.forName(className);
            obj = forName.newInstance();
            List<Element> propertyElements = element.elements();
            for (Element propertyElement : propertyElements) {
                Field declaredField = forName.getDeclaredField(propertyElement.attributeValue("name"));
                declaredField.setAccessible(true);
                declaredField.set(obj, propertyElement.attributeValue("value"));
            }
        }
        return obj;
    }

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("user.xml");
        Object bean = applicationContext.getBean("user1");
        UserEntity user = (UserEntity) bean;
        System.out.println(user.getUserId() + "----" + user.getUserName());
    }
}

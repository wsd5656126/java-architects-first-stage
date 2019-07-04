package com.wusd.xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.Iterator;
import java.util.List;

public class XmlTest {
    static String fileName = "005/target/classes/stu.xml";

    /**
     * dom4j不适合大文件的解析
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // 创建sax对象
        SAXReader saxReader = new SAXReader();
        // sax读取Document对象
        Document read = saxReader.read(fileName);

        // 获取rootElement对象
        Element rootElement = read.getRootElement();
        getNodes(rootElement);
    }
    public static void getNodes(Element rootElement) {
        // 属性有可能没有值
        System.out.println("节点名称:" + rootElement.getName() + ",节点属性:" + rootElement.getText());
        // rootElement的其他Attribute
        List<Attribute> attributes = rootElement.attributes();
        for (Attribute attribute : attributes) {
            System.out.println("名称:" + attribute.getName() + ", 属性:" + attribute.getText());
        }
        Iterator<Element> elementIterator = rootElement.elementIterator();
        while (elementIterator.hasNext()) {
            Element next = elementIterator.next();
            getNodes(next);
        }
    }
}

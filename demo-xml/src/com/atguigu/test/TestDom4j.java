package com.atguigu.test;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * ClassName: TestDom4j
 * Package: com.atguigu.test
 * Description:
 *
 * @Author wk
 * @Create 2024-08-03 17:10
 * @Version 1.0
 */
public class TestDom4j {
    @Test
    public void testRead() throws Exception {
        SAXReader saxReader = new SAXReader();
        InputStream resourceAsStream = TestDom4j.class.getClassLoader().getResourceAsStream("jdbc.xml");

        Document document = saxReader.read(resourceAsStream);

        Element rootElement = document.getRootElement();
        System.out.println(rootElement.getName());

        List<Element> elements = rootElement.elements();
        for (Element element : elements) {
            System.out.println("\t" + element.getName());

            Attribute idAttribute = element.attribute("id");
            if (idAttribute != null) {
                System.out.println("\t\t" + idAttribute.getName() + " = " + idAttribute.getValue());
            }

            List<Element> eles = element.elements();
            for (Element ele : eles) {
                System.out.println("\t\t" + ele.getName() + ":" + ele.getText());
            }
        }
    }

}

package com.teachingp.dom4j;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class teachReader {
        public void readXml() {
            String file = "C:\\Users\\seyaki\\Desktop\\teachingp\\src\\xml110.xml";
            SAXReader reader = new SAXReader();
            try {
                Document document= reader.read(file);
                Element root =  document.getRootElement();
                List<Element> courses = root.elements("course");
                for (Element course :courses){

                 Element c= course.element("course-name");
                 String cname=  c.getText();
                    System.out.println(cname);
                    System.out.println(course.elementText("class-hour"));
                    System.out.println(course.elementText("exam-forms"));
                    Attribute attribute =course.attribute("no");
                    System.out.println(attribute.getText());
                }


            } catch (DocumentException e) {
                e.printStackTrace();
            }
        }

    public static void main(String[] args) {
        teachReader teachreader = new teachReader();
        teachreader.readXml();
    }
    }
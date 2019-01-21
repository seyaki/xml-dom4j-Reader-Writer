package com.teachingp.dom4j;

import com.sun.org.apache.xml.internal.serializer.ElemDesc;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class teachWriter {
    public  void writeXml(){
        String file ="C:\\Users\\seyaki\\Desktop\\teachingp\\src\\xml110.xml";
        SAXReader reader =new SAXReader();
        try {
            Document document = reader.read(file);
            Element root = document.getRootElement();
            Element course = root.addElement("course");
            course.addAttribute("no","5");
            Element name = course.addElement("course-name");
            name.setText("生物");
            course.addElement("class-hour").setText("50");
            course.addElement("exam-form").setText("笔试");
            Writer writer =new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
            document.write(writer);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        teachWriter t =new teachWriter();
        t.writeXml();
    }
}

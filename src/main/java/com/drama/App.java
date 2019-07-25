package com.drama;

import com.drama.configuration.DIConfig;
import com.drama.consumer.AnnotateApp;
import com.drama.consumer.XMLApp;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfig.class);
        AnnotateApp app = context.getBean(AnnotateApp.class);
        app.process("Hi fresh man", "1ashton@xx.com");
        context.close();
        ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext.xml");
        XMLApp app1 = context1.getBean(XMLApp.class);
        app1.process("Hi fresh man", "2aston");
        context1.close();
    }
}

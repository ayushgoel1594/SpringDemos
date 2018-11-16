package com.advices;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/advices/config.xml");
        ReportService srv = (ReportService) context.getBean("reportService");
        try {
            srv.generateReport();
        } catch (Exception exp) {
            System.out.println(exp.getMessage());
        }
    }
}
 
package com.annotationbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		/*ReportService reportService = new ReportService();*/
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/com/annotationbased/config.xml");
		ReportService reportService = (ReportService) applicationContext.getBean("reportService");
		reportService.generateReport();
	}
}

 
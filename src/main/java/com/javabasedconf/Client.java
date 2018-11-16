package com.javabasedconf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		/*ReportService reportService = new ReportService();*/
		//below line is required for xml based configuration
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/com/javabasedconf/config.xml");
		
		//for java based configuration
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		ReportService reportService = (ReportService) applicationContext.getBean("reportService1");
		reportService.generateReport();
		
		ReportService reportService2 = (ReportService) applicationContext.getBean("reportService2");
		reportService2.generateReport();
		
		//In case of AutoScan
		//ReportService reportService = (ReportService) applicationContext.getBean("reportService");
	}
}

 
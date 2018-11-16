package com.autoscanning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		/*ReportService reportService = new ReportService();*/
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/com/autoscanning/config.xml");
		ReportService reportService = (ReportService) applicationContext.getBean("reportService");
		reportService.generateReport();
	}
}

 
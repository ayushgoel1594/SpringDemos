package com.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		/*ReportService reportService = new ReportService();*/
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/com/beanscope/config.xml");
		ReportService reportService = (ReportService) applicationContext.getBean("reportService");
		
		ReportService reportService2 = (ReportService) applicationContext.getBean("reportService");
		reportService2.setRecordsPerPage(500);
		
		ReportService srv2 = (ReportService)applicationContext.getBean("reportService");
		System.out.println("hash code of srv1:" + reportService.hashCode());
                System.out.println("hash code of srv2:" +reportService2.hashCode());
		if(reportService==reportService2){
			System.out.println("Same instance");
		}
		else
			System.out.println("Different instance");
	
		//observe the changes by making changes in the xml file i.e. change scope to singleton/prototype
		reportService.generateReport();
		reportService2.generateReport();
	}
}

 
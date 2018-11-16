package com.infy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientMain {
	public static void main(String[] args) {
		//here we will not make the object directly, instead we take help of xml file
		//QuestionService questionService = new QuestionService();
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/com/infy/config.xml");
		QuestionService questionService = (QuestionService) applicationContext.getBean("questionService");
		questionService.generateQuestion();
	}
}

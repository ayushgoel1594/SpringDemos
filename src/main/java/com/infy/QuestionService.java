package com.infy;

public class QuestionService {
	
	//In Spring we do not need to create the objects here, it is handled by the spring framework
	//QuestionInterface master = new StrutsQuestion();
	
	QuestionInterface questionInterface;
	
	//for construction injection we must have a paramaterized constructor
	public QuestionService(QuestionInterface questionInterface) {
		this.questionInterface = questionInterface;
		
	}
	
	//we must have a default constructor if we have setter injection and we have created a parameterised constructor
	public QuestionService() {
		
	}
	

	public QuestionInterface getQuestionInterface() {
		return questionInterface;
	}

	public void setQuestionInterface(QuestionInterface questionInterface) {
		this.questionInterface = questionInterface;
	}


	public void generateQuestion() {
		System.out.println(questionInterface.askQuestion());
	}
}

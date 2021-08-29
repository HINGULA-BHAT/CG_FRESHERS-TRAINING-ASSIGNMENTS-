package com.hingula_b.Spring1;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question2 {
	
	private int questionId;
	private String question;
	private List<String> answer1;
	private Set<String> answer2;
	private Map<Integer,String> answer3;
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswer1() {
		return answer1;
	}
	public void setAnswer1(List<String> answer1) {
		this.answer1 = answer1;
	}
	public Set<String> getAnswer2() {
		return answer2;
	}
	public void setAnswer2(Set<String> answer2) {
		this.answer2 = answer2;
	}
	public Map<Integer, String> getAnswer3() {
		return answer3;
	}
	public void setAnswer3(Map<Integer, String> answer3) {
		this.answer3 = answer3;
	}
	public void answerList() {
		System.out.println("QuestionId is: "+ getQuestionId());
		System.out.println("Question is: "+ getQuestion());
		System.out.println("Answer in List is:" +answer1);
		for(String list:answer1) {
			System.out.println(list);
		}
	}
	public void answerSet() {
		System.out.println("QuestionId is: "+ getQuestionId());
		System.out.println("Question is: "+ getQuestion());
		System.out.println("Answer in Set is:" +answer2);
		
	}
	public void answerMap() {
		System.out.println("QuestionId is: "+ getQuestionId());
		System.out.println("Question is: "+ getQuestion());
		System.out.println("Answer in Map is:" +answer3);


	}
}

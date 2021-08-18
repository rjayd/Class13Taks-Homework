package com.syntax.class13;

public class Student {
	
	String school, name, id;
	char gender;
	double tuition;
	
	void study() {
		System.out.println(name+" studies in "+school);
	}
	void payTuition(){
		System.out.println(name +" pays "+tuition);
	}
}

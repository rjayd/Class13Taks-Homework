package com.syntax.class13;

public class TaskTester {

	public static void main(String[] args) {
		
		Task methods = new Task();
		double result = methods.larger(15.99, 14.5);
				System.out.println(result);
		
		Task oddEven = new Task();
		String result1 = oddEven.evenOdd(5);
		System.out.println(result1);
		
		Task hello = new Task();
		hello.hello("Philippines");
		System.out.println(hello.hello("Philippines"));
		
		Task email = new Task();
		String fn = email.fEmail("Rjay");
		String ln = email.lEmail("Dorado");
		String type = email.typeEmail("gmail");
		System.out.println(fn+ln+"@"+type+".com");
		
		Task prime = new Task();
		boolean num = prime.Prime(13);
		System.out.println("Prime is " + num);
		
		Task getGrade = new Task();
		char grade = getGrade.grade(89);
		System.out.println(grade);
		
		Task palin = new Task();
		boolean checkPalindrome = palin.palindrome("abcdcba");
		System.out.println(checkPalindrome);
	}

}

package com.syntax.class13;

public class MethodTester {

	public static void main(String[] args) {

		Methods method = new Methods();
		method.repeatWords(3, "Syntax");
		System.out.println("===================");
		method.repeatWords(4, "Syntax");
		System.out.println("===================");
		method.isRaining(true);
		
		int sum = method.add(10, 10);
		System.out.println(sum);
	}

}

package com.syntax.class13;

import java.util.Scanner;

public class Method2Tester {

	public static void main(String[] args) {

		Methods2 methods = new Methods2();
		double results = methods.getMax(12, 155);
				System.out.println(results);
		//double results2 = methods.getMaxWithoutVoid(2, 3); ----won't work
				Scanner scan = new Scanner(System.in);
				String name = scan.next();
				System.out.println(name);
				
				   
	}

}

package com.syntax.class13;

public class Task {

	// defining which number is larger
	double larger(double num1, double num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}

	// getting odd or even from a given number
	String evenOdd(int num) {
		if (num % 2 == 0) {
			return "Even";
		} else {
			return "Odd";
		}
	}
	// saying hello in different languages
	String hello(String country) {
		switch (country) {
		case "Philippines":
			return "Kumusta";
		case "USA":
			return "Hello";
		case "Spain":
			return "Hola";
		default:
			return "Invalid";
		}
	}
	// Email address
	String fEmail(String fn) {
		return fn;
	}

	String lEmail(String ln) {
		return ln;
	}

	String typeEmail(String eType) {
		return eType;
	}
	//Checking for Prime
	boolean isPrime;
	boolean Prime(int num) {
		if(num>0) {
			for (int i = 2; i< num; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				} else{
					isPrime = true;
				}
			}
		}else {
			return false;
		}
		if (!isPrime) {
			return false;
		}else {
			return true;
		}
	}
	// Determining Grade for a student
			char grade(int num) {
				if (num>=90) {
					return 'A';
				} else if (num>=80) {
					return 'B';
				} else if (num >= 70) {
					return 'C';
				}else if (num >= 50) {
					return 'D';
				}else {
					return 'F';
				}
			}
			//Palindrome 
			String reverse;
			boolean palindrome(String word) {
				for (int i=word.length()-1; i>=0; i--) {
					reverse+=word.charAt(i);
					if (word.equals(reverse)) {
						return true;
					} else {
						return false;
					}
				}
				return false;
			}
}

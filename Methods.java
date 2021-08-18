package com.syntax.class13;

public class Methods {

		void repeatWords(int times,String word) {
			for (int i =0; i<times; i++) {
				System.out.println(word);
			}
		}

		void isRaining(boolean isRain) {
			if (isRain) {
				System.out.println("Please take umbrella");
			} else {
				System.out.println("Let's go for walk");
			}
		}
		
		int add(int x, int y) {
		return x+y;	
		}
}

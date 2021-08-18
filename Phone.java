package com.syntax.class13;

public class Phone {

	String model, make;
	int RAM, ROM, camera;
	double screenSize;
	boolean is5G;
	
	void makeCall() {
		System.out.println(make+" "+model+" "+ " can make calls");
	}
	void takePictures() {
		System.out.println(make+" "+model+" "+ " can take pictures");
	}
}

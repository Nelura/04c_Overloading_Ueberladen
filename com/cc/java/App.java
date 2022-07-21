package com.cc.java;

public class App {

	public static void main(String[] args) {		
	
		
		TestOverloading testOverloading = new TestOverloading();		
		
		// Überladen Methode sayHello2	
		 testOverloading.sayHello2("Hi", 1);
		 testOverloading.sayHello2(2,"Hu");
		 testOverloading.sayHello2();
		
		
		// Überladen Methode sayHello3
		testOverloading.sayHello3("Hallo", 1080);
		testOverloading.sayHello3("Hallo", "1080");
		
		
	}
}

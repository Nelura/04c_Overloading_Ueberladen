package com.cc.java;

public class TestOverloading {
	
	// Gleiche Signatur 1	

	
	// public void sayHello() {
	// 	System.out.println("Hello");
	// }
	
	// public void sayHello() {
	// 	System.out.println("Hello");
	// }

	
		 
	// Gleiche Signatur | return type ?	
	// public void sayHello() {
	// 	System.out.println("Hello");
	// }
	
	// public String sayHello() {
	// 	//System.out.println("Hello");
	// 	return "hi";
	// }
	
	
	
	// Gleiche Signatur 3 | Access Modifier ?
	// public void sayHello() {
	// 	System.out.println("Hello");
	// }
	
	// private void sayHello() {
	// 	System.out.println("Hello");
	// }
	
	
		
	// Gleiche Signatur 3 | Parameter ?
	// public void sayHello2(String name, int counter) {
	// 	//System.out.println("Parameter name: " + name + " | Parameter: counter: " + counter);
	// }
	
	// public void sayHello2(String name, int counter) {
	// 	//System.out.println("Parameter name: " + name + " | Parameter: counter: " + counter);
	// }

	
	
	// Gleiche Signatur 3 | Parameter Namen ?
	// public void sayHello2(String name, int counter) {
	// 	//System.out.println("Parameter name: " + name + " | Parameter: counter: " + counter);
	// }
	
	// public void sayHello2(String pString, int pCount) {
	// 	//System.out.println("Parameter name: " + name + " | Parameter: counter: " + counter);
	// }
	
	
	// BasisMethode
	public void sayHello2(String name, int counter) {
		System.out.println("1: Parameter name: " + name + " | Parameter: counter: " + counter);
	}
	
	// Überladene Methode 1 (Reihenfolge Parameter)
	public void sayHello2(int counter, String name) {
		System.out.println("2: Parameter name: " + name + " | Parameter: counter: " + counter);
	}
	
	// Überladene Methode 3 (Anzahl Parameter)
	public void sayHello2() {
		System.out.println("3: Ohne parameter");
	}
	
	
	// BasisMethode
	public void sayHello3(String name, int ID) {
		System.out.println("Parameter name: " + name + " | Parameter: ID: " + ID);
	}
	
	
	// Überladene Methode 3 (Parameter Typ)
	public void sayHello3(String name, String ID) {
		System.out.println("Parameter name: " + name + " | Parameter: ID: " + ID);
	}
	


}

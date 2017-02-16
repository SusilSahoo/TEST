package com.test;

public class MainTestClass {
	
	public String global = "";
	
	public MainTestClass() {
		System.out.println("Default Constructor");
	}
	
	public MainTestClass(String name) {
		this.global = name;
		System.out.println("Parametarised Constructor - " + global);
	}

	public static void main(String[] args) {
	    
		String test = "WelCome to GITHUB";
				
		MainTestClass testClass = new MainTestClass(test);

	}

}

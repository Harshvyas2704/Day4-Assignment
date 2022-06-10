package com.masai2;

public class Demo {
	
	Demo() {
		System.out.println("non parameterized constructure");
	}
	
	Demo(String s) {
		System.out.println("passes String: " + s);
	}
	
	Demo(int i) {
		System.out.println("passed int: " + i);
	}
	
	Demo(float f) {
		System.out.println("passed float: " + f);
	}
	
	public static void main(String[] args) {
		
		//Demo d1= new Demo(5);
		//Demo d1= new Demo(5);
		//Demo d1= new Demo("Harsh");
		Demo d1= new Demo(10.55f);
		
		
		
		
		
	}

}

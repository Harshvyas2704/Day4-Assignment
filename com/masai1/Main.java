package com.masai1;

public class Main {
	
//	static boolean flag = false;
	Student s1 = new Student();
	boolean setter(int age, int marks) {
		
		if((age > 18 && age < 60) && (marks < 500 && marks > 0)) {
			s1.setAge(age);
			s1.setMarks(marks);
			s1.setName("Harsh");
			s1.setRoll(1);
//			flag = true;
			return true;
		}
		
		else {
			
			return false;
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Main m1  = new Main();
		boolean ret = m1.setter(20, 300);
		
		if(ret) {
			System.out.println("Name : " + m1.s1.getName());
			System.out.println("Roll no. : " + m1.s1.getRoll());
			System.out.println("Age : " + m1.s1.getAge());
			System.out.println("Marks : " + m1.s1.getMarks());			
		}		
		else {
			System.out.println("Enter valid details");
		}
	}
	
}

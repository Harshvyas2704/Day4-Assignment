package com.masai4;

public class Demo {

	void check(int x) {
		if(x>0 && x%2 != 0) {
			System.out.println(x);
		}
		else if(x > 0 ) {
			System.out.println(x*10);
		}
		else {
			System.out.println("Error");
		}
	}
	
	public static void main(String[] args) {
		Demo d1 = new Demo();
		d1.check(-21);
	}
	
}

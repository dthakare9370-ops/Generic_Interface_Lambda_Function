package com.methodref;

public class Demo {
	
	

	public Demo() {
		System.out.println("Demo Constructor");
	}

	void fun() {
		System.out.println("This is Fun Method :  ");
	}
	
	public static void run() {
		System.out.println("Static Method Run Call ");
	}
	
	public static void main(String args[]) {
		
		
//		Test t = ()->{
//			System.out.println("Override Abstract add Method");
//		};
//		t.add();
		
		
		
		
		//Longcut uding object 
//		Demo obj = new Demo();
//		Test t = obj::fun;
//		t.add();
		
		
		
		//Shortcut - Direct Object used 
//		Test t = new Demo()::fun;
//		t.add(10);
		
		
		
		
		//Static method Reference 
		Test t = Demo::run;
		t.add();
		
		
		
		
		//Constructor as a body of abstract method 
//		Test t = Demo::new;
//		t.add();
	}
}

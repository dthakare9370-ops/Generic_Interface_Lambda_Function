package com.predefine;

import java.util.function.Predicate;

public class Predicate_Demo {
	
	//Consumer do not Return Any Value but
	//Predicate return the Boolean Value 
	
	public static void main(String args[]) {
		
//		Predicate<Integer> p = (i)->{
////			return i > 50;
//			return i % 2 == 0;
//		};
//		System.out.println(p.test(100));
		
		
		
		
		Predicate<String> p = (i) -> {
//			return i.length()>5;
			return i.startsWith("g");
		};
		System.out.println(p.test("Ganesh"));
		
		
		
		//कहीपन use करा पान रिटर्न मात्र boolean करा okk
		// array , Class , int, String , Double and Many more kahipan vapra okk
		
		
	}
	
}

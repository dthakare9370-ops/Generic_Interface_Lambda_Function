package com.predefine;

import java.util.function.Function;

public class Function_Demo {
	
	//Function is the predefine interface which is present in the java.util.function package 
	//Funtion interface take the one input type as T and second input as the Return/Output value that is R
	//Also there is one method that is R accept(T t) they return the any value any type 
	
	/* 
	 * Public interface Function<T,R>{
	 * 
	 * 		public abstract R apply(T t);
	 * }
	 * 
	 */
	
	public static void main(String args[]) {
		
		//Integer
//		Function<Integer,Integer> f = (i) -> {
//			return i*2;
//		};
//		
//		System.out.println(f.apply(10));
		
		
		
		//String Length 
//		Function<String,Integer> f = (s)->{
//			return s.length();
//		};
//		System.out.println(f.apply("Ganesh"));
		
		
		
		//Array Length Return 
		Function<int[],Integer> f = (a)-> a.length;
		System.out.println(f.apply(new int[] {10,20,30,40}));
	}
}

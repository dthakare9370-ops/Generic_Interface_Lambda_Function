package com.demo;

import java.util.Arrays;

public class Main {
	public static void main(String args[]) {
		
//		Test<Integer> t1 = (a,b)->System.out.println("Add : "+(a+b));
//		t1.add(10, 20);
//		
//		Test<Float> t2 = (a,b)->System.out.println("Add : "+(a+b));
//		t2.add(10.4f, 20.5f);
//		
//		Test<Double> t = (a,b)->System.out.println("Add : "+(a+b));
//		t.add(18.4, 25.5);
		
		
		
		Test<Integer, int[]> t = (a,b)->{
			System.out.println(a);
			System.out.println(Arrays.toString(b));
		};
		
		t.display(10, new int[] {20,30,40,50});
	}
}

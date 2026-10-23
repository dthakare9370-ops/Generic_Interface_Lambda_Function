package com.demo;

@FunctionalInterface
public interface Test<T,U> {
	
	// T - Type - it should be Generic Type
	
//	void add(T a,T b);
	
	//Internally he add(Integer,Integer) jot same for the Integer ,Float, Double madhe karu shakto Genric 
	
//	void add(float a,float b);
//	void add(double a,double b);
	
	
	
	void display(T t,U u);
}



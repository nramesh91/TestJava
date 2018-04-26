package com.test.java;

public class Factorial {
	
	int fact (int i){
		int fact = 1;
		for (int j = 1; j <=i; j++){
			fact = fact * j;
		}
		return fact;
		
	}		

	public static void main(String[] args) {
		Factorial f = new Factorial();
		System.out.println(f.fact(4));
	}

}

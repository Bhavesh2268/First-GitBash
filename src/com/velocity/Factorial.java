package com.velocity;

import java.util.Scanner;

public class Factorial {
	
	private int getFactorial(int a) {
		
		int fact = 1;
		
		for(int i=a; i>0; i--) {
			fact = fact * i;
		}
		
		return fact;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to get factorial : ");
		int a = sc.nextInt();
		Factorial fact = new Factorial();
		System.out.println(fact.getFactorial(a));
		sc.close();
		
		

	}

}

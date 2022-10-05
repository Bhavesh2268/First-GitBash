package com.velocity;

import java.util.Scanner;

public class MultiplicationTable {
	
	public static void getMultiplicationTable(int a) {
		for(int i=1; i<=10; i++) {
			System.out.println(a + " * "+ i +" = "+a*i);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int a = sc.nextInt();
		getMultiplicationTable(a);
		sc.close();
	

	}

}

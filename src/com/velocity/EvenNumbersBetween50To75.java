package com.velocity;

public class EvenNumbersBetween50To75 {
	
	void getEvenNumbers() {
		for(int i=50; i<=75; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		EvenNumbersBetween50To75 evenNumbers = new EvenNumbersBetween50To75();
		evenNumbers.getEvenNumbers();

	}

}

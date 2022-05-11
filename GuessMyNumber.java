package com.demo;

import java.util.Scanner;

public class GuessMyNumber {

	static int maxNumber = 100;
	static int minNumber = 0;
	
	public static void main(String[] args) {
		
		System.out.println("Consider your number between [0-100]");
		
		GuessMyNumber obj = new GuessMyNumber();
		obj.guessNumber();
	}

	public void guessNumber() {
		
		Scanner scan = new Scanner(System.in);
		int middleNumber = (maxNumber + minNumber) / 2;
		int guessNumber;
		do {
			System.out.println("Is your number is less than middle number press '0', number is greater than middle number press '1', number is matches press '3'");
			System.out.println("Mid number " + middleNumber);
			guessNumber = scan.nextInt();	
			if(guessNumber == 0) {
				System.out.println("Number is less than mid");
				maxNumber = middleNumber;
				middleNumber = (minNumber + maxNumber) / 2;
			}
			else if(guessNumber == 1) {
				System.out.println("Number is greater than mid");
				minNumber = middleNumber;
				middleNumber = (minNumber + maxNumber) / 2;	
			}
			else if(guessNumber == 3) {
				System.out.println("Number is matched");
			}
		}
		while(guessNumber != 3);
	}

}

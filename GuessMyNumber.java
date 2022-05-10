package com.demo;

import java.util.Scanner;

public class GuessMyNumber {

	public static void main(String[] args) {
		
		System.out.println("Consider your number between [0-100]");
		
		GuessMyNumber obj = new GuessMyNumber();
		obj.guessNumber();
	}

	public void guessNumber() {
		Scanner scan = new Scanner(System.in);
		int number = 88;
		int max = 100;
		int min = 0;
		int midNumber = (max + min)/2;
		int response;
		do {
			System.out.println("Is your number is less than mid press '0' //  greater than mid press '1' // if your number is matches press '3'");
			System.out.println("Mid number " + midNumber);
			response = scan.nextInt();	
			if(response == 0) {
				System.out.println("Number is less than mid");
				max = midNumber;
				midNumber = (min + max)/2;
			}
			else if(response == 1) {
				System.out.println("Number is greater than mid");
				min = midNumber;
				midNumber = (min + max)/2;	
			}
			else if(response == 3) {
				System.out.println("Number is matched");
			}
		 }
		while(response != 3);
	}

}

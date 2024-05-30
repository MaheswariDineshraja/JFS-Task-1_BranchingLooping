package com.looping;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Getting input via STDIN        
		Scanner obj = new Scanner(System.in);
		System.out.println("Key in Input: ");
		int userInput = obj.nextInt();
		System.out.println("The Input Provided is: " + userInput);
		
		int reverseno=0;
		
		while(userInput!=0)
		{
			int remainder = userInput % 10;
			reverseno = reverseno * 10 + remainder;
			userInput=userInput/10;
		}
		
		System.out.println("Thereverse of the Input Provided is: " + reverseno);

	}

}

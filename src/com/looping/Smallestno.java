package com.looping;

import java.util.Scanner;

public class Smallestno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Getting input via STDIN        
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int No1 = obj.nextInt();
		System.out.println("Enter the second number: ");
		int No2 = obj.nextInt();
		System.out.println("Enter the third number: ");
		int No3 = obj.nextInt();
		
		
		int x,smallest;
		
		x=No1<No2?No1:No2;
		
		smallest=No3<x?No3:x;	
		
		
		System.out.println("The smallest number is: " + smallest);

	}

}

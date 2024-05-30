package com.looping;

import java.util.Scanner;

public class purchaseAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Getting input via STDIN        
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter purchase amount: ");
		int purchaseamount = obj.nextInt();
		System.out.println("The Input Provided is: " + purchaseamount);
		
		int discountamount;
		
		if(purchaseamount < 500)
		{
			System.out.println("No discount, Puchase amount is: "+ purchaseamount);			
		}
		else if(purchaseamount >= 500 && purchaseamount <=1000)
		{
			discountamount = purchaseamount + (purchaseamount*10/100);
			System.out.println("10% discount, Puchase amount is: "+ discountamount);
		}
		else if(purchaseamount > 1000)
		{
			discountamount = purchaseamount + (purchaseamount*20/100);
			System.out.println("20% discount, Puchase amount is: "+ discountamount);
		}	
		

	}
	

}

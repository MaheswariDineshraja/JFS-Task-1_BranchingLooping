package com.looping;

import java.util.Scanner;

public class posi_nega {

	public static void main(String[] args) {
				
		//Getting input via STDIN        
		Scanner obj = new Scanner(System.in);
        int userInput = obj.nextInt();
        System.out.println("The Input Provided is: " + userInput);
        
        if(userInput > 0)
        {
            System.out.println("Given number is positive");
            
        }
        
        if(userInput < 0)
        {
            System.out.println("Given number is negative");
            
        }

	}

}

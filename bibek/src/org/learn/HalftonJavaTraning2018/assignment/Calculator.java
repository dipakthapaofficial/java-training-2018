package org.learn.HalftonJavaTraning2018.assignment;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		

		float firstNumber;
		float secondNumber;
		float result;
		
		Scanner sc=new Scanner(System.in);
		
		
			System.out.println("Enter the first  number");
			
			
			
			firstNumber=sc.nextFloat();
			if(firstNumber<0) {
				System.out.println("You cannot enter negative number. Please enter positive number");
				System.out.println("Enter the first  number");
				firstNumber=sc.nextFloat();
			}
			System.out.println("Enter the second  number");
			secondNumber=sc.nextFloat();
			if(secondNumber<0) {
				System.out.println("You cannot enter negative number. Please enter positive number");
				System.out.println("Enter the second  number");
				secondNumber=sc.nextFloat();				
			}
//			continue;
//			System.out.println("Enter the second +ve number");
//			secondNumber=sc.nextFloat();
//			continue;
		
	
			
			System.out.println("Enter operator (+, -, *, /): ");
			char a=sc.next().charAt(0);
			
			switch(a)
		{
			case '+':
				result=firstNumber+secondNumber;
				System.out.println("Addition of two number is "+result);
				break;
			case '-':
				result=firstNumber-secondNumber;
				System.out.println("Addition of two number is "+result);
				break;
			case '*':
				result=firstNumber*secondNumber;
				System.out.println("Addition of two number is "+result);
				break;
			case '/':
				result=firstNumber/secondNumber;
				System.out.println("Addition of two number is "+result);
				break;
			default:
				System.out.println("plz enter valid operator");
		
	}
		}
		
		
		
		
		
		
		

	

	

}


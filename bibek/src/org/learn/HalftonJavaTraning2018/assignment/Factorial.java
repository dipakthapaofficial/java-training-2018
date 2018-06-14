package org.learn.HalftonJavaTraning2018.assignment;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int input=sc.nextInt();
		
		for(int i=1;i<=input;i++)
		{
			fact=fact*i;
			
			
			
		}
		System.out.println("The factorial is "+fact);
	}

}

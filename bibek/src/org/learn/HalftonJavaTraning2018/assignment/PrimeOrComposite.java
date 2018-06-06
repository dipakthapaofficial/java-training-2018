package org.learn.HalftonJavaTraning2018.assignment;

import java.util.Scanner;

public class PrimeOrComposite {

	public static void main(String[] args) {
		
		
		int num;
		boolean isPrime=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the prime or composite number");
		num=sc.nextInt();
		
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		
		if(isPrime==true)
		{
			System.out.println("The number is prime");
		}
		else
		{
			System.out.println("The number is composite");
		}

	}

}

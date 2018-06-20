package com.halftonedesign.trainning;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		long sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		long a = scan.nextInt();
		long startTime = System.currentTimeMillis();
		for (long i = 1; i < a + 1; i++) {
			sum = sum + i;
		}
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("Total time taken: " + elapsedTime);
		System.out.println("The sum of numbers from 1 to " + a + " is: " + sum);
		scan.close();
	}
}

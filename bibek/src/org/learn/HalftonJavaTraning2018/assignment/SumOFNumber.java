package org.learn.HalftonJavaTraning2018.assignment;

import java.util.Scanner;

public class SumOFNumber {

	public static void main(String[] args) {
		long sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		long input = sc.nextInt();
		long startTime = System.nanoTime();
		for (int i = 1; i <= input; i++) {
			sum += i;
		}
		System.out.println("The sum of number is " + sum);
		long stopTime = System.nanoTime();
		long elapsedTime = stopTime - startTime;
		System.out.println(elapsedTime);

	}

}

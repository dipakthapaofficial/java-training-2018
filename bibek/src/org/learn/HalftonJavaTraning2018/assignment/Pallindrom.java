package org.learn.HalftonJavaTraning2018.assignment;

import java.util.Scanner;

public class Pallindrom {

	public static void main(String[] args) {

		int r, temp;
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		temp = number;

		while (number > 0) {
			r = number % 10;
			number = number / 10;
			sum = sum * 10 + r;
		}
		if (temp == sum) {
			System.out.println("palindrom");
		} else {
			System.out.println("Not palindrome");
		}
	}

}

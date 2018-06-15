package com.halftonedesign.trainning;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int n1 = 0, n2 = 1, n = 0, a = 0;
		System.out.println("Please enter a number: ");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		do {
			System.out.println(n1);
			n = n1 + n2;
			n1 = n2;
			n2 = n;
		} while (n1 <= a);
		scan.close();
	}

}

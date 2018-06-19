package com.halftonedesign.trainning;

public class Arrays {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int i;
		int j;
		int k;
		for (i = 0; i < 9; i++) {
			for (j = 0; j < 9; j++) {
				int sum = a[i] + a[j];
				if (sum == 7) {
					System.out.println(a[i] + "  " + a[j]);
				} else {
					for (k = 0; k < 9; k++) {
						if ((sum+a[k]) == 7) {
							System.out.println(a[i] + "  " + a[j]+ "  " +a[k]);
						}
					}
				}
			}
		}

	}

}
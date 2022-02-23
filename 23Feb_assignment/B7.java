package com.assignment;

public class B7 {
	public static void main(String[] args) {

		int i, j, count = 0;
		System.out.println("Following are the prime numbers between 1 and 100:-");

		for (i = 2; i <= 100; i++) {
			for (j = 1; j <= i; j++) {
				if (i % j == 0)
					count++;
			}
			if (count == 2)
				System.out.print(" " + i);
			count = 0;
		}

	}
}

package com.assignment;

public class C15 {
	public static void main(String[] args) {

		int num = 23;

		boolean isPrime = true;

		for (int i = 2, limit = num / 2; i <= limit; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}
	}

}

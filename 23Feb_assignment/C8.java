package com.assignment;

public class C8 {
	public static void main(String[] args) {
		int num = 1234;
		int rev = 0;
		while (num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println("the rev of given no is " + rev);
	}
}

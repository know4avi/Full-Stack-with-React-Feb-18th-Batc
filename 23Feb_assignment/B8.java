package com.assignment;

public class B8 {
	public static void main(String[] args) {

		int num = 12321;
		int rev = 0, rem;
		int temp = num;

		while (num > 0) {
			rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;
		}

		if (temp == rev)
			System.out.println("Given number is palindrome");
		else
			System.out.println("Given number is not palindrome");
	}
}

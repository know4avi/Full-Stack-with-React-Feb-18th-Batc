package com.assignment;

import java.util.*;

public class C7 {
	public static void main(String[] args) {
		int i, fact = 1;
		int number;// It is the number to calculate factorial
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number: ");
		number = in.nextInt();
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);
	}

}

package com.assignment;

import java.util.*;

public class B6 {
	public static void main(String[] args) {
		int num = 8;

		int i = 1, f = 1;

		while (i <= num) {
			f = f * i;
			i++;
		}

		System.out.println("Factorial of " + num + " is: " + f);
	}

}

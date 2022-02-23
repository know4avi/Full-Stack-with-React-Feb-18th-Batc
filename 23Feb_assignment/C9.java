package com.assignment;

public class C9 {
	public static void main(String[] args) {
		int n = 8;
		int a = 0, b = 1, c, i;
		for (i = 1; i <= n; i++) {
			System.out.print(a + ",");
			c = a + b;
			a = b;
			b = c;

		}
	}

}

package com.assignment;

import java.util.*;

public class C3 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + 2);
			System.out.println(num - 1);
		} else {
			System.out.println(num + 1);
			System.out.println(num - 2);
		}
	}

}

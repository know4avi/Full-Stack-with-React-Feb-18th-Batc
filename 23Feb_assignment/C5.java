package com.assignment;

import java.util.*;

public class C5 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if (num <= 33) {
			System.out.println("Try Hard again");
		} else if (num > 33 && num <= 60) {
			System.out.println("Good performance");
		} else if (num > 60 && num <= 80) {
			System.out.println("Very Good performance");
		} else {
			System.out.println("Excellent performance");
		}
	}
}

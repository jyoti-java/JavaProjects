package com.javalearning.coding;

import java.util.Scanner;

public class PallindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int orignum = num;
		int rev = 0;
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);
		if (rev == orignum) {
			System.out.println(orignum + " is a pallindrome");
		} else {
			System.out.println(orignum + " is not a pallindrome");
		}
	}

}

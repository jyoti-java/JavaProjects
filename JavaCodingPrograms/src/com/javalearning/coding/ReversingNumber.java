package com.javalearning.coding;

import java.util.Scanner;

public class ReversingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr a number to be reversed");
		int num = sc.nextInt();
		int rev = 0;
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("reversed number is " + rev);
	}

}

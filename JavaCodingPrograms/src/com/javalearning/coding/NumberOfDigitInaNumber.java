package com.javalearning.coding;

import java.util.Scanner;

public class NumberOfDigitInaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;

		}
		System.out.println("the number of digits in a number is" + count);
	}

}

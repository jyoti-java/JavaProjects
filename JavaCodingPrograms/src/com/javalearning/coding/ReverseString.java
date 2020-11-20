package com.javalearning.coding;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the string to be reversed");
		String str = s1.next();
		String rev = "";
		int len = str.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}
		System.out.println("the reversed string is " + rev);
	}

}

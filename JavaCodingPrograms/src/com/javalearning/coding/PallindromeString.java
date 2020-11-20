package com.javalearning.coding;

import java.util.Scanner;

public class PallindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string to be checked for pallindrome");
		String str = sc.next();
		String rev = "";
		int len = str.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("the reversed string is" + rev);
		if (rev.equals(str)) {
			System.out.println(str + " is a pallindrome");
		} else
			System.out.println(str + " is not a pallindrome");

	}

}

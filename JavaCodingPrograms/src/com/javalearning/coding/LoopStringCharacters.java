package com.javalearning.coding;

import java.util.Scanner;

public class LoopStringCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.nextLine();

		// 1st approach
		/*
		 * for (int i = 0; i <= str.length() - 1; i++) {
		 * System.out.println(str.charAt(i)); }
		 */

		// 2nd Approach
		// loopString(str);

		// 3 rd approach
		/*
		 * char[] charArray = str.toCharArray(); for (int i = 0; i < charArray.length;
		 * i++) { System.out.println(charArray[i]);
		 */
		// to eliminate space

		for (int j = 0; j < str.length(); j++) {
			if (str.charAt(j) != ' ') {
				System.out.println(str.charAt(j));
			} else {
				System.out.print("");
			}
		}

	}

	public static void loopString(String text) {
		System.err.println(text.length());
		for (int i = 0; i < text.length(); i++) {
			// System.out.println(text.charAt(i));
			System.out.println(text.substring(i, i + 1));
		}
	}
}

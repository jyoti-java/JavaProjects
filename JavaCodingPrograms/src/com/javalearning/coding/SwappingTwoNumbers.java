package com.javalearning.coding;

import java.util.Scanner;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a and b to be swapped");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("a nd b before swapping");
		System.out.println(a + " " + b);
		// using third variable
		/*
		 * int temp=a; a=b; b=temp;
		 */

		// 2nd approach
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(" a nd b after swapping ");
		System.out.println(a + " " + b);

	}

}

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter a");
		int a = s1.nextInt();
		System.out.println("enter b");
		int b = s1.nextInt();
		System.out.println("numbers before swapping " + a + " " + b);
		/*
		 * int temp = a; a = b; b = temp;
		 */
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("numbers after swapping " + a + " " + b);
	}

}

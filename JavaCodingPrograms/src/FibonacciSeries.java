import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s1=new Scanner(System.in);
System.out.println("enter a number");
int num=s1.nextInt();
int n1=0,n2=1;
int sum=0;
System.out.println(n1);
System.out.println(n2);
for(int i=2;i<=num;i++) {
	sum=n1+n2;
	System.out.println(sum);
	n1=n2;
	n2=sum;
}
	}

}

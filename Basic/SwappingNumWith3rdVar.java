package Basic;

import java.util.Scanner;

public class SwappingNumWith3rdVar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		
		System.out.println("Enter second number");
		int b=sc.nextInt();
		
		System.out.println("Before swapping a="+a+" b="+b);
		
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("After swapping:");
		System.out.println("a="+a+" b= "+b);
		
	}

}

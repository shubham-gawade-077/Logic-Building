package Basic;

import java.util.Scanner;

public class Paint {

	public static void main(String[] args) {
		int l,b,h;
		int l1,b1;
		int l2,b2;
		int total;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the dimension");
		
		System.out.println("Enter the l");
		l=sc.nextInt();
		
	System.out.println("Enter the b");
		b=sc.nextInt();
		
	System.out.println("Enter the h");
		h=sc.nextInt();
		
		System.out.println("Enter the l1");
		l1=sc.nextInt();
		
		System.out.println("Enter the b1");
		b1=sc.nextInt();
		
		System.out.println("Enter the l2");
		l2=sc.nextInt();
		
		System.out.println("Enter the b2");
		b2=sc.nextInt();


		 
		total=2*(l*b + b*h + l*h)-(l1*b1)-2*(l2*b2)-(l*b);
			System.out.println(total);
	}

}

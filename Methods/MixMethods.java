package Methods;

import java.util.Scanner;

public class MixMethods {
 /* 1.no para no return
	2.no para with return
	3.with para no return
	4.with para with return	 
 */	 
	//1.no para no return
	public static void sub1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.no para no return");
		System.out.println("Enter a");
		int a=sc.nextInt();
		
		System.out.println("Enter b");
		int b=sc.nextInt();
		
		int c=a-b;
		System.out.println("substraction= "+c);
	}
	//2.no para with return
	public static int sub2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("2.no para with return");
		System.out.println("Enter a");
		int a=sc.nextInt();
		
		System.out.println("Enter b");
		int b=sc.nextInt();
		
		int c=a-b;
		return c;
	}
	//3.with para no return
	public static void sub3(int a,int b)
	{
		int c=a-b;
		System.out.println("substraction= "+c);
	}
	//4.with para with return	
	public static int sub4(int a,int b)
	{
		int c=a-b;
		return c;
	}
	public static void main(String[] args)
	{
		//1.
		sub1();
		
		//2.
		int x=sub2();
		System.out.println("substraction= "+x);
		
		//3.
		Scanner sc=new Scanner(System.in);
		System.out.println("3.with para no return");

		System.out.println("Enter a");
		int a=sc.nextInt();
		
		System.out.println("Enter b");
		int b=sc.nextInt();
		sub3(a,b);
		
		//4.
		System.out.println("4.with para with return");

		System.out.println("Enter a");
		int p=sc.nextInt();
		
		System.out.println("Enter b");
		int q=sc.nextInt();
		int z=sub4(p,q);
		System.out.println("substraction= "+z);
		System.out.println("End of all 4 methods");
	}

}

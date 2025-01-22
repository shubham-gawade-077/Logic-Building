package Methods;

import java.util.Scanner;

public class NoParaNoReturn
{
	static void add()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Additin,substraction,multiplication,division of two number");
		System.out.println("Enter a");
		int a=sc.nextInt();
		
		System.out.println("Enter b");
		int b=sc.nextInt();
		
		int add=a+b;
		System.out.println("Addition= "+add);
		
		int sub=a-b;
		System.out.println("Substraction= "+sub);
		
		int mul=a*b;
		System.out.println("multiplication= "+mul);
		
		int div=a/b;
		System.out.println("Division= "+div);
	}
	static void power()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("find power of number");
		System.out.println("Enter number");
		int n=sc.nextInt();
		
		System.out.println("Enter the power");
		int power=sc.nextInt();
		
		int p=1;
		for(int i=1;i<=power;i++)
		{
			p=p*n;
		}
		System.out.println("power= "+p);
	}
	static void max()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("max number between two number");
		System.out.println("Enter a");
		int a=sc.nextInt();
		
		System.out.println("Enter b");
		int b=sc.nextInt();
		
		int c=(a>b)? a:b;  //ternary operator
		System.out.println("max= "+c);
	}
	static void factorial()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("find factorial of number");
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int f=1;
		for(int i=n;i>=1;i--)
		{
			f=f*i;
		}
		System.out.println("Factorial= "+f);
	}
	static void sumOfDigit()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("find sum of digits");
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=0;
		while(n>0)
		{
			int n1=n%10;
			n=n/10;
			sum=sum+n1;
		}
		System.out.println("sum= "+sum);

	}
	public static void main(String[] args) 
	{
		add();
		power();
		max();
		factorial();
		sumOfDigit();
	}
}

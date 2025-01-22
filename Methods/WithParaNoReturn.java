package Methods;

import java.util.Scanner;

public class WithParaNoReturn {
	static void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition= "+c);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a");
		int a=sc.nextInt();
		
		System.out.println("Enter b");
		int b=sc.nextInt();
		
		add(a,b);//call by value
	}

}

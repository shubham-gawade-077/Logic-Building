package Methods;

import java.util.Scanner;

public class WithParaWithReturn {
	static int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a");
		int a=sc.nextInt();
				
		System.out.println("Enter b");
		int b=sc.nextInt();
		
		int c=add(a,b);
		System.out.println("Addition= "+c);
	}

}

package Methods;

import java.util.Scanner;

public class NoParaWithReturn {

	static int add()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a");
		int a=sc.nextInt();
		
		System.out.println("Enter b");
		int b=sc.nextInt();
		
		int c=a+b;
		return c;
	}
	public static void main(String[] args)
	{
		/*int add=add();
		System.out.println("Addition= "+add);
		*/
		System.out.println("Addition= "+add());
	}

}

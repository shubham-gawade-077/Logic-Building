package Nested_forloop_pattern;

import java.util.Scanner;

public class Pattern1_7 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(64+j)+" ");
			}
			System.out.println();
		}
	}

}
  /*

 Employee
 Employee Salary
 Employee Salary C
 Employee Salary C D
 Employee Salary C D E

  */
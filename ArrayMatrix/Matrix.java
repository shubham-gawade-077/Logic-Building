package ArrayMatrix;

import java.util.Scanner;

public class Matrix {
 // matrix means rows and column are same.
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows");
		int rows=sc.nextInt();
		
		System.out.println("enter cols");
		int cols=sc.nextInt();
		
		int [][]a=new int[rows][cols];
		int elements=rows*cols;
		System.out.println("Enter "+elements+" elements");
		//input:
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		//output:
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}

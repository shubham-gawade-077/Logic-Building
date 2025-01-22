package Array3D;

import java.util.Scanner;

public class Dynamic {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter depth");
		int depth=sc.nextInt();
		
		System.out.println("Enter rows");
		int rows=sc.nextInt();
		
		System.out.println("Enter cols");
		int cols=sc.nextInt();
		
		int a[][][]=new int [depth][rows][cols];
		int elements=(rows*cols)*depth;
		System.out.println("enter "+elements+" elements");
		
		//input:
		//depth
		for(int i=0;i<depth;i++)
		{
			//rows
			for(int j=0;j<rows;j++)
			{
				//column
				for(int k=0;k<cols;k++)
				{
					a[i][j][k]=sc.nextInt();
				}
			}
		}
		
		//output:
		//depth
		for(int i=0;i<depth;i++)
		{
			//rows
			for(int j=0;j<rows;j++)
			{
				//column
				for(int k=0;k<cols;k++)
				{
					System.out.print("a[][][]"+" = "+a[i][j][k]+" ");
					
				}
			}
		}
	}
		
}

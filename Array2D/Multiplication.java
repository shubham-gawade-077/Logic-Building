package Array2D;

public class Multiplication {

	public static void main(String[] args) 
	{
		int a[][]=
			{
					{2,4,6},
					{3,6,9},
					{2,3,4}
			};
		
		int b[][]=
			{
					{2,4,6},
					{3,6,9},
					{2,3,4}
			};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]*2+"\t");
			}
			System.out.println();
		}
	}

}

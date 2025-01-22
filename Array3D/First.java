package Array3D;

public class First {

	public static void main(String[] args) 
	{
		//int arr [][][]=new int [2][3][4];
		int a[][][]= {  
				              { {3,4,5,6},{1,2,3,4},{4,5,6,7} },
				              { {6,5,4,3},{7,8,9,6},{2,3,4,5} }  
		                   };
		System.out.print("{");
		System.out.println();
		//depth
		for(int i=0;i<2;i++)
		{
			System.out.print("{");
			//row
			for(int j=0;j<3;j++)
			{
				System.out.print("{");
				//column
				for(int k=0;k<4;k++)
				{
					System.out.print(a[i][j][k]+",");
				}
				System.out.print("}");
				System.out.print(",");

			}
			System.out.print("}");
			System.out.println(",");
		}
		System.out.print("}");

	}

}

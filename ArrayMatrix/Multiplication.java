package ArrayMatrix;

public class Multiplication {

	public static void main(String[] args) 
	{
		int a[][]= {
				{2,3,1},
				{1,4,1},
				{3,2,4}
		           };
		int b[][]= {
				{1,2,4},
				{4,1,1},
				{2,2,3}
		             };
		 int c[][]=new int[a[0].length][b.length];
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=0;j<b[0].length;j++)
			 {
				 for(int k=0;k<b.length;k++)
				 {
					 c[i][j]=c[i][j]+a[i][k]*b[k][j];
				 }
			 }
		 }
		 System.out.println("matrix c:");
		 for(int i=0;i<c.length;i++)
		 {
			 for(int j=0;j<c[0].length;j++)
			 {
				 System.out.print(c[i][j]+" ");
			 }
			 System.out.println();
		 }
		 //System.out.println();
	}

}

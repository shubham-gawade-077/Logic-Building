package Pyaramid;

public class Diamond {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			//for(int k=n-1;k>=i;k--)
				for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--)
		{
			for(int k=i;k<=4;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
/*
 	     *
 	    * *
 	   * * * 
 	  * * * *
 	 * * * * *
 	  * * * *
 	   * * * 
 		* *
 		 * 
*/
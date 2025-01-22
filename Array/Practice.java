package Array;

public class Practice 
{
	public static void main(String[] args)
	{
		int arr[]={25,0,35,0,45,0};
		
		for(int i=0;i<arr.length;i++)
		{
			if(i%2!=0)
			{
				arr[i]=arr[i-1]*(2);
			}
			System.out.print(arr[i]+" ");
		}
	}
}

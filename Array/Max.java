package Array;

public class Max {

	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,90,40,50};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}

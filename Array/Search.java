package Array;

public class Search {

	public static void main(String[] args)
	{
		int arr[]= {20,30,40,50,60,70,60};
		int target=60;
		int found=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				found=i;
				System.out.println("Element found at element " +found);
				return;
			}
		}
		if(found==-1)
		{
			System.out.println("Element not found");
		}
		
	}

}

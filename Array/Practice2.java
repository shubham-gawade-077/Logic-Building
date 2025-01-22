package Array;

public class Practice2 {

	public static void main(String[] args) 
	{
		int arr[]= {20,25,10,15,40,35,55,50};
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(i%2==0)
			{
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			
			System.out.print(arr[i]+" ");
		}
	}

}

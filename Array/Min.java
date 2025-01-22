package Array;

public class Min {

	public static void main(String[] args) 
	{
		int arr[]={30,20,40,50,70,10,60};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println(min);
	}

}

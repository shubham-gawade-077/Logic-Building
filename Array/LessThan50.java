package Array;

public class LessThan50 {

	public static void main(String[] args) 
	{
		int arr[]= {5,30,60,60,90,50,40,20,25};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<50)
			{
				System.out.println(arr[i]);
			}
		}
	}

}

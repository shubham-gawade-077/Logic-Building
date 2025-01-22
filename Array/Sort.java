package Array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) 
	{
		int arr[]= {20,40,60,30,10,50};
		System.out.println("Original Array:");
		for(int num:arr)
		{
			System.out.print(num+" ");
		}
		//sort array by method
		System.out.println("\n\nsorted Array by method:");
		Arrays.sort(arr);
		for(int num:arr)
		{
			System.out.print(num+" ");
		}
		//sort array by logic
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				count++;
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("\n\nSorted Array by logic:");
		for(int num:arr)
		{
			System.out.print(num+" ");
		}
		System.out.println("\ncount="+count);
	}

}

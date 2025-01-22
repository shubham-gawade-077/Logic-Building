package Array;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter array element");
		for(int a=0;a<arr.length;a++)
		{
			arr[a]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int num:arr)
		{
			System.out.print(num+" ");
		}
		int s=0;
		int e=arr.length-1;
		int m=(s+e)/2;
		System.out.println("\nEnter target");
		int target=sc.nextInt();
		int flag=-1;
		while(s<=e)
		{
			if(arr[m]==target)
			{
				flag=m;
				System.out.println("\n\nElement found at index :"+flag);
				System.out.println("\nElement found at position :"+(flag+1));
				break;
			}
			else if(arr[m]<target)
			{
				s=m+1;
			}
			else
			{
				e=m-1;
			}
			m=(s+e)/2;
		}
		if(flag==-1)
		{
			System.out.println("\nElement not found in array");
		}
	}

}

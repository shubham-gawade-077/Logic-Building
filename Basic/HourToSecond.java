package Basic;

import java.util.Scanner;

public class HourToSecond {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter hour");
		int h=sc.nextInt();
		
		System.out.println("enter minute");
		int m=sc.nextInt();
		
		System.out.println("enter second");
		int s=sc.nextInt();
		
		int second=(h*3600)+(m*60)+s;
		
		System.out.println("Total second = "+second);
				
		
		
	}

}

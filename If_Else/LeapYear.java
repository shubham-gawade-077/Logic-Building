package If_Else;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int n=sc.nextInt();

		if(n%4==0)
		{
			System.out.println(n+" is leap year");
		}
		else {
			System.out.println(n+"  is not leap year");
		}

	}

}

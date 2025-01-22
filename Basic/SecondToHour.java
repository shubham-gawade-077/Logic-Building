package Basic;

import java.util.Scanner;

public class SecondToHour {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the second");
		int second=sc.nextInt(); 
		int h=second/3600;
		int a=second%3600;
		int m=a/60;
		int s=a%60;
		System.out.println("hour = "+h+", minute = "+m+" ,second= "+s);

	}

}

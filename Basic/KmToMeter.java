package Basic;

import java.util.Scanner;

public class KmToMeter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the km");
		double km=sc.nextDouble(); 
		double m=km*1000;
		System.out.println("meter = "+m);
		
	}

}

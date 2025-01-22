package Basic;

import java.util.Scanner;

public class MeterToKm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the meter");
		int meter=sc.nextInt(); 
		int km=meter/1000;
		int m=meter%1000;
		System.out.println("km = "+km+", m ="+m);

	}

}

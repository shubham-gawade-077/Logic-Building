package Basic;

import java.util.Scanner;

public class LitreToMili {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the litre");
		double l=sc.nextDouble(); 
		double ml=l*1000;
		
		System.out.println("mili litre = "+ml);
	}

}

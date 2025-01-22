package Basic;

import java.util.Scanner;

public class MiliToLMl {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mili litre");
		int mili=sc.nextInt(); 
		int l=mili/1000;
		int ml=mili%1000;
		
		System.out.println("litre = "+l+" ,mili liter ="+ml);

	}

}

package Basic;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		double HRA;
		double TA;
		double DA ;
		double tax;
		double GS;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Basic Salary");
		double bs=sc.nextDouble();
		
		HRA=bs*0.40;
		TA=bs*0.50;
		DA=bs*0.60;
		tax=bs*0.05;
		
		GS=(bs+HRA+TA+DA)-tax;
		System.out.println("basic salary : "+bs);
		System.out.println("HRA : "+HRA);
		System.out.println("TA : "+TA);
		System.out.println("DA : "+DA);
		System.out.println("tax : "+tax);
		System.out.println("Gross salary : "+GS);
	}

}

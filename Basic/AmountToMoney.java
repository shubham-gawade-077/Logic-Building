package Basic;

import java.util.Scanner;

public class AmountToMoney {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		int rs=sc.nextInt(); //1888
		
		int a=rs/500;
		int b=rs%500;
		int c=b/200;
		int d=b%200;
		int e=d/100;
		int f=d%100;
		int g=f/50;
		int h=f%50;
		int i=h/20;
		int j=h%20;
		int k=j/10;
		int l=j%10;
		int m=l/5;
		int n=l%5;
		int o=n/2;
		int p=n%2;
		int q=p/1;
		
		System.out.println("500 * "+a+"="+a*500);
		System.out.println("200 * "+c+"="+c*200);
		System.out.println("100 * "+e+"="+e*100);
		System.out.println("50 * "+g+"="+g*50);
		System.out.println("20 * "+i+"="+i*20);
		System.out.println("10 * "+k+"="+k*10);
		System.out.println("5 * "+m+"="+m*5);
		System.out.println("2 * "+o+"="+o*2);
		System.out.println("1 * "+q+"="+q*1);
	}

}

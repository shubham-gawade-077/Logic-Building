package Continue;

import java.util.Scanner;

public class GCD_LCM {
	public static void main(String[] args) 
	{
		int n;
		int gcd=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a");
		int a=sc.nextInt();
		
		System.out.println("Enter the b");
		int b=sc.nextInt();
		
		if(a<b)
		{
			n=a;
		}
		else
		{
			n=b;
		}
		for(int i=1;i<=n;i++)
		{
			if(a%i!=0)
			{
				continue;
			}
			if(b%i!=0)
			{
				continue;
			}
			gcd=i;
		}
		int lcm=(a*b)/gcd;
		System.out.println("GCD="+gcd+" LCM="+lcm);
	}
	

}

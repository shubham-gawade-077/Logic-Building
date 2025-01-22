package String;

public class Demo {

	public static void main(String[] args)
	{
		String name="AthArvA";
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				System.out.println((char)(ch+32));
			}
			else if(ch>='a' && ch<='z')
			{
				System.out.println((char)(ch-32));
			}
			else
			{
				System.out.println(ch);
			}
		}
	}

}

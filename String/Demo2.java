package String;

public class Demo2 {

	public static void main(String[] args)
	{
		String name="AthArvA";
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			if(Character.isUpperCase(ch))
			{
				System.out.println(Character.toLowerCase(ch));
			}
			else if(Character.isLowerCase(ch))
			{
				System.out.println(Character.toUpperCase(ch));
			}
			else
			{
				System.out.println(ch);
			}
		}
	}

}

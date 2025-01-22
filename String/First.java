package String;

public class First {

	public static void main(String[] args) 
	{
		//String s1=new String("Hello");
		String s1="Shubham";
		String s2="shubham";
		
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		System.out.println("length = "+s2.length());
		System.out.println("char at index 1 = "+s2.charAt(1));
		System.out.println("s1 concat s2 = "+s1.concat(" ").concat(s2));
		System.out.println("s1 is equal to s2 = "+s1.equals(s2));
		System.out.println("s1 is equal to s2 = "+s1.equalsIgnoreCase(s2));
		System.out.println("substring = "+s1.substring(2,s2.length()));
		System.out.println("replace = "+s1.replace("bh","gh"));
		System.out.println("original = "+s1);
		System.out.println("contains = "+s1.contains("h"));
	}

}

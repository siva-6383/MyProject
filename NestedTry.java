package Teleapps;

public class NestedTry {
	public static void main(String[] args) {
		try
		{
			String str = "java program";
			System.out.println(str.charAt(2));				
			try
			{
				String s = "java";
				s = null;
				System.out.println("length of the string = "+s.length());
			}
			catch(NullPointerException e)		
			{
				System.out.println("Given string is null so can't find the length of the string");
			}
		}
		catch(StringIndexOutOfBoundsException e1)
		{
			System.out.println("length is out of the given string");
		}
		
	}
}

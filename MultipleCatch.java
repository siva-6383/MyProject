package Teleapps;

public class MultipleCatch {
	public static void main(String[] args) {
		try 
		{
			int a = 50, b = 20;
			System.out.println("Division = "+a/b);
			String s = "java";
			System.out.println("Given String = "+s);
			s = null;
			System.out.println("length of the string = "+s.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Any number can't divide by zero");
		}
		catch(NullPointerException e1)
		{
			System.out.println("String value is null can't find the length of the string");
		}
	}
}

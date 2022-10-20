package Teleapps;

public class ExceptionEx {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		try 
		{
			System.out.println("Division of two numbers : "+(a/b));
		}
		catch(Exception e) 
		{
			e.printStackTrace();
			System.out.println(e.toString());
	
		}
	}
}

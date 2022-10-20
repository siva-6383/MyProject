package Teleapps;

public class TryAndFinally {
	
	public static int addition() {
		try {
			int a = 10, b = 0;
			int c;
			System.out.println("Exception before");
			System.out.println("Addition = "+(a+b));	
			return c = a/b;
	    }
		finally
		{
			System.out.println("Finally block will always excute");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Division = "+addition());
	}
}

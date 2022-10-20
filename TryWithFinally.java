package Teleapps;

public class TryWithFinally {
	
	public static int dummy() {
		
		try {
			System.out.println("This is try block");
			return 100;
		}
		finally
		{
			System.out.println("Finally will always excuted");
		}
		
	}
	public static void main(String[] args) {
		System.out.println(dummy());
	}
}

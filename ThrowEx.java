package Teleapps;

public class ThrowEx {

	public static void validate(int age) {
		try {
			if (age < 18) {
				throw new ArithmeticException("Person is not eligible to vote");
			} else {
				System.out.println("Person is eligible to vote!!");
			}
		}

		finally {
			System.out.println("finally");
		}
	}

	public static void main(String args[]) {

		validate(13);
		System.out.println("rest of the code...");
	}

}                                   

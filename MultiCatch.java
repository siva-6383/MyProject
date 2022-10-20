package Teleapps;

import java.util.*;

public class MultiCatch {
	public static void main(String[] args) {

		int x, y;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter your first number");
			x = Integer.parseInt(sc.nextLine());
			System.out.println("Enter your second number");
			y = Integer.parseInt(sc.nextLine());

			int z = x / y;
			System.out.println("z = " + z);
		} catch (RuntimeException re) {
			System.out.println("Exception thrown: " + re);
		}
//		catch(ArithmeticException ae) 
//		{ 
//		 	System.out.println("Exception thrown: " +ae); 
//		} 
//		catch(NumberFormatException nfe) 
//		{ 
//		 	System.out.println("Exception thrown: " +nfe); 
//		 }

	}

}

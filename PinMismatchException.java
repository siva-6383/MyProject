package Teleapps;

import java.util.Scanner;

public class PinMismatchException extends Exception {
	public static void pin() throws PinMismatchException {
		Scanner sc = new Scanner(System.in);

		int pass[] = {1234, 5678, 1345, 1456 };
		System.out.println("Enter the pin");
		int pinNum = sc.nextInt();

		for (int i = 0; i < pass.length; i++) {

			if (pass[i] == pinNum) {
				System.out.println("Password accepted");
				break;
			} else if (i == pass.length - 1) {
				throw new PinMismatchException();
			}
		}

	}
}

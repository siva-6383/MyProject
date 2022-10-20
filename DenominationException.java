package Teleapps;

import java.util.Scanner;

public class DenominationException extends Exception {
	public static void denomination() throws DenominationException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Available Cash : 1.2000 2.500");
		int cash = sc.nextInt();
		if (cash == 2000 || cash == 500) {
			System.out.println("Collect your cash");
		} else {
			throw new DenominationException();
		}

	}
}

package Teleapps;

import java.util.Scanner;

public class InsufficientFundException extends Exception {

	public static void fund() throws InsufficientFundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount");
		int amount = 10000;
		int money = sc.nextInt();
		if (money > amount) {
			throw new InsufficientFundException();

		} else if (money <= amount) {
			System.out.println("you take the amount");
		}
	}

}

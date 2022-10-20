package Calc;

import java.util.Scanner;

public class Atm {

	static int bank_bal = 10000;
	static Scanner s = new Scanner(System.in);

	public static void insert() {
		System.out.println("Insert the card");
		System.out.println("Welcome to SBI");
	}

	static void operation(int amt) {
		int min_amt = 2000;

		if (amt >= min_amt) {
			if (amt <= bank_bal) {
				amt = bank_bal - amt;
				System.out.println("Remaining amount : " + amt);
				System.out.println("Thank you! visit again!");
			} else {
				System.out.println("Your bank balance is low kindly check your bank balance");
			}
		} else {
			System.out.println("You do the fast cash operation you take the amount minimum  2000 \nThank you!");
		}
	}

	static void operation() {
		System.out.println("Your account balance : " + bank_bal);
		System.out.println("Enter the amount : ");
		int amt = s.nextInt();
		int min_amt = 100;

		if (amt >= min_amt) {
			if (amt <= bank_bal) {
				amt = bank_bal - amt;
				System.out.println("Remaining amount : " + amt);
				System.out.println("Thank you! visit again!");
			} else {
				System.out.println("Your bank balance is low kindly check your bank balance");
			}
		} else {
			System.out.println("You do the cash withdrawal operation you take the amount minimum  100 \nThank you!");
		}
	}

	public static void main(String[] args) {

		insert();
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose your language : \n 1.English \n 2.Tamil \n 3.Malayalam \n 4.Hindi");
		int lang = sc.nextInt();

		switch (lang) {
		case 1:
			System.out.println("You selected English");
			break;
		case 2:
			System.out.println("You selected Tamil");
			break;
		case 3:
			System.out.println("You selected Malayalam");
			break;
		case 4:
			System.out.println("You selected Hindi");
			break;
		}

		System.out.println("Enter the pin : ");
		int pin = sc.nextInt();
		if (1234 == pin) {
			System.out.println("Select the type of Transaction : \n 1.Fast cash \n 2.Withdraw");
			int opt = sc.nextInt();

			if (opt == 1) {
				System.out.println("Your account balance : " + bank_bal);
				System.out.println("Enter the amount : ");
				int amt = sc.nextInt();
				operation(amt);
			} else if (opt == 2) {
				operation();
			}
		} else {
			System.out.println("Incorrect pin");
		}
	}

}

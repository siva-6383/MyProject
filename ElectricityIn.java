package Teleapps;

import java.util.*;

public class ElectricityIn implements Re, Comm {

	public void residential(char c, int unit) {
		double bill;
		if ('p' == c) {
			if (unit > 0 && unit <= 100) {
				System.out.println("you don't need to pay the amount");
			} else if (unit > 100 && unit <= 200) {
				bill = 100 * 1.2 + (unit - 100) * 2;
				System.out.println("your amount = " + bill);

			} else if (unit > 200 && unit <= 300) {
				bill = 100 * 1.2 + 200 * 2 + (unit - 200) * 3;
				System.out.println("Your amount = " + bill);
			} else {
				System.out.println("Enter the valid units");
			}
		} else if ('r' == c) {
			if (unit > 0 && unit <= 100) {
				System.out.println("you don't need to pay the amount");
			} else if (unit > 100 && unit <= 200) {
				bill = 100 * 2 + (unit - 100) * 3;
				System.out.println("your amount = " + bill);

			} else if (unit > 200 && unit <= 300) {
				bill = 100 * 2 + 200 * 3 + (unit - 200) * 4;
				System.out.println("your amount = " + bill);
			} else {
				System.out.println("Enter the valid units");
			}

		} else if ('u' == c) {
			if (unit > 0 && unit <= 100) {
				System.out.println("you don't need to pay the amount");
			} else if (unit > 100 && unit <= 200) {
				bill = 100 * 3 + (unit - 100) * 4;
				System.out.println("your amount = " + bill);

			} else if (unit > 200 && unit <= 300) {
				bill = 100 * 3 + 200 * 4 + (unit - 300) * 5;
				System.out.println("your amount = " + bill);
			} else {
				System.out.println("Enter the valid units");
			}

		} else if ('m' == c) {
			if (unit > 0 && unit <= 100) {
				System.out.println("you don't need to pay the amount");
			} else if (unit > 100 && unit <= 200) {
				bill = 100 * 4 + (unit - 100) * 5;
				System.out.println("your amount = " + bill);

			} else if (unit > 200 && unit <= 300) {
				bill = 100 * 4 + 200 * 5 + (unit - 200) * 6;
				System.out.println("your amount = " + bill);
			} else {
				System.out.println("Enter the valid units");
			}

		}
	}

	public void commercial(char c, int unit) {
		double bill;

		if ('p' == c) {
			if (unit > 0 && unit <= 100) {
				System.out.println("you don't need to pay the amount");
			} else if (unit > 100 && unit <= 200) {
				bill = 100 * 2 + (unit - 100) * 3;
				System.out.println("your amount = " + bill);

			} else if (unit > 200 && unit <= 300) {
				bill = 100 * 2 + 200 * 3 + (unit - 300) * 4;
				System.out.println("your amount = " + bill);
			} else {
				System.out.println("Enter the valid units");
			}

		} else if ('r' == c) {
			if (unit > 0 && unit <= 100) {
				System.out.println("you don't need to pay the amount");
			} else if (unit > 100 && unit <= 200) {
				bill = 100 * 3 + (unit - 100) * 4;
				System.out.println("your amount = " + bill);

			} else if (unit > 200 && unit <= 300) {
				bill = 100 * 3 + 200 * 4 + (unit - 300) * 5;
				System.out.println("your amount = " + bill);
			} else {
				System.out.println("Enter the valid units");
			}
		} else if ('u' == c) {
			if (unit > 0 && unit <= 100) {
				System.out.println("you don't need to pay the amount");
			} else if (unit > 100 && unit <= 200) {
				bill = 100 * 4 + (unit - 100) * 5;
				System.out.println("your amount = " + bill);

			} else if (unit > 200 && unit <= 300) {
				bill = 100 * 4 + 200 * 5 + (unit - 300) * 6;
				System.out.println("your amount = " + bill);
			} else {
				System.out.println("Enter the valid units");
			}
		} else if ('m' == c) {
			if (unit > 0 && unit <= 100) {
				System.out.println("you don't need to pay the amount");
			} else if (unit > 100 && unit <= 200) {
				bill = 100 * 5 + (unit - 100) * 6;
				System.out.println("your amount = " + bill);

			} else if (unit > 200 && unit <= 300) {
				bill = 100 * 5 + 200 * 6 + (unit - 300) * 7;
				System.out.println("your amount = " + bill);
			} else {
				System.out.println("Enter the valid units");
			}
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Press 1-Residential payment or Press 2-commercial payment : ");
		int n = s.nextInt();
		System.out.println(
				"Select the payment option in below list : \n Panchayat - p\n Rural - r\n Urban - u\n Metropolitan - m");
		char ch = s.next().charAt(0);
		ElectricityIn e = new ElectricityIn();
		System.out.println("Enter the units : ");
		int unit = s.nextInt();

		if (n == 1) {
			e.residential(ch, unit);
		} else if (n == 2) {
			e.commercial(ch, unit);
		}

	}

}

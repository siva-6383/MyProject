package Teleapps;

import java.util.*;

class FreePayment {

	public void freeUnit(int unit) {

		if (unit > 0 && unit <= 100)
			System.out.println("you don't need to pay the bill amount ");
	}

	class Payment {
		double price;

		public void paymentUnit(int unit) {
			if (unit > 100 && unit <= 200) {
				price = 100;
				System.out.println("your EB Amount : " + (price * unit));
			} else if (unit > 200 && unit <= 300) {
				price = 200;
				System.out.println("your EB Amount : " + (price * unit));
			} else if (unit > 300 && unit <= 400) {
				price = 300;
				System.out.println("your EB Amount : " + (price * unit));
			} else if (unit > 400 && unit <= 500) {
				price = 400;
				System.out.println("your EB Amount : " + (price * unit));
			} else if (unit > 500 && unit <= 600) {
				price = 500;
				System.out.println("your EB Amount : " + (price * unit));
			} else if(unit>600){
				System.out.println("Enter the valid units");
			}
		}

	}
}

public class Electricitybill {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the units : ");
		int unit = s.nextInt();
		FreePayment f = new FreePayment();
		f.freeUnit(unit);
		FreePayment.Payment p = f.new Payment();
		p.paymentUnit(unit);

	}

}

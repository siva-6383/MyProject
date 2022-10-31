package Teleapps;

abstract class Amazon
{
	abstract void product();
}

class Customer extends Amazon 
{
	void product() {
		System.out.println("you get the product directly");
	}
}

class Seller extends Amazon
{
	void product() {
		System.out.println("you get the product through seller");
	}
}

public class Sample {
	public static void main(String[] args) {
		Amazon obj;
		obj = new Seller();
		obj = new Customer();

		obj.product();
	}
}

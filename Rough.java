package Teleapps;

class Sample1 {
	static int a, b;

	Sample1(int a, int b) {
		this.a = a;
		this.b = b;
	}
}

public class Rough {

//	public String toString()
//	{
//	    return getClass().getName() + "@" + Integer.toHexString(hashCode());
//	}

	public static void main(String[] args) {

		int n = 10, n1 = 20;
		String s = "hello";
		Rough r = new Rough();
		System.out.println(r);
		System.out.println(r.toString());

		Sample1 s1 = new Sample1(10, 15);
		Sample1 s2 = new Sample1(10, 15);
		System.out.println(s1);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		Object o = new Rough();
		Class c = o.getClass();
		System.out.println("The class name is " + c.getName());

		Rough rou = new Rough();

		rou = null;

		System.gc();

		System.out.println("Garbage collected");

	}

	@Override
	protected void finalize() {
		System.out.println("finalize method called");
	}
}

package core;

public class Operator {
	/*void arithemetic(int a,int b) {
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a*b);
		System.out.println("break");
	}
	void assignment(int a,int b)
	{
		System.out.println(a=b);
	    System.out.println(a+=b);
		System.out.println(a=+b);
		System.out.println(a*=b);
		System.out.println(a/=b);
		System.out.println(a%=b);
		System.out.println("break");
		
	}
	void logical(int a, int b) {
		System.out.println((a>2) && (a<3));
		System.out.println((a>2) || (a<3));
		System.out.println(!(a<3));
		System.out.println("break");

	}*/
	void shift(int a,int b) {
		//System.out.println(a>>b);
		System.out.println(a<<b);
		//System.out.println(a>>>b);
		
		
		
		System.out.println("break");
        
	}

	public static void main(String[] args) {
		Operator obj=new Operator();
	//	obj.arithemetic(10,2 );
		//obj.assignment(10, 2);
	//	obj.logical(12, 11);
		obj.shift(2, 3);
		
		
   
	}

}

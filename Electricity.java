package Teleapps;

import java.util.Scanner;

class outerclass{
	public void freepayment(int unit) {
		if(unit<=100) {
		System.out.println("free payment");
	}
	
	
}
class innerclass{
	double billpay;
	public void payment(int unit){
		if(unit>100 && unit<=200) {
			billpay=100*1.20+(unit-100)*2;
			System.out.println(billpay);
		}
		else if(unit>=200 && unit<300) {
			billpay=100*1.20+200*2+(unit-300)*3;
			System.out.println(billpay);
		}
			
		}
	}
		
			
	
}
public class Electricity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the unit");
int unit=sc.nextInt();
double billpay=0;
outerclass obj=new outerclass();
obj.freepayment(unit);
outerclass.innerclass pay=obj.new innerclass();
pay.payment(unit);;
}

}

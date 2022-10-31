package methods;

import java.util.Scanner;

public class Example12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements");
		int n=sc.nextInt();
		
		// TODO Auto-generated method stub
		int rem,sum=0;
         int temp=n;
         while(n>0) {
        	 rem=n%10;
        	 sum=sum+(rem*rem*rem);
        	 n=n/10;
         }
         if(temp==sum) {
        	 System.out.println("it is amstrong");
         }
         else {
        	 System.out.println("not is amstrong");
         }
		
		

	}

}

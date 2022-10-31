package Teleapps;

import java.util.Scanner;

public class Numbertowords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the num");
	int n=sc.nextInt();	
	int a=n%10;//last digit
		int b=n/10;//
		int c=b%10;//middle
		int d=n/100;//first
	
	String[] single= {" ","one","two","three","four","five","six","seven","eight","nine","Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

    
    String[] twod={"",  "ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};  
    String hundred1= "hundred";
    if(n<20) {
    	System.out.println(single[n]);
    }
    else if(n<100) {
    	System.out.println(twod[c] + " "+single[a]);
    	
    }
    else if(n==100) {
    	System.out.println(hundred1);
    	
    }
    else if(n<999) {
    	System.out.println(single[d]+" "+hundred1+" "+twod[c]+" "+single[a]);
    }
	}

}

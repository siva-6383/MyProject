package inheritance;

import java.util.Scanner;

public class Speed extends Gear {

	public static void main(String[] args) {
		
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the gear level : ");
				int gear=sc.nextInt();
				Speed sp=new Speed();
				sp.calc(gear);
				 System.out.println("your need to apply the brake - y or n");
				 char c=sc.next().charAt(0);
				 char ch='y';
				 if(ch==c) {
					 gear=gear-1;
					 sp.calc(gear);
				 }
			}
		
		
	}



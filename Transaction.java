package Calc;

import java.util.*;

public class Transaction extends Atm {
	
	

	public static void main(String[] args) {
		
		Atm a = new Atm();
		a.insert();
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose your language : \n 1.English \n 2.Tamil \n 3.Malayalam \n 4.Hindi");
		int lang = sc.nextInt();
		
		switch(lang) {
			case 1 :
				System.out.println("You selected English");
				break;
			case 2 :
				System.out.println("You selected Tamil");
				break;
			case 3 :
				System.out.println("You selected Malayalam");
				break;
			case 4 :
				System.out.println("You selected Hindi");
				break;
			
		}
		
		System.out.println("Enter the pin : ");
		int pin = sc.nextInt();
		if(1234 == pin)
		{
			System.out.println("Select the type of Transaction : \n 1.Fast cash \n 2.Withdraw");
			int opt = sc.nextInt();
			
			
			
			if(opt == 1)
			{
				
				a.fastCash();
			}
			else if(opt == 2)
			{
				a.withdraw();
			}
		}
		else 
		{
			System.out.println("Incorrect pin");
		}
	}

}

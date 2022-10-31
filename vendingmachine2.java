package Teleapps;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class vendingmachine2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer>si=new HashMap<String,Integer>();
		si.put("biscuit", 15);
		si.put("cake", 20);
		si.put("ice", 45);
		si.put("cream", 50);
		si.put("dairy", 55);
		si.put("milk", 26);
		System.out.println(si);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount:");
		int amount=sc.nextInt();
		if(amount<15) {
			System.out.println("insufficent amount");
		}
		else {
			System.out.println("product under your amount");
			for(Entry<String, Integer>entry:si.entrySet()){
				if(entry.getValue()<=amount) {
					System.out.println(entry);
					
				}
				}
			}
		Scanner st=new Scanner(System.in);
		System.out.println("Enter the product do you want buy:");
		String name=st.nextLine();
		for(Entry<String, Integer>entry:si.entrySet()){
			if(entry.getKey().equalsIgnoreCase(name)) {
				System.out.println(entry.getKey()+" " +entry.getValue());
				int balance=amount-si.get(name);
				System.out.println("your wallet balance:"+balance);
			}
				
			}
				

	}

}

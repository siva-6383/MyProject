package Teleapps;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class vending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer>so=new HashMap<String,Integer>();
		so.put("kitkat",15);
		so.put("munch",10);
		so.put("lays", 5);
		so.put("maaza", 45);
    	so.put("burfi", 30);
    	System.out.println(so);
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the amount");
    	int rupees=sc.nextInt();
    	if(rupees<5) {
    		System.out.println("not Sufficint amount");
    	}
    	else {
    		System.out.println("product under your amount");
    		for(Entry<String,Integer>entry:so.entrySet()) {
            if(entry.getValue()<=rupees) {
            	System.out.println(entry);
            }
            	
            }
    	
    	}
    	Scanner st=new Scanner(System.in);
    	System.out.println("Enter the product do you want to buy" );
    	String name=st.nextLine();
    	
    	for(Entry<String,Integer>entry:so.entrySet()) {
            if(entry.getKey().equalsIgnoreCase(name)) {
            	System.out.println(entry.getKey() + " "+entry.getValue());
            	int balance=rupees-so.get(name);
            	System.out.println("the balance amount is"+balance);
            	
            }
            
    	
    	
    	

	}

}

	}

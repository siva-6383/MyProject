package Teleapps;


import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
public class vendingmachine {

	public static void main(String[] args) {
		HashMap<String,Integer>map=new HashMap<String,Integer>();
		map.put("kitkat",15);
		map.put("munch",10);
		map.put("lays", 5);
		map.put("maaza", 45);
		map.put("burfi", 30);
		System.out.println(map);
		Scanner st=new Scanner(System.in);
		System.out.println("Enter the amount:");
		int product=st.nextInt();
		if(product<5) {
		System.out.println("Not sufficient amount");
		}
		else {
			System.out.println("product under your amount");
		
			for(Entry<String,Integer>entry:map.entrySet()) {
				if(entry.getValue()<=product) {
					System.out.println(entry);
					
				}
			}
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the product you want buy:");
		
			String name=sc.nextLine();
			for(Entry<String,Integer>entry:map.entrySet()) {
				if(entry.getKey().equalsIgnoreCase(name) )
						{
					System.out.println(entry.getKey()+" "+entry.getValue());
					int balance=product-map.get(name);
					System.out.println("your wallet balance is "+" "+balance);
					
						}
				
				
			
			
		}
		

		}
		System.out.println("Thank you for purchasing");
	}

}

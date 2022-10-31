package Teleapps;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]str= {"sivass","sowmi","gokul","hari"};
		System.out.println("Enter the name");
		Scanner sc=new Scanner(System.in);
		
		String name=sc.nextLine();
		for(int i=0;i<str.length;i++) {
			if(str[i].contains(name)) {	
				System.out.println(str[i].formatted(str));
			}
		}
	}
}
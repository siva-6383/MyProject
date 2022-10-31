package Teleapps;

import java.io.*;
public class Employee1 {
	int id,salary;
	String name;
	void set() throws IOException {
		BufferedReader BR=new BufferedReader(new InputStreamReader(System.in));
		String s=BR.readLine();
		System.out.println("Enter the id");
		id=Integer.parseInt(s);
		System.out.println("Enter the name");
		name=BR.readLine();
		System.out.println("Enter the salary");
		
		salary=Integer.parseInt(s);
		
		
		
	}
	void show() {
		System.out.println("id" + " " + id); 
		System.out.println("name" + " " +name); 
		System.out.println("Salary" + " " + salary); 
         

}
	public static void main(String[]args) throws IOException {
		Employee1[] emp=new Employee1[3];
		for(int i=0;i<3;i++) {
			emp[i]=new Employee1();
			emp[i].set();
		}
		for(int i=0;i<3;i++) {
			emp[i].show();
		}
			
		}
	}

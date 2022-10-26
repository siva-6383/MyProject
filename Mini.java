package teleapps;

import java.util.ArrayList;
import java.util.Scanner;



class Texto {
	private int id;
	private String name;
	private int Salary;
	private String profession;
	private int Exp;

	Texto(int id,String name,int salary,String profession,int Exp){
		this.id=id;
		this.name=name;
		this.Salary=salary;
		this.profession=profession;
		this.Exp=Exp;
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public int getExp() {
		return Exp;
	}

	public void setExp(int exp) {
		Exp = exp;
	}

}

public class Mini {
	static ArrayList<Texto> list = new ArrayList<>();

	static Scanner sc = new Scanner(System.in);

	static void fresher() {
		double basicSalary, hra, Fa, Ta, PF, netSalary, Lpa = 0, tax;

		basicSalary = 10000;
		hra = basicSalary * 0.1;
		Fa = basicSalary * 0.4;
		Ta = basicSalary * 0.2;
		PF = basicSalary * 0.1;
		netSalary = basicSalary + hra + Fa + Ta - PF;

		Lpa = netSalary * 12;
		System.out.println("The Basic salary is:" + basicSalary);
		System.out.println("The HRA is:" + hra);
		System.out.println("The FA is:" + Fa);
		System.out.println("The TA is:" + Ta);
		System.out.println("The PF is:" + PF);
		System.out.println("The net salary is:" + netSalary);
		System.out.println("Lack per annum is::" + Lpa);

		if (Lpa < 300000) {
			System.out.println("No Tax");
		} else if (Lpa > 300000) {
			tax = 0.10 * Lpa;
			System.out.println("your tax amount:" + tax);
		}

	}

	static void experience1() {
		double basicSalary, hra, Fa, Ta, PF, netSalary, Lpa = 0, tax;
		basicSalary = 20000;
		hra = basicSalary * 0.2;
		Fa = basicSalary * 0.5;
		Ta = basicSalary * 0.3;
		PF = basicSalary * 0.2;
		netSalary = basicSalary + hra + Fa + Ta - PF;
		Lpa = netSalary * 12;
		System.out.println("The Basic salary is:" + basicSalary);
		System.out.println("The HRA is:" + hra);
		System.out.println("The FA is:" + Fa);
		System.out.println("The TA is:" + Ta);
		System.out.println("The PF is:" + PF);
		System.out.println("The net salary is:" + netSalary);
		System.out.println("Lack per annum is::" + Lpa);

		if (Lpa < 300000) {
			System.out.println("No Tax");
		} else if (Lpa > 300000) {
			tax = 0.10 * Lpa;
			System.out.println("your tax amount:" + tax);

		}

	}

	static void experience2() {
		double basicSalary, hra, Fa, Ta, PF, netSalary, Lpa = 0, tax;
		basicSalary = 30000;
		hra = basicSalary * 0.3;
		Fa = basicSalary * 0.5;
		Ta = basicSalary * 0.4;
		PF = basicSalary * 0.3;
		netSalary = basicSalary + hra + Fa + Ta - PF;
		Lpa = netSalary * 12;
		System.out.println("The Basic salary is:" + basicSalary);
		System.out.println("The HRA is:" + hra);
		System.out.println("The FA is:" + Fa);
		System.out.println("The TA is:" + Ta);
		System.out.println("The PF is:" + PF);
		System.out.println("The net salary is:" + netSalary);
		System.out.println("Lack per annum is::" + Lpa);

		if (Lpa < 300000) {
			System.out.println("No Tax");
		} else if (Lpa > 300000) {
			tax = 0.10 * Lpa; 
			System.out.println("your tax amount:" + tax);
		}
	}

	static void experience3() {
		double basicSalary, hra, Fa, Ta, PF, netSalary, Lpa = 0, tax;
		basicSalary = 40000;
		hra = basicSalary * 0.1;
		Fa = basicSalary * 0.5;
		Ta = basicSalary * 0.3;
		PF = basicSalary * 0.4;
		netSalary = basicSalary + hra + Fa + Ta - PF;
		Lpa = netSalary * 12;
		System.out.println("The Basic salary is:" + basicSalary);
		System.out.println("The HRA is:" + hra);
		System.out.println("The FA is:" + Fa);
		System.out.println("The TA is:" + Ta);
		System.out.println("The PF is:" + PF);
		System.out.println("The net salary is:" + netSalary);
		System.out.println("Lack per annum is::" + Lpa);

		if (Lpa < 300000) {
			System.out.println("No Tax");
		} else if (Lpa > 300000) {
			tax = 0.10 * Lpa;
			System.out.println("your tax amount:" + tax);
		}

	}

	public static void main(String[] args) {
		Texto s1=new Texto(101,"siva",10000,"traniee",1);
		Texto s2=new Texto(102,"sow",20000,"traniee",2);
		Texto s3=new Texto(103,"Hari",30000,"t:raniee",6);


		 list.add(s1);
		 list.add(s2);
		 list.add(s3);
		 
		 for(Texto obj : list)
		 {
			 if(obj.getClass() == Texto.class)
			 { 
				 
				 Texto sam = (Texto) obj;
				 System.out.println("\n id:"+sam.getId());
				 
				 System.out.println("\n name: "+sam.getName());
				 System.out.println("\n salary:"+sam.getSalary());
				 System.out.println("\n profession:"+sam.getProfession());
                 System.out.println("\n Experience:"+sam.getExp());
			 }
		 }
		


		System.out.println("\n Enter the id:");
		int id = sc.nextInt();
		System.out.println("Enter the name");
		String name = sc.next();
		System.out.println("enter the profession");
		String profession = sc.next();
		System.out.println("Enter the year of experience");
		int year = sc.nextInt();
		if(s1.getExp()==year) {
			 System.out.println("your salry details");

		if (year >= 0 && year <= 2) {
			fresher();
		} else if (year >= 2 && year <= 4) {
			experience1();
		} else if (year >= 4 && year <= 10) {
			experience2();
		} else if (year >= 10 && year <= 20) {
			experience3();
		}

	}
		
	}
}




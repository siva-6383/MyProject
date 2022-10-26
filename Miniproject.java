package teleapps;

import java.util.*;

class sample {
	private int id;
	private String name;
	private int Salary;
	private String profession;
	private int Exp;

	sample(int id,String name,int salary,String profession,int Exp){
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

public class Miniproject {
	static ArrayList<sample> list = new ArrayList<>();

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
		 sample s1=new sample(101,"siva",10000,"traniee",1);
		 list.add(s1);
		 for(int i=0; i<list.size(); i++)
		 {
			 System.out.println(list.get(i).toString());
		 }
		 System.out.println(s1.getId());
//		sample s2=new sample(102,"sowmi",20000,"supportEngineer",2);
//		sample s3=new sample(103,"Hari",30000,"Developer",3);
//		System.out.println(s2.getName());
//	    list.add(s1);
//	    list.add(s2);
//	    list.add(s3);
		 
//	    
//	    for(Object sa : list)
//	    {
//	    	System.out.println(sa);
//	    }

		System.out.println("Enter the id");
		int id = sc.nextInt();
		System.out.println("Enter the name");
		String name = sc.next();
		System.out.println("enter the profession");
		String profession = sc.next();
		System.out.println("Enter the year of experience");
		int year = sc.nextInt();
		if(s1.getExp()==year) {
			 System.out.println("your salary details");
		 

//		sample s1 = new sample();
//		sample s2 = new sample();
//		sample s3 = new sample();
//		s2.setId(id);
//		s2.setName(name);
//		s2.setProfession(profession);
//		s2.setExp(year);

//		list.add(s2);
//		System.out.println(s2);
//
//		System.out.println(s2.getName() + " salary details");

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

package Teleapps;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class GetInput implements Serializable {
	
	
	
	public static void main(String[] args) {
		System.out.println("Enter the string : ");
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
	
		
		try {
			FileOutputStream f = new FileOutputStream("C:\\abc.txt");
//			ObjectOutputStream obj = new ObjectOutputStream(f);
//			obj.writeChars(s);
			f.write(s);
			System.out.println("file creaed successfully");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

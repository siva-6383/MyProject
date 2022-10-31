package Teleapps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Fileexample {

	public static void main(String[] args) {
		try {
			FileInputStream f=new FileInputStream("E:\\FileOperations\\input.txt");
			int a=0;
			while((a=f.read())!=-1) {
		
			System.out.print((char)a);
			}
			f.close();
		}
			
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

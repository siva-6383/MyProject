package Teleapps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Filein {

	public static void main(String[] args) {
		FileOutputStream f;
		try {
			f = new FileOutputStream("E:\\FileOperations\\xyz.txt");
		
			f.write(65);
			f.close();
			System.out.println("file is created");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
		
		
	}
}	
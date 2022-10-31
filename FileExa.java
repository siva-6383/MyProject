package Teleapps;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileExa {
	public static void main(String[] args){
		
		
		try {
			FileOutputStream fo = new FileOutputStream("E:\\FileOperations\\abc.txt");
//			DataOutputStream d = new DataOutputStream(fo);
			String s = "Welcome to teleapps";
			
			byte [] b = s.getBytes();
			fo.write(b);
			System.out.println(Arrays.toString(b));
			fo.close();
			System.out.println("file successfully created");
		} catch (Exception e) {
			
//			e.printStackTrace();
			System.out.println(e);
			System.out.println("file not saved");
		}
	}
}

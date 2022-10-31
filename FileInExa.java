package Teleapps;

import java.io.FileInputStream;

public class FileInExa {
	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream("E:\\FileOperations\\abc.doc");
			int i = 0;

			while ((i = f.read()) != -1) {
				System.out.print((char) i);
			}
			f.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}

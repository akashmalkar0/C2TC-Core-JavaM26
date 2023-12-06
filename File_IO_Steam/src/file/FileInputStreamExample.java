package file;

import java.io.FileInputStream;

public class FileInputStreamExample {
// single character read
	public static void main(String[] args) {

		try {
			FileInputStream fin = new FileInputStream("D:\\my.txt");
			int i = fin.read();
			System.out.println((char)i);
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

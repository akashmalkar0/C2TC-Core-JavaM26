package file;

import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout = new FileOutputStream("D:\\my.txt");
			fout.write(65);
			fout.close();
			System.out.println("Success....");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

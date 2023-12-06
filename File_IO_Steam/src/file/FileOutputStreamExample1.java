package file;

import java.io.FileOutputStream;

public class FileOutputStreamExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout = new FileOutputStream("D:\\my1.txt");
			String s = "Welcome to java";
			byte b[] = s.getBytes();// converting String into byte array
			fout.write(b);
			System.out.println("Success....");
			fout.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}


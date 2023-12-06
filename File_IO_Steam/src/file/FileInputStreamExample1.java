package file;

import java.io.FileInputStream;

public class FileInputStreamExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin =new FileInputStream("D:\\my1.txt");
			int i = 0;
			while((i=fin.read())!=-1) {
				System.out.println((char)i);
			}
			fin.close();
		}catch(Exception e) {System.out.println(e);}

	}

}

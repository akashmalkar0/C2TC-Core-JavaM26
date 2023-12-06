package file;

import java.io.FileReader;
import java.io.Reader;
import java.nio.CharBuffer;

public class FileRead {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arry[] = new char[100];
		try {
//			create a reader using the FileReader
			Reader input = new FileReader("D:\\output.txt");
			
//			Check if reader is ready 
			System.out.println("Is data stream? "+input.read());
			
//			read characters
			input.read(arry);
			System.out.println("Data in the stream : ");
			System.out.println(arry);
			input.close();
		}catch(Exception e) {
			e.getStackTrace();
		}
	}

}

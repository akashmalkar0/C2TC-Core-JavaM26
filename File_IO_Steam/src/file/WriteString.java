package file;

import java.io.FileWriter;
import java.io.Writer;

public class WriteString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "This is the data in the output file";
		try {
//			Creates a writer using FileWriter
			Writer output = new FileWriter("D:\\output.txt");
//			Writes String to the file 
			output.write(data);
			output.close();
		} catch (Exception e) {
			e.getStackTrace();
		}

	}

}

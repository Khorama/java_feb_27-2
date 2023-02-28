package exceptionHandling;// check exception we have to put in "throws FileNotFoundException"

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Printer {
	
	public static void main(String[] args) throws FileNotFoundException {
		// Class object = new Class();
		File file = new File ("C:\\Users\\below\\OneDrive\\Desktop\\EZCODE\\Java\\Output.txt"); // where the file is present (its a folder that is made for saving files or wherever it will be saved)
		
		PrintWriter printWriter = new PrintWriter (file); // where the output is to be printed
		printWriter.print("Hello! It is Monday today"); // printWriter is used to save data in external drive
		printWriter.close();
	}

}

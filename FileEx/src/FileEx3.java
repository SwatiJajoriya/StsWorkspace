//Reading
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileEx3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the file name");
		String filename=sc.next();
		FileInputStream fi=new FileInputStream(filename);
		//if file is available it opens in write mode else it is going to create a new file.
		if(fi!=null) {
			System.out.println("file exits");
		}
		
		int i=0;
		                    //End of file
		while((i=fi.read())!=-1) {
			System.out.print((char)i);
		}


	}

	}



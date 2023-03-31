//Write
import java.util.*;

import java.io.*;

public class FileEx2 {
	
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the filename");
		String filename=sc.next();
		FileWriter fo=new FileWriter(filename,true);
		
		//if file is available it opens in write mode else it is going to create a new file.
		if(fo!=null) {
			System.out.println("file has been available");
		}
		System.out.println("enter data into the file");
		String inputofFile=sc.next()+sc.nextLine();
		System.out.println(inputofFile);
		//byte b[]=inputofFile.getBytes();
		fo.write(inputofFile);
		System.out.println("write opreation completed");
		fo.close();
	}

	}


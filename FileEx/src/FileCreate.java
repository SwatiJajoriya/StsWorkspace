
//create / add a file in a directory

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCreate {
	public static void main(String[] args) throws IOException  {
		String path="D:\\Files\\";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the file in the directory of "+path);
		String filename=sc.next();
		//File class
		File f=new File(path+filename);
		//create a new file
		boolean b=f.createNewFile();
		if(b!=true) {
			System.out.println("file not created");
		}
		else {
			System.out.println("file created in the path"  +path);
		}
		 

	}

}

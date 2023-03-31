//Copy the one file data to another file 

import java.util.*;
import java.io.*;

public class FileEx4 {
	public static void main(String[] args) throws IOException {
		 Scanner sc=new Scanner(System.in);
	        System.out.println("enter file name");
	        String filename=sc.next();
	        FileOutputStream fo = new FileOutputStream(filename);//abcd
	        if(fo!=null)
	        {
	            System.out.println("file has been created");
	            
	        }
	        System.out.println("enter data into the file");
	        String inputOfFile=sc.next()+sc.nextLine();
	        System.out.println(inputOfFile);
	        byte b[]= inputOfFile.getBytes();
	        fo.write(b);
	        System.out.println("write operation completed");
	        fo.close();
	        System.out.println("enter file name");
	        String filename1=sc.next();
	        FileInputStream fi = new FileInputStream(filename1);//abcd
	        System.out.println("enter file name");
	        String filename2=sc.next();//bcd
	        
	        FileOutputStream fo1 = new FileOutputStream(filename2);
	        int c;  
	          while ((c = fi.read()) != -1) {  
	           fo1.write(c);  
	          }  
	          System.out.println("Copy finish...");  
	          fi.close();
	          fo1.close();
	}
		
		
		
		
	}



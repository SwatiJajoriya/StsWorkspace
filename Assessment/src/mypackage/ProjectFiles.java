//* Created By Swati Jajoriya
//* Project Name: File Management

package mypackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ProjectFiles {
	
public static void main(String[] args) throws IOException {
	    int mn =-1;
	    
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
		System.out.println("Enter the choice\n 1.Display\n 2.Menu\n 3.Exit\n");
		int ch=sc.nextInt();
		String path="D:\\Files\\";
			
		switch(ch) {
		
		case 1:
		File f=new File(path);
		File filenames[]=f.listFiles();
		for(File ff: filenames) {
			System.out.println(ff.getName());
		}
		break;
		
		case 2:
			
			  do {
				  
		System.out.println("Select the Menu\n 2.1 Add\n 2.2 Delete\n 2.3 Search\n 2.4 Exit\n ");
		mn=sc.nextInt();
		
		
		       switch(mn) {
		     
		       case 1:
		    	  
		              System.out.println("Enter the file to be created in the directory of "+path);
		              String filename1=sc.next();
		              File f1=new File(path+filename1);
		              boolean b=f1.createNewFile();
		              if(b!=true) {
			          System.out.println("File not created \n");
		              }
		              else {
		      			System.out.println("File created in the given path \n");
		      		}
		      		break;
		            
		       case 2:
		   		System.out.println("Enter the file to delete in the directory of "+path);
		   		String filename2=sc.next();
		   		File f2=new File(path+filename2);
		   		boolean b1=f2.delete();
		   		if(b1==true) {
		   		System.out.println("File has been deleted \n");
		   		}
		   		else {
		   		System.out.println("File is not found/ cannot be deleted \n ");
		   		}
		   		break;
		   		
		       case 3:
		   		System.out.println("Enter the file to search in the directory of "+path);
		   		String filename3=sc.next();
		   		File f3=new File(path);
		   		File filenames1[]=f3.listFiles();
		   		int flag=0;
		   		for(File ff: filenames1) {
		   				if(ff.getName().equals(filename3)) {
		   					flag=1;
		   					break;
		   				}
		   				else {
		   					flag=0;
		   				}
		   			}	
		   			if(flag==1) {
		   				System.out.println("File is found \n");
		   			}
		   			else {
		   				System.out.println("File is not found \n");
		   			}
		            break;
		            
		       case 4:
		   	      System.out.println("Exit\n");
		   	      break;
		   	   
		       default: System.out.println("Check your choice.");
		       
		     }
			 } while(mn!=4);
		     
		       
		case 3: System.exit(0);
		        break;
		   
		default: System.out.println("Invalid Input ");
	   }
     }
   }	
}





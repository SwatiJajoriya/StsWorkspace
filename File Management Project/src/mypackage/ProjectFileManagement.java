package mypackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class ProjectFileManagement {

	public static void main(String[] args) throws IOException {

		System.out.println("Project Name: LockedMe.com\nDeveloper Name: Swati Jajoriya\n");



		while(true) {

			System.out.println("Main Menu\n 1.Display the existing Files\n 2.Submenu\n 3.Exit\n");
			Scanner sc=new Scanner(System.in);
			int ch=sc.nextInt();
			System.out.println(ch);
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

				boolean value=true;
				while (value) { 

					System.out.println("Select the Submenu\n 2.1 Add & Write\n 2.2 Delete\n 2.3 Search\n 2.4 Go to the Main Menu \n ");
					int mn=sc.nextInt();

					switch(mn) {

					case 1:

						System.out.println("Enter the file to be created in the directory of "+path);
						String filename1=sc.next();
						File f1=new File(path+filename1);
						boolean b=f1.createNewFile();
						FileOutputStream fo=new FileOutputStream(f1,true);

						if(b!=true) {
							System.out.println("File not created.it already exist.\n");
						}
						else {
							System.out.println("File created in the given path.\n");

							// To write in the file.
							System.out.println("Enter data into the file \n");
							String inputofFile=sc.next()+sc.nextLine();
							System.out.println(inputofFile);
							byte b1[]=inputofFile.getBytes();
							fo.write(b1);
							System.out.println("write opreation completed.\n");
							fo.close();

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
							System.out.println("File not found \n");
						}
						break;


					case 4:

						value=false;
						break;

					default: System.out.println("Invalid Input");
					break;
					}

				}break;

			case 3: 
				System.exit(0);
				break;

			default: System.out.println("Invalid Choice ");
			break;
			}
		}
	}
}






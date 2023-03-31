import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerialDeserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//serialization
		Student s1=new Student(1,"karthik", "c language");
		Student s2=new Student(2,"Swati", "Java language");
		Student s3=new Student(3,"Rahul", "Python language");
		ArrayList<Student> s=new ArrayList<Student>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		FileOutputStream fo=new FileOutputStream("input");
		ObjectOutputStream out=new ObjectOutputStream(fo);
		out.writeObject(s);
		System.out.println("the write operation is done into the file input");
		out.close();
		fo.close();
		
		//deserialization
		
		FileInputStream fi=new FileInputStream("input");
		ObjectInputStream oi=new ObjectInputStream(fi);
		
		//LHS Student type object  RHS of the type super class object
		List<Student> st=(List<Student>) oi.readObject();
		System.out.println("Deserialized values");
		System.out.println(st);
		
	}
	}





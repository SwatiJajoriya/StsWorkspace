//shift+control+operator'+' for font size increase

package mypackage;

public class FirstDemo {
	int empno=101;
	String empname="Aarna";
	double Salary=10000;
	
	public void display() {
		char gender= 'F';
		System.out.println(empno+" "+empname+" "+gender);
	}
		
public static void main(String[] args) {
	FirstDemo firstdemo=new FirstDemo();
	System.out.println(firstdemo.empno);
	System.out.println(firstdemo.empname);
	firstdemo.display();
	
	
}
}

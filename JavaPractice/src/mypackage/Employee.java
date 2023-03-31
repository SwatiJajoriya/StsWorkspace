package mypackage;

public class Employee {
	int empno=101;
	String empname="Aarna";
	double Salary=20000;
	
	public void employeeBonus(double bonus) {
		double FS= Salary+bonus;
		System.out.println(FS);
	}
	
		public static void main(String[] args) {
			Employee emp=new Employee();
			emp.employeeBonus(5000);
		}
}

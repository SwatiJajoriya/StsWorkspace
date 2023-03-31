package mypackage;

public class Patient {
	double w ,h;
Patient(double weight,double height){
	w=weight;
	h=height;
}
 double BMI() {
	return w/(h*h);
	
}
 public static void main(String[] args) {
	Patient patient1=new Patient(35.6, 0.1016);
	System.out.println(patient1.BMI());
	
	Patient patient2=new Patient(32.6, 0.1011);
	System.out.println(patient2.BMI());
}
 
}

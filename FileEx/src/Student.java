import java.io.Serializable;

public class Student implements Serializable {
private int sid;
private transient String sname;
private String subject;
public Student(int sid, String sname, String subject) {
	
	this.sid = sid;
	this.sname = sname;
	this.subject = subject;
	
	
}
//default method to invoke object data
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", subject=" + subject + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

}

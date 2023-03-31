package com.simplilearn.pojo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		private int studId;

	@Column
	private String studFname;
	private String studLname;
	private int studAge;
	private String studemail;
	private long studphono;
	private String studClass;

	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudFname() {
		return studFname;
	}
	public void setStudFname(String studFname) {
		this.studFname = studFname;
	}
	public String getStudLname() {
		return studLname;
	}
	public void setStudLname(String studLname) {
		this.studLname = studLname;
	}
	public int getStudAge() {
		return studAge;
	}
	public void setStudAge(int studAge) {
		this.studAge = studAge;
	}
	public String getStudemail() {
		return studemail;
	}
	public void setStudemail(String studemail) {
		this.studemail = studemail;
	}
	public long getStudphono() {
		return studphono;
	}
	public void setStudphono(long studphono) {
		this.studphono = studphono;
	}
	public String getStudClass() {
		return studClass;
	}
	public void setStudClass(String studClass) {
		this.studClass = studClass;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studFname=" + studFname + ", studLname=" + studLname + ", studAge="
				+ studAge + ", studemail=" + studemail + ", studphono=" + studphono + ", studClass=" + studClass + "]";
	}


}



package com.simplilearn.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studid;
	@Column
	private String studName;
	private String studDOB;
	private String studEmail;
	private String studAddress;
	private long studPhono;
	private String studClass;
	
	public int getStudid() {
		return studid;
	}
	public void setStudid(int studid) {
		this.studid = studid;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getStudDOB() {
		return studDOB;
	}
	public void setStudDOB(String studDOB) {
		this.studDOB = studDOB;
	}
	public String getStudEmail() {
		return studEmail;
	}
	public void setStudEmail(String studEmail) {
		this.studEmail = studEmail;
	}
	public String getStudAddress() {
		return studAddress;
	}
	public void setStudAddress(String studAddress) {
		this.studAddress = studAddress;
	}
	public long getStudPhono() {
		return studPhono;
	}
	public void setStudPhono(long studPhono) {
		this.studPhono = studPhono;
	}
	public String getStudClass() {
		return studClass;
	}
	public void setStudClass(String studClass) {
		this.studClass = studClass;
	}
	@Override
	public String toString() {
		return "Student [studid=" + studid + ", studName=" + studName + ", studDOB=" + studDOB + ", studEmail="
				+ studEmail + ", studAddress=" + studAddress + ", studPhono=" + studPhono + ", studClass=" + studClass
				+ "]";
	}
	
	
	

}

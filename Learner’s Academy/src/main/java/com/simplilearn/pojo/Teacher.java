package com.simplilearn.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		private int tId;

	@Column
	private String tFname;
	@Column
	private String tLname;
	@Column
	private int tAge;
	@Column
	private long phono;
	@Column
	private String tDesignation;
	
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String gettFname() {
		return tFname;
	}
	public void settFname(String tFname) {
		this.tFname = tFname;
	}
	public String gettLname() {
		return tLname;
	}
	public void settLname(String tLname) {
		this.tLname = tLname;
	}
	public int gettAge() {
		return tAge;
	}
	public void settAge(int tAge) {
		this.tAge = tAge;
	}
	public long getPhono() {
		return phono;
	}
	public void setPhono(long phono) {
		this.phono = phono;
	}
	public String gettDesignation() {
		return tDesignation;
	}
	public void settDesignation(String tDesignation) {
		this.tDesignation = tDesignation;
	}
	@Override
	public String toString() {
		return "Teacher [tId=" + tId + ", tFname=" + tFname + ", tLname=" + tLname + ", tAge=" + tAge + ", phono="
				+ phono + ", tDesignation=" + tDesignation + "]";
	}


}

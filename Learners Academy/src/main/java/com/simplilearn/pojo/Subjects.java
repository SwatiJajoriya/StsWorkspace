package com.simplilearn.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subjects {
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private int subid;
	
	@Column 
	private String subName;

	public int getSubid() {
		return subid;
	}

	public void setSubid(int subid) {
		this.subid = subid;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	@Override
	public String toString() {
		return "Subjects [subid=" + subid + ", subName=" + subName + "]";
	}
	

}

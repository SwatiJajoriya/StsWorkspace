package com.simplilearn.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Class {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int classId;
@Column
	private String className;
public int getClassId() {
	return classId;
}
public void setClassId(int classId) {
	this.classId = classId;
}
public String getClassName() {
	return className;
}
public void setClassName(String className) {
	this.className = className;
}
@Override
public String toString() {
	return "Class [classId=" + classId + ", className=" + className + "]";
}
	

}

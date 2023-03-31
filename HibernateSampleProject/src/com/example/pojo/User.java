package com.example.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column
	private String Name;
	private String Email;
	private long Phono;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public long getPhono() {
		return Phono;
	}
	public void setPhono(long phono) {
		Phono = phono;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", Name=" + Name + ", Email=" + Email + ", Phono=" + Phono + "]";
	}
	
	

}

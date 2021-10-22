package com.instanthelp;
import java.util.ArrayList;
import java.util.List;

public class Person {
	String name;
	String email;
	String phoneno;
	String address;
	String type; 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- Service Provider Details ----\n");
		display.append("Name: " + name + "\n");
		display.append("Email: "+email + "\n");
		display.append("Phone no: "+phoneno  + "\n");
		display.append("Address: "+address  + "\n");
		return display.toString();
	}
	
}

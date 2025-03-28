package com.functions;

public class Employe {
	
	@Override
	public String toString() {
		return "Employe [name=" + name + ", email=" + email + "]";
	}
	private String name;
	private String email;
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
	public Employe(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	

}

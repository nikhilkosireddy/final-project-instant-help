package com.instanthelp;

public class Electrician implements ServiceDetail{

	@Override
	public void details() {
		System.out.println("The details of Electrician are:");
		System.out.println("Name: Hennery");
		System.out.println("Address: London, UK");
		System.out.println("Contact No: 0323577771");
		System.out.println("Email: hennery@email.com");

	}	
}

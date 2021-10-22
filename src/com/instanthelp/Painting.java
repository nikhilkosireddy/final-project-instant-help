package com.instanthelp;
public class Painting  implements ServiceDetail{

	@Override
	public void details() {
		System.out.println("The details of Painter are:");
		System.out.println("Name: Edwerson");
		System.out.println("Address: Cambridge, UK");
		System.out.println("Contact No: 03454768881");
		System.out.println("Email: edwerson@email.com");

	}	
}

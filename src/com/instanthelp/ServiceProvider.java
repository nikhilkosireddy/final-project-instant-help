package com.instanthelp;

public class ServiceProvider extends Person {

	public ServiceProvider(String n, String e, String pno, String addr)
	{
		name = n;
		email = e;
		phoneno = pno;
		address = addr;
		type = "Service Provider";
	}
	public void placeOrder() {
		System.out.println("Service Provider place an order");
	}

	public void deliverOrder() {
		System.out.println("Service Provider deliver an order");
	}
	public void endOrder() {
		System.out.println("Your order is ended!!!");
	}
}

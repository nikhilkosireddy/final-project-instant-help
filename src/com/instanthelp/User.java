package com.instanthelp;

public class User extends Person{
	Order order;
	public User(String n, String e, String pno, String addr)
	{
		name = n;
		email = e;
		phoneno = pno;
		address = addr;
		type = "User";
	}
	public void createOrder(Order order) {
		this.order = order;
	}
	public void placeOrder() {
		System.out.println("User command to place an order");
	}

	public void deliverOrder() {
		System.out.println("User command to deliver an order");
	}

}

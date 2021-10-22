package com.instanthelp;
public class OrderService implements Order{

	ServiceProvider sp;
	public OrderService(ServiceProvider sp) {
		this.sp =sp;
		
	}

	@Override
	public void orderUp() {

		sp.placeOrder();
	}

}

package com.instanthelp;
public class ServicesIterator implements Iterator {

	String[] service;
	int position = 0;
	public ServicesIterator(String[] service) {

	this.service = service;
	}

	@Override
	public boolean hasNext() {
		if (position >= service.length || service[position] == null) {
			return false;
		} else {
			return true;
		}	}

	@Override
	public Object next() {
		String ser = service[position];
		position = position + 1;
		return ser;
	}

}

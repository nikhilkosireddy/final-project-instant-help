package com.instanthelp;

public class UserStore {
		UserAccount factory;
	 
		public UserStore(UserAccount factory) { 
			this.factory = factory;
		}
	 
		public Person create(String n, String e, String pno, String addr,String type) {
			Person p;
	 
			p = factory.createPerson(n, e, pno,  addr, type);
			return p;
		}

}


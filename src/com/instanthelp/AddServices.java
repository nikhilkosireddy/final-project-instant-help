package com.instanthelp;

public class AddServices  implements Service{

	static final int MAX = 6;
	int numberOfServices = 0;
	String[] name;
	String[] services_provider_name;
	public AddServices() {
		name = new String[MAX];
		services_provider_name=new String[MAX];
		addItem("Cleaning", "james");
		addItem("Plumbing", " jalson");
		addItem("Gardening", "john");
		addItem("Electrician", "hennery");
		addItem("AC Repairing Services", "jhonny");
		addItem("Painting", "edwerson");
		
	}

	@Override
	public Iterator createIterator() {

		return new ServicesIterator(name);
	}

  
	public void addItem(String n, String m) 
	{
		if (numberOfServices >= MAX) {
			System.err.println("Sorry, you cannot add more services.");
		} else {
			name[numberOfServices] = n;
			services_provider_name [numberOfServices] = m;
			numberOfServices = numberOfServices + 1;
		}
	}
 
	public String[] getServices() {
		return name;
	}
  
	public String[] getServiceprovidername() {
		return services_provider_name;
	}
	public String toString() {
		return "Services";
	}
}

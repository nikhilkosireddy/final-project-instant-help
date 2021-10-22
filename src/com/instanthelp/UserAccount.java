package com.instanthelp;
import java.util.Scanner;

public class UserAccount {
    int number =0;
    private ServiceDetail cleaning;
    private ServiceDetail plumbing;
    private ServiceDetail gardening;
    private ServiceDetail electrician;
    private ServiceDetail ac;
    private ServiceDetail painting;

	public Person createPerson(String n, String e, String pno, String addr, String type) {
		Person p = null;
		
        cleaning = new Cleaning();
        plumbing = new Plumbing();
        gardening = new Gardening();
        electrician = new Electrician();
        ac = new ACRepairingServices();
        painting = new Painting();
		if (type.equals("user")) {
			p = new User(n, e, pno,  addr);
			AddServices services = new AddServices();
			Iterator serviceIterator = services.createIterator();
		    Scanner in = new Scanner(System.in);

			System.out.println("\nThe services which we offer is as follows:");
			print(serviceIterator);
			System.out.println("\nKindly select the services");
			number=in.nextInt();
			if(number ==1)
			{
				cleaning.details();
			}
			else if(number == 2)
			{
				plumbing.details();
			}
			else if(number == 3)
			{
				gardening.details();
			}else if(number == 4)
			{
				electrician.details();
			}else if(number == 5)
			{
				ac.details();
			}else if(number == 6)
			{
				painting.details();
			}
			else
			{
				System.out.println("Invalid Choice!!!");
			}
		} else if (type.equals("sp")) {
			p = new ServiceProvider(n, e, pno,  addr);
		}
		return p;

}
	private static void print(Iterator iterator) {
		int i= 1;
		
		while (iterator.hasNext()) {
			String menuItem = (String)iterator.next();
			System.out.println(i +" "+menuItem);
			i++;
			

		}
	}

}
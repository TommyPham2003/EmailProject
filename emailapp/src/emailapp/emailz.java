package emailapp;

import java.util.Scanner;

public class emailz {
	public static void main(String [] args) {
		//get the employee's first and last name
		System.out.println("Enter your first name");
		Scanner name = new Scanner(System.in);
		String firstName = name.next();
		
		System.out.println("Enter your last name");
		//Scanner last = new Scanner(System.in);
		String lastName = name.next();
		
		EmailObj email1 = new EmailObj(firstName, lastName);
		
	}
}

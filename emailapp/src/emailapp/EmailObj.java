package emailapp;

import java.util.Scanner;

public class EmailObj {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailCapacity;
	private String newEmail;
	
	//constructor
	public EmailObj(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("New Email Created: " + this.firstName + " " + this.lastName);
		
		//set the department
		department = setDepartment();
		System.out.println("Department: " + department);
	}
	
	//department setter
	//department can be changed to whatever is needed to fit the situation
	private String setDepartment() {
		System.out.println("Enter your department:");
		System.out.println("1 for department");
		System.out.println("2 for department");
		System.out.println("3 for department");
		
		//make a scanner to read in the department
		Scanner departmentNumber = new Scanner(System.in);
		int num = departmentNumber.nextInt();
		
		if(num == 1) {
			return "department";
		}
		else if(num == 1) {
			return "department";
		}
		else {
			return "department";
		}
	}
	
	//generate a password
	
	//set mailbox capacity
	
	//set alternate email
	
	//change password
	
}

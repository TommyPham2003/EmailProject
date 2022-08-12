package emailapp;

import java.util.Scanner;

public class EmailObj {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailCapacity;
	//the length can be changed
	private int passwordLength = 10;
	private String newEmail;
	//this can be changed
	private String emailSuffix = "gmail.com";
	//constructor
	public EmailObj(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("New Email Created: " + this.firstName + " " + this.lastName);
		
		//set the department
		department = setDepartment();
		System.out.println("Department: " + department);
		
		//call a method to generate a random password
		password = randomPass(passwordLength);
		System.out.println("Your password is: " + password);
		
		//generate an email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + emailSuffix;
		System.out.println("Your email is: " + email);
	}
	
	//department setter
	//department can be changed to whatever is needed to fit the situation
	private String setDepartment() {
		System.out.println("Enter employee's department:");
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
	//the length can be changed
	private String randomPass(int length) {
		//make a string with all the variables that can be used in the random password
		String passwordVariable = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$%";
		//make a char array with the required length to use for the random password
		char [] password = new char[length];
		
		//make a for loop to generate a random password out of the variables
		for(int index = 0; index < length; index++) {
			int random = (int) (Math.random() * passwordVariable.length());
			password[index] = passwordVariable.charAt(random);
		}
		//return the array as a string
		return new String (password);
	}
	
	//set mailbox capacity
	
	//set alternate email
	
	//change password
	
}

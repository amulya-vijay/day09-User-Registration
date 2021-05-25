package com.userRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FirstName{
	Scanner sc = new Scanner(System.in);
	public String getFirstName() {
		System.out.println("Enter the first name:");
		String firstName=sc.nextLine();
		Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]{2,}");
		Matcher matcher = pattern.matcher(firstName);
		if(matcher.find()) {
			return firstName;
		}else {
			return "Invalid First Name : First name should begin with a upper case letter and must contain minimum 3 letters.";
		}
	}
}

class LastName{
	
	public String getLastName() {
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Last Name: ");
		String lastName=sc.nextLine();
		Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]{2,}");
		Matcher matcher = pattern.matcher(lastName);
		if(matcher.find()) {
			return lastName;
		}else {
			return "Invalid Last Name : last name should begin with a upper case letter and must contain minimum 3 letters.";
		}
	}
}

class EmailId{
	
	public String getEmailId() {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email address:");
		String emailId = sc.nextLine();
		Pattern pattern = Pattern.compile("^[a-z0-9+.-_]+@[a-z.]+[com]$");
		Matcher matcher = pattern.matcher(emailId);
		if(matcher.find()) {
			return emailId;
		}else {
			return "Invalid Email ID: valid format- example@domain.com/co";
		}
			
	}
}

public class UserRegistration {
	public static void main(String[] args) {
		
	//	FirstName fName = new FirstName();
	//	System.out.println("First Name: "+fName.getFirstName());
		
	//	LastName lName = new LastName();
	//	System.out.println("Last Name: "+lName.getLastName());
		
		EmailId emailid = new EmailId();
		System.out.println("Email Name: "+emailid.getEmailId());
	}

}

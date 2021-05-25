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

class MobileNumber{
	
	public String getmobileNumber() {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Phone Number:");
		String phoneNum = sc.nextLine();
		Pattern pattern = Pattern.compile("[91]{2}[: :][6789]{1}[0-9]{9}$");
		Matcher matcher = pattern.matcher(phoneNum);
		if(matcher.find()) {
			return phoneNum;
		}else {
			return "Invalid Phone Number: valid format- 91 [10-digit-number]";
		}
		
	}
}

class  Password{
	
	public String getPassword() {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter password: ");
		 String password = sc.nextLine();
	     
		
		Pattern pattern = Pattern.compile("(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z]){8,}");
		Matcher matcher = pattern.matcher(password);
	
		if(matcher.find()) {
			return "password set";
		}else {
			return "Invalid Password: Password should contain atleast 8 characters"+
					" with atleast one upper case letter,one numeric character and one special character.";
		}
		
	}
	
}

public class UserRegistration {
	public static void main(String[] args) {
		
	//	FirstName fName = new FirstName();
	//	System.out.println("First Name: "+fName.getFirstName());
		
	//	LastName lName = new LastName();
	//	System.out.println("Last Name: "+lName.getLastName());
		
	//	EmailId emailId = new EmailId();
	//  System.out.println("Email Name: "+emailId.getEmailId());
		
	//	MobileNumber mblNum = new MobileNumber();
	//	System.out.println("Phone Number: "+mblNum.getmobileNumber());
		
		Password password = new Password();
		System.out.println("Password: "+password.getPassword());
	}

}

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
			return "Invalid First Name : Enter proper name";
		}
	}
}

public class UserRegistration {
	public static void main(String[] args) {
		
		FirstName fName = new FirstName();
		System.out.println("First Name:"+fName.getFirstName());
	}

}

package com.junit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	
	public static boolean checkValidEmail(String email) {

		boolean isEmail;
		String emailRegex = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
		Pattern pattern = Pattern.compile(emailRegex);
		if (email == null) {
			isEmail = false;
		}
		Matcher matcher = pattern.matcher(email);
		isEmail = matcher.matches();

		if (isEmail)
			System.out.println(email + " is a Valid Email address "+matcher.matches());
		else
			System.out.println(email + " is an Invalid Email address "+matcher.matches());
		
		return matcher.matches();
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
					
					//Get userInput 
					System.out.println("Enter Your E-mail ");
					String email = sc.nextLine();
					
					//Calling Method
					checkValidEmail(email);
	}
}

package com.junit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @author SURAJ KALE
 *
 */

public class MobileNumberValidation {
	
		/**
		 * @purpose : Check the validation of Email
		 * @return : No return Value 
		 */
		
		public static boolean checkValidMobileNumber(String mobNumber) 
		{
	        boolean isMobileNumber; //Variable declare to check validation
			String moblieRegex = "^[0-9]{2}\s{1}[0-9]{10}$";
   
			Pattern pattern = Pattern.compile(moblieRegex);
			
			if (mobNumber == null)
			{
				isMobileNumber = false;
			}
			
			Matcher matcher = pattern.matcher(mobNumber);
			isMobileNumber = matcher.matches();
			
			//condition to check Email Validation
			if (isMobileNumber)
				System.out.println(mobNumber + " is an Valid Mobile Number "+matcher.matches());
			else
				System.out.println(mobNumber + " is an Invalid Mobile Number "+matcher.matches());
		return matcher.matches();
		}

		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			//Get userInput 
			System.out.println("Enter Your Mobile Number ");
			String mobNumber = sc.nextLine();
			
			//Calling Method
			checkValidMobileNumber(mobNumber);
		}
	}

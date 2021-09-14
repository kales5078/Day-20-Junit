package com.junit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author SURAJ KALE
 *
 */

public class LastNameValidation 
{
		
	/**
	 * @purpose : Check the validation of Last Name
	 * @return : No return Value 
	 */
	
	public static boolean checkValidLastName(String lastName) 
	{
        boolean isLastName; //Variable declare to check validation
		    String lastNameRegex = "^[A-Z]{1}[a-z]{3,}$";    
		    Pattern pattern = Pattern.compile(lastNameRegex);
		
		    if (lastName == null)
		    {
			  isLastName = false;
		    }
		
		    Matcher matcher = pattern.matcher(lastName);
		    isLastName = matcher.matches();
		
		//condition to check LastName Validation
		    if (isLastName)
			  System.out.println(lastName + " is an Valid Last Name "+matcher.matches());
		    else
			  System.out.println(lastName + " is an Invalid Last Name "+matcher.matches());
	      return matcher.matches();
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Get userInput 
		System.out.println("Enter Your Last Name");
		String lastName = sc.nextLine();
		
		//Calling Method
		checkValidLastName(lastName);
	}
}

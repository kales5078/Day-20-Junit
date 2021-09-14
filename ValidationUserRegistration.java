package demo;

import org.junit.Assert;
import org.junit.Test;

import com.junit.FirstNameValidation;
import com.junit.LastNameValidation;
import com.junit.MobileNumberValidation;
import com.junit.EmailValidation;

public class ValidationUserRegistration
{

	//Test case for the First Name Validation
	@Test
	public void WhenFirstLetterCapital_ReturnTrue() 
	{

		Assert.assertTrue(FirstNameValidation.checkValidFirstName("Suraj"));
	}

	@Test
	public void WhenFirstLetterSmall_ReturnFalse()
	{

		boolean result = FirstNameValidation.checkValidFirstName("suraj");
		Assert.assertEquals(false, result);

	}
	
	@Test
	public void WhenFirstLetterNumber_ReturnFalse()
	{
        Assert.assertFalse(FirstNameValidation.checkValidFirstName("5Suraj"));
	}
	

	@Test
	public void WhenFirstLetterSymbol_ReturnFalse()
	{
        Assert.assertFalse(FirstNameValidation.checkValidFirstName("@Suraj"));
	}
	
	// Test case for Last Name Validation
	@Test
	public void When_FirstLetter_Capital_LastName_ReturnTrue() 
	{

		Assert.assertTrue(LastNameValidation.checkValidLastName("Kale"));
	}

	@Test
	public void When_First_Letter_Small_ReturnFalse()
	{

		boolean result = LastNameValidation.checkValidLastName("kale");
		Assert.assertEquals(false, result);

	}
	
	@Test
	public void When_FirstLetterNumber_ReturnFalse()
	{
        Assert.assertFalse(LastNameValidation.checkValidLastName("5kale"));
	}
	

	@Test
	public void When_FirstLetterSymbol_ReturnFalse()
	{
        Assert.assertFalse(LastNameValidation.checkValidLastName("@kale"));
	}
	
	//Test case for Mobile Number
	@Test
	public void When_Characture_present_ReturnFalse()
	{
        Assert.assertFalse(MobileNumberValidation.checkValidMobileNumber("434dsf"));
	}
	
	@Test
	public void When_Number_present_ReturnTrue()
	{
        Assert.assertTrue(MobileNumberValidation.checkValidMobileNumber("91 7869584634"));
	}
	
	@Test 
	public void When_Ten_digit_Number_Absent_ReturnFalse()
	{
        Assert.assertFalse(MobileNumberValidation.checkValidMobileNumber("91 78695634"));
	}
	
	//Test Case for E-mail Validation
	@Test
	public void When_Dot_absent_ReturnFalse()
	{
        Assert.assertFalse(EmailValidation.checkValidEmail("Surajkale@gmailcom"));
	}
	@Test
	public void When_AtTheRate_absent_ReturnFalse()
	{
        Assert.assertFalse(EmailValidation.checkValidEmail("Surajkalegmail.com"));
	}
	
	//Test Case for the Password validation
	@Test
	public void First_LetterUpperCase_ReturnTrue() {
		Assert.assertTrue(PasswordValidation.checkValidPassword("Password@123"));
	
	}
	@Test
	public void WhenCharacture_Absent_RetrunFalse() {
		Assert.assertFalse(PasswordValidation.checkValidPassword("Password1234"));
	}
	@Test
	public void WhenNumber_Absent_ReturnFalse() {
		Assert.assertFalse(PasswordValidation.checkValidPassword("Password@#$"));
	}
	
	@Test
	public void MinumumEight_Value_Present_ReturnFalse() {
		Assert.assertFalse(PasswordValidation.checkValidPassword("Pas@123"));
	}
}

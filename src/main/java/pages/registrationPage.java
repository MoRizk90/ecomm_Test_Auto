package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class registrationPage extends pageBase {

	public registrationPage(WebDriver driverforBasePage) {
		super(driverforBasePage);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath= "//input[@id='gender-male']")
	WebElement MaleGenderRadioBtn;
	
	@FindBy(xpath = "//input[@name='FirstName']")
	WebElement FirstNameTextBox;
	
	@FindBy(xpath= "//input[@id='LastName']")
	WebElement LastNameTxtBox;
	
	@FindBy(xpath= "//input[@id='Email']")
	WebElement emailTxtBox;
	
	@FindBy(xpath= "//input[@id='Password']")
	WebElement passwordtxtbox;
	
	@FindBy(xpath= "//input[@id='ConfirmPassword']")
	WebElement confirmpasswordtxtbox;
	
	@FindBy(xpath= "//input[@id='register-button']")
	WebElement RegisterBtn;
	
	@FindBy(xpath= "//h1[contains(text(),'Register')]")
	public WebElement forassertion;
	
	
	public void registerNewUser(String fName, String lName, String email, String password) {
		clickWebElement(MaleGenderRadioBtn);
		writeInElement(FirstNameTextBox, fName);
		writeInElement(LastNameTxtBox, lName);
		writeInElement(emailTxtBox, email);
		writeInElement(passwordtxtbox, password);
		writeInElement(confirmpasswordtxtbox, password);
		clickWebElement(RegisterBtn);
		
		
	}
	

}

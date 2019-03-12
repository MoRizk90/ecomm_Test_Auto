package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends pageBase {

	public LoginPage(WebDriver driverforBasePage) {
		super(driverforBasePage);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath= "//input[@name='Email']")
	WebElement emailText;
	
	@FindBy(xpath= "//input[@id='Password']")
	WebElement passwordText;
	
	@FindBy(xpath= "//input[@value='Log in']")
	WebElement loginBtn;
	
	public void successufulLogin(String email, String password) {
		writeInElement(emailText, email);
		writeInElement(passwordText, password);
		clickWebElement(loginBtn);
		
	}
	
	
	
	

}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends pageBase {

	public HomePage(WebDriver driverforBasePage) {
		super(driverforBasePage);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath= "//a[@class='ico-register']")
	WebElement registerLink;
	
	@FindBy(xpath = "//a[@class='ico-login']")
	WebElement loginLink;
	
	public void openRegisterationpage() {
		clickWebElement(registerLink);
	}
	
	public void openLoginPage() {
		clickWebElement(loginLink);
		
	}

}

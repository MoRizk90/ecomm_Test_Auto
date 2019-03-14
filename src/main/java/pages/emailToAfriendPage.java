package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class emailToAfriendPage extends pageBase{

	public emailToAfriendPage(WebDriver driverforBasePage) {
		super(driverforBasePage);
	}
	
	String friendsEmail;
	String theMsg;
	@FindBy(xpath= "//*[@id=\"product-details-form\"]/div/div[1]/div[2]/div[9]/div[2]/input")
	WebElement emailToFriendBtn;
	
	@FindBy(xpath= "//*[@id=\"FriendEmail\"]")
	WebElement frinedEmailTxtBox;
	
	@FindBy(xpath= "//textarea[@placeholder='Enter personal message (optional).']")
	WebElement Message;
	
	@FindBy(xpath= "//input[@value='Send email']")
	WebElement sendMailBtn;
	
	@FindBy(xpath= "//div[@class='result']")
	public WebElement assertedDiv;
	
	public void sendEmailwithCorrectData(String friendsEmail, String friendsMsg) {
		clickWebElement(emailToFriendBtn);
		writeInElement(frinedEmailTxtBox, friendsEmail);
		writeInElement(Message, friendsMsg);
		clickWebElement(sendMailBtn);
	}

}

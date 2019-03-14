package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.emailToAfriendPage;
import pages.registrationPage;

public class EmailProductToAFriend extends testBase{
	emailToAfriendPage emailingToFriendObj;
	HomePage homePageObj;
	registrationPage regPageObj;
	String firstName = "power12	";
	String lastName = "testPower12";
	String email = "fo1234ass1asd225x@Test.com";
	String password = "123456789";
	String theWantedProduct = "mac";
	String theFrdEmail = "fox1@fox1.com";
	String theMsgtothefriends = "This is the test";

	
	@Test(priority= 1)
	public void registerUSer() throws InterruptedException {
		homePageObj = new HomePage(testBaseDriver);
		regPageObj = new registrationPage(testBaseDriver);
		homePageObj.openRegisterationpage();
		regPageObj.registerNewUser(firstName, lastName, email, password);
		Thread.sleep(5000);
//		Assert.assertTrue(regPageObj.forassertion.getText().contains("teez"));
		
	}
	
	
	@Test(priority= 2)
	public void findMacAutoComplete() throws InterruptedException{
		homePageObj = new HomePage(testBaseDriver);
		homePageObj.usingAutoSuggest(theWantedProduct);
		testBaseDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(homePageObj.breadCrumbs.get(0).getText());
		Assert.assertTrue(homePageObj.breadCrumbs.get(0).getText().contains("Apple MacBook Pro 13-inch"));
	}

	
	@Test(priority= 3)
	public void emailingCases() {
		emailingToFriendObj = new emailToAfriendPage(testBaseDriver);
		emailingToFriendObj.sendEmailwithCorrectData(theFrdEmail, theMsgtothefriends);
		Assert.assertTrue(emailingToFriendObj.assertedDiv.getText().contains("Your message has been sent."));
	}	
	
	
	
}

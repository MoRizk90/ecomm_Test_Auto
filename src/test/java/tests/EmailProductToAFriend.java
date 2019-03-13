package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.emailToAfriendPage;

public class EmailProductToAFriend extends testBase{
	emailToAfriendPage emailingToFriendObj;
	String theFrdEmail = "fox1@fox1.com";
	String theMsgtothefriends = "This is the test";
	
	@Test
	public void emailingCases() {
		emailingToFriendObj = new emailToAfriendPage(testBaseDriver);
		emailingToFriendObj.sendEmailwithCorrectData(theFrdEmail, theMsgtothefriends);
		Assert.assertTrue(emailingToFriendObj.assertedDiv.getText().contains("Your message has been sent."));
	}	
	
}

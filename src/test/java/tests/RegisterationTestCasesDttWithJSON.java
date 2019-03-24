package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import data.JsonDataReader;
import pages.HomePage;
import pages.registrationPage;

public class RegisterationTestCasesDttWithJSON extends testBase {
	HomePage homePageObj;
	registrationPage regPageObj;
	JsonDataReader Jreader ;

	//	
	//	String firstName = "power12	";
	//	String lastName = "testPower12";
	//	String email = "fox@Test.com";
	//	String password = "123456789";

	@Test
	public void registerUSer() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Jreader = new JsonDataReader();
		Jreader.jsonReader();
		homePageObj = new HomePage(testBaseDriver);
		regPageObj = new registrationPage(testBaseDriver);
		homePageObj.openRegisterationpage();
		System.out.println("the first name should be "  +  Jreader.firstName);
		regPageObj.registerNewUser(Jreader.firstName, Jreader.lastName, Jreader.email, Jreader.password);
		Thread.sleep(5000);
		//		Assert.assertTrue(regPageObj.forassertion.getText().contains("teez"));

	}
}

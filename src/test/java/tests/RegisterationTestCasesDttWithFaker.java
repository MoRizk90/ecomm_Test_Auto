package tests;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.HomePage;
import pages.registrationPage;

public class RegisterationTestCasesDttWithFaker extends testBase {
	HomePage homePageObj;
	registrationPage regPageObj;
	Faker fakeObj = new Faker();
	String firstName =fakeObj.name().firstName();
	String lastName = fakeObj.name().lastName();
	String email = fakeObj.internet().emailAddress();
	String password = fakeObj.internet().password();

	@Test
	public void registerUSer() throws InterruptedException {
		homePageObj = new HomePage(testBaseDriver);
		regPageObj = new registrationPage(testBaseDriver);
		homePageObj.openRegisterationpage();
		regPageObj.registerNewUser(firstName, lastName, email, password);
		Thread.sleep(5000);
		//		Assert.assertTrue(regPageObj.forassertion.getText().contains("teez"));

	}
}

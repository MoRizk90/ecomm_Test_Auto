package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.registrationPage;

public class RegisterationTestCaseWithDDT extends testBase {
	HomePage homePageObj;
	registrationPage regPageObj;
	
	@DataProvider(name= "testData")
	public static Object[][] userData(){
		
		
		return new Object[][] {
			
			{"Mohammed","Rizk","Moe33@Moe345.com","Pass1234"},
			{"Ahemd","www","Moe23@Moe345.com","Pass1234"}
			
			};
		
	}
	
	@Test(dataProvider= "testData")
	public void registerUSer(String firstName, String lastName, String email, String password) throws InterruptedException {
		homePageObj = new HomePage(testBaseDriver);
		regPageObj = new registrationPage(testBaseDriver);
		homePageObj.openRegisterationpage();
		regPageObj.registerNewUser(firstName, lastName, email, password);
		Thread.sleep(5000);
//		Assert.assertTrue(regPageObj.forassertion.getText().contains("teez"));
		
	}
}

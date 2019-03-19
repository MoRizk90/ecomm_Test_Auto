package tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReader;
import pages.HomePage;
import pages.registrationPage;

public class RegisterationTestCasesWithDttAndExcel extends testBase {
	HomePage homePageObj;
	registrationPage regPageObj;
//	String firstName = "power12	";
//	String lastName = "testPower12";
//	String email = "fox@Test.com";
//	String password = "123456789";
	
	@DataProvider(name= "excelData")
	public Object[][] userRegisterData() throws IOException{
		ExcelReader er = new ExcelReader();
		return er.getExcelData();
	}
	
	@Test(dataProvider= "excelData")
	public void registerUSer(String firstName, String lastName, String email, String password) throws InterruptedException {
		homePageObj = new HomePage(testBaseDriver);
		regPageObj = new registrationPage(testBaseDriver);
		homePageObj.openRegisterationpage();
		System.out.println(email);
		regPageObj.registerNewUser(firstName, lastName, email, password);
		Thread.sleep(5000);
//		Assert.assertTrue(regPageObj.forassertion.getText().contains("teez"));
		
	}
}

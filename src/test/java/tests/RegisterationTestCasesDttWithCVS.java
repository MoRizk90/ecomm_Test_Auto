package tests;

import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import pages.HomePage;
import pages.registrationPage;

public class RegisterationTestCasesDttWithCVS extends testBase {
	HomePage homePageObj;
	registrationPage regPageObj;
//	String firstName = "power12	";
//	String lastName = "testPower12";
//	String email = "fox@Test.com";
//	String password = "123456789";
	
	CSVReader csvReader;
	
	@Test
	public void registerUSer() throws InterruptedException, IOException {
		String csv_file = System.getProperty("user.dir") + "\\src\\test\\java\\data\\userData.csv";
		csvReader = new CSVReader(new FileReader(csv_file));
		String[] csvCell;
		//While loop will be created till the last value
		while((csvCell = csvReader.readNext()) != null) {
			String firstName = csvCell[0];
			String lastName = csvCell[1];
			String email = csvCell[2];
			String password = csvCell[3];
			homePageObj = new HomePage(testBaseDriver);
			regPageObj = new registrationPage(testBaseDriver);
			homePageObj.openRegisterationpage();
			regPageObj.registerNewUser(firstName, lastName, email, password);
			Thread.sleep(5000);
//			Assert.assertTrue(regPageObj.forassertion.getText().contains("teez"));
		}
		
		
	}
}

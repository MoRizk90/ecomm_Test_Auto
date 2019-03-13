package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;

public class FindProjectTestCase extends testBase {
	String theWantedProduct = "Apple MacBook Pro 13-inch";
	HomePage HomeObj;
	
	@Test
	public void findTheMac() {
		HomeObj = new HomePage(testBaseDriver);
		HomeObj.productSearch(theWantedProduct);
		Assert.assertTrue(HomeObj.prodcutSearchResult.getText().contains("Apple MacBook Pro 13-inch"));
	}

}

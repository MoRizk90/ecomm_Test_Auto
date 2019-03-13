package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;

public class FindProjectTestCase extends testBase {
	String theWantedProduct = "mac";
	HomePage HomeObj;
	
	@Test(enabled= false)
	public void findTheMac() {
		HomeObj = new HomePage(testBaseDriver);
		HomeObj.productSearch(theWantedProduct);
		Assert.assertTrue(HomeObj.prodcutSearchResult.getText().contains("Apple MacBook Pro 13-inch"));
	}
	
	@Test
	public void findMacAutoComplete() throws InterruptedException{
		HomeObj = new HomePage(testBaseDriver);
		HomeObj.usingAutoSuggest(theWantedProduct);
		testBaseDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(HomeObj.breadCrumbs.get(0).getText());
		Assert.assertTrue(HomeObj.breadCrumbs.get(0).getText().contains("Apple MacBook Pro 13-inch"));
	}

}

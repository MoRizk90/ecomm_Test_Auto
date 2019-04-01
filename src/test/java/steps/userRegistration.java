package steps;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.registrationPage;
import tests.testBase;

public class userRegistration extends testBase{

	HomePage homeObj ;
	registrationPage regObj;
	@Given("the user in the home page")
	public void the_user_in_the_home_page() {
		homeObj = new HomePage(testBaseDriver);
		System.out.println("From inside cucmber : " + testBaseDriver);
		homeObj.openRegisterationpage();
	}

	@When("the user clicks on register link")
	public void the_user_clicks_on_register_link() {
		Assert.assertTrue(testBaseDriver.getCurrentUrl().contains("reg"));
		
	}

	@When("the user entered registeration data")
	public void the_user_entered_registeration_data() {
		System.out.println(testBaseDriver);
	}

	@Then("the registration should be a success")
	public void the_registration_should_be_a_success() {
		System.out.println(testBaseDriver);
	}

}

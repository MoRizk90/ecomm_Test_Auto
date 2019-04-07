package steps;

import org.testng.Assert;

import com.github.javafaker.Faker;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.registrationPage;
import tests.testBase;

public class userRegistration extends testBase{

	HomePage homeObj ;
	registrationPage regObj;
//	Faker fakeObj = new Faker();
//	String firstName =fakeObj.name().firstName();
//	String lastName = fakeObj.name().lastName();
//	String email = fakeObj.internet().emailAddress();
//	String password = fakeObj.internet().password();

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

	@When("^I entered \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")

	public void i_entered(String firstName, String lastName, String email, String password) {
		registrationPage regObj=  new registrationPage(testBaseDriver);
		regObj.registerNewUser(firstName, lastName, email, password);
	}

	@Then("the registration should be a success")
	public void the_registration_should_be_a_success() {
		System.out.println(testBaseDriver);
	}

}

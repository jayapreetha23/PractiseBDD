package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SDLogin {
	WebDriver driver;
	LoginPOM lPOM;

	@Given("User is landed in Login Screen")
	public void user_is_landed_in_login_screen() {
		System.out.println(driver.getTitle());
	}

	@When("User enters {string} , {string} and clicks on Login button")
	public void user_enters_and_clicks_on_login_button(String UN, String PW) {
		lPOM.LoginMethod(UN, PW);
	}

	@Then("User should be navigated to Product Listing Page")
	public void user_should_be_navigated_to_product_listing_page() {
		String loginStatus = lPOM.lgnchk();
		Assert.assertEquals("Pass", loginStatus);
	}

	@Then("Error message should be displayed")
	public void error_message_should_be_displayed() {
		String loginStatus = lPOM.lgnchk();
		Assert.assertEquals("Fail", loginStatus);
	}

}

package StepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SDCheckout {

	LoginPOM lPOM;
	CheckoutPOM cPOM = new CheckoutPOM();

	@When("User clicks on Checkout button")
	public void user_clicks_on_checkout_button() {
		cPOM.checkoutbtn();
	}

	@When("User enters {string}, {string} and {string}")
	public void user_enters_and(String FirstName, String LastName, String PostalCode) {
		cPOM.PersonalDetails(FirstName, LastName, PostalCode);
	}

	@When("User clicks on Continue button")
	public void user_clicks_on_continue_button() {
		cPOM.continuebtn();
	}

	@When("User clicks on Finish button")
	public void user_clicks_on_finish_button() {
		cPOM.finishbtn();
	}

	@Then("Order will be placed successfully")
	public void order_will_be_placed_successfully() {
		String thankYouMsg = cPOM.orderPlaced();
		Assert.assertEquals("Pass", thankYouMsg);

	}

}

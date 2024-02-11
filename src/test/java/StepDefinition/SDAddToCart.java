package StepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SDAddToCart {

	LoginPOM lPOM;
	AddToCartPOM atcPOM = new AddToCartPOM();

	@Given("Login by entering {string} and {string}")
	public void login_by_entering_and(String UN, String PW) {
		lPOM = new LoginPOM();
		lPOM.LoginMethod(UN, PW);
		String loginStatus = lPOM.lgnchk();
		Assert.assertEquals("Pass", loginStatus);
	}

	@When("User selects the product and add it to cart")
	public void user_selects_the_product_add_it_to_cart() {
		String ItemAdded = atcPOM.AddToCart();
		Assert.assertEquals("Pass", ItemAdded);
	}

	@When("User clicks on Cart link")
	public void user_clicks_on_cart_link() {
		String NoOfItems = atcPOM.CartNumber();
		Assert.assertEquals("Pass", NoOfItems);

	}

	@Then("Product is added to Cart")
	public void product_is_added_to_cart() {
		String cartStatus = atcPOM.CartCheck();
		Assert.assertEquals("Pass", cartStatus);

	}
}

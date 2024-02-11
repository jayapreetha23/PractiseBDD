package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ObjRepo {

	WebDriver driver;

	public static final By txt_UN = By.id("user-name");
	public static final By txt_PW = By.id("password");
	public static final By btn_Login = By.id("login-button");

	public static final By select_Prd = By.xpath("//div[text()='Sauce Labs Bike Light']");
	public static final By btn_Addtocart = By.xpath("//button[text()='Add to cart']");
	public static final By lnk_Cart = By.xpath("//a[@class='shopping_cart_link']");
	public static final By btn_remove = By.id("remove-sauce-labs-bike-light");
	public static final By lnk_Cart_no = By.xpath("//span[contains(text(),'1')]");

	public static final By btn_Checkout = By.id("checkout");
	public static final By txt_fname = By.id("first-name");
	public static final By txt_lname = By.id("last-name");
	public static final By txt_postalcode = By.id("postal-code");

	public static final By btn_Continue = By.id("continue");
	public static final By btn_finish = By.id("finish");
	public static final By msg_Thankyou = By.xpath("//h2[contains(text(),'Thank you')]");

}

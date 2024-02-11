package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.LibDriver;

public class AddToCartPOM {

	WebDriver driver;

	public String AddToCart() {

		this.driver = LibDriver.driver;

		driver.findElement(ObjRepo.select_Prd).click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(ObjRepo.btn_Addtocart).click();

		String ItemAdded = "Pass";
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(ObjRepo.btn_remove));
		} catch (Exception e) {
			ItemAdded = "Fail";
			e.printStackTrace();
		}
		return ItemAdded;
	}

	public String CartNumber() {

		String NoOfItems = "Pass";
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(ObjRepo.lnk_Cart_no));
		} catch (Exception e) {
			NoOfItems = "Fail";
			e.printStackTrace();
		}
		driver.findElement(ObjRepo.lnk_Cart).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return NoOfItems;
	}

	public String CartCheck() {

		String cartStatus = "Pass";
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(ObjRepo.btn_Checkout));
		} catch (Exception e) {
			cartStatus = "Fail";
			e.printStackTrace();
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cartStatus;
	}
}

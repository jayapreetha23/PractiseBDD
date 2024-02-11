package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.LibDriver;

public class CheckoutPOM {

	WebDriver driver;

	public void checkoutbtn() {
		this.driver = LibDriver.driver;
		driver.findElement(ObjRepo.btn_Checkout).click();
	}

	public void PersonalDetails(String FirstName, String LastName, String PostalCode) {
		driver.findElement(ObjRepo.txt_fname).sendKeys(FirstName);
		driver.findElement(ObjRepo.txt_lname).sendKeys(LastName);
		driver.findElement(ObjRepo.txt_postalcode).sendKeys(PostalCode);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void continuebtn() {

		driver.findElement(ObjRepo.btn_Continue).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void finishbtn() {
		driver.findElement(ObjRepo.btn_finish).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String orderPlaced() {

		String thankYouMsg = "Pass";
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(ObjRepo.msg_Thankyou));
		} catch (Exception e) {
			thankYouMsg = "Fail";
			e.printStackTrace();
		}
		return thankYouMsg;
	}
}

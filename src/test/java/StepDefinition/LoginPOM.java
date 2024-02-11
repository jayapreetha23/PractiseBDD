package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.LibDriver;

public class LoginPOM extends LibDriver {

	WebDriver driver;

	public void LoginMethod(String UN, String PW) {
		this.driver = LibDriver.driver;
		driver.get("https://www.saucedemo.com/");
		driver.findElement(ObjRepo.txt_UN).sendKeys(UN);
		driver.findElement(ObjRepo.txt_PW).sendKeys(PW);
		driver.findElement(ObjRepo.btn_Login).click();
	}

	public String lgnchk() {

		String loginStatus = "Fail";
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(ObjRepo.btn_Login));
		} catch (Exception e) {
			loginStatus = "Pass";
		}
		return loginStatus;
	}
}

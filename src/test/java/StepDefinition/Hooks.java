package StepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import utils.LibDriver;

public class Hooks extends LibDriver {

	WebDriver driver;

	@Before
	public void BeforeMethod() {
		getDriver();
	}

}

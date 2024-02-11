package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LibDriver {

	public static WebDriver driver;

	public WebDriver getDriver() {
		if (this.driver == null) {
			this.driver = createDriver();
		}
		return this.driver;
	}

	private WebDriver createDriver() {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		return driver;

	}

}

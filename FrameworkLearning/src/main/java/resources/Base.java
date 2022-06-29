package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	WebDriver driver;
	protected Properties prop;

	public WebDriver initialiseDriver() throws IOException {
		FileInputStream file = new FileInputStream(
				"/Users/sankalpmotke/Documents/Eclipse Java Programs/com.ellucian.test/FrameworkLearning/src/main/java/resources/Drivers.property");
		prop = new Properties();
		prop.load(file);
		String driverName = prop.getProperty("driver");

		if (driverName.equals("chrome")) {
			System.setProperty("WebDriver.chrome.driver",
					"/Users/sankalpmotke/Documents/Eclipse Java Programs/com.ellucian.test/FrameworkLearning/chromedriver");
			driver = new ChromeDriver();
		} else if (driverName.equalsIgnoreCase("gecko")) {

			System.setProperty("WebDriver.firefox.driver",
					"/Users/sankalpmotke/Documents/Eclipse Java Programs/com.ellucian.test/FrameworkLearning/geckodriver");
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		return driver;
	}
}

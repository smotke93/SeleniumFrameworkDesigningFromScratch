package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	WebDriver driver;
	
	//here we have used regular expression
	By loginBtn = By.cssSelector("a[href*='sign_in']");
	By featuredCourcesLocator = By.cssSelector(".text-center.h2");
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement getLoginBtn()
	{
		return driver.findElement(loginBtn);
	}
	
	public WebElement getFeaturedCoursesText()
	{
		return driver.findElement(featuredCourcesLocator);
	}
}
 
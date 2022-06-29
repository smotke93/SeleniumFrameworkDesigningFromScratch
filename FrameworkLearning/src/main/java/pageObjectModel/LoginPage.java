package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By email =By.xpath("//input[@type='email']");
	By passward =By.id("user_password");
	By loginBtn =By.xpath("//input[@value='Log In']");
	
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	public WebElement getPassword()
	{
		return driver.findElement(passward);
	}
	public WebElement getLoginBtn()
	{
		return driver.findElement(loginBtn);
	}
}

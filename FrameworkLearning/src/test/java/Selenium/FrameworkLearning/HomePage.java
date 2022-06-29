package Selenium.FrameworkLearning;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjectModel.LandingPage;
import pageObjectModel.LoginPage;
import resources.Base;

public class HomePage extends Base {

	@DataProvider(name = "TestData1")
	// now we will learn to parameterize the test with DataProvider
	public Object[][] TestData() {
		/*
		 * here Object[1][2] [1] -> is the number of times we want to execute the test.
		 * Remember 1st element is 0th index. So [2] means 2 times 0,1 [2] -> is the number of
		 * different input data our test is expecting
		 */
		Object[][] data = new Object[2][2];

		data[0][0] = "a@gmail.com"; 
		data[0][1] = "123";

		data[1][0] = "b@gmail.com";
		data[1][1] = "123";

		
/*		Object[][] data2 = { { "xx@gmail.com", "123" }, 
							{ "yy@gmail.com", "123" }, 
							{ "zz@gmail.com", "123" }, };
							
*/
		return data;

	}
	
	@Test
	public void VerifyFeaturedCourses() throws IOException {
		WebDriver driver = initialiseDriver();
		
		//lets call the base URL from property file
		/*driver.get("https://www.qaclickacademy.com");*/
		driver.get(prop.getProperty("url"));
		
		LandingPage landingPage = new LandingPage(driver);
		Assert.assertEquals(landingPage.getFeaturedCoursesText().getText(), "Featured Courses"); 
		
	}

	/*
	@Test(dataProvider = "TestData1")
	public void LogIn(String email, String password) throws IOException {
		WebDriver driver = initialiseDriver();
		driver.get("https://www.qaclickacademy.com");
		
		LandingPage landingPage = new LandingPage(driver);
		landingPage.getLoginBtn().click();

		LoginPage loginPage = new LoginPage(driver);
		loginPage.getEmail().sendKeys(email);
		loginPage.getPassword().sendKeys(password);
		loginPage.getLoginBtn().click();
	}
	*/
}

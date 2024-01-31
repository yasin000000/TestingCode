package testingPro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgSeleniumPro {

	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Music\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void verfiyTitle() {
		String actualTitle=driver.getTitle();
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More";
		Assert.assertEquals(actualTitle, expectedTitle);
		
	
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

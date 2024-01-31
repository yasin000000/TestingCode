package seleniumfirst;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class DropdownEg {

	public static void main(String[] args) throws InterruptedException, IOException {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Music\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.pravaraengg.org.in/");
		
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//li[@class='dropdown']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Bachelor of Engineering (B.E.)']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Computer Engineering']")).click();
		
		File f=((TakesScreenshot)driver).
				getScreenshotAs(OutputType.FILE);
		
		Files.copy(f, new File("C:\\Users\\Admin\\Desktop\\SeleniumScreenShot\\myScreen.jpg"));
		
		
		

	}

}

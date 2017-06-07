package SeleniumAutomationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC002 {
	@Test
	public void testCase2() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		System.out.println("TC002 statement");
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Hello2");
		driver.findElement(By.id("pass")).sendKeys("Hello");
 		Thread.sleep(5000);
		driver.quit();
	}
}
package SeleniumAutomationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC004 {
	@Test
	public void testCase1() throws InterruptedException{
		//System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\workspace\\ManveJinkins\\Driver\\chromediver.exe");
		//System.setProperty("webdriver.chrome.driver","./Driver/chromediver.exe");
		//ChromeDriver driver = new ChromeDriver();
		//driver.get("http://www.google.com");
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		System.out.println("TC001 statement");
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Hello2");
		driver.findElement(By.id("pass")).sendKeys("Hello");
 
		Thread.sleep(5000);
		driver.quit();
	}
}
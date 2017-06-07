package SeleniumAutomationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC003 {
	@Test
	public void testCase3() throws InterruptedException{
		//System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\workspace\\ManveJinkins\\Driver\\chromediver.exe");
		//System.setProperty("webdriver.chrome.driver","./Driver/chromediver.exe");
		//ChromeDriver driver = new ChromeDriver();
		//driver.get("http://www.google.com");
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		System.out.println("TC003 statement");
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Hello3");
		driver.findElement(By.id("pass")).sendKeys("Hello3");
 
		Thread.sleep(5000);
		driver.quit();
		//driver.close();
	}
}
package testing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class BrowserLaunch {
	
	@Test
	
	public void test()
	{
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		//Browser Lunch
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.findElementByXPath("//input[@name='q']").sendKeys(Keys.SPACE );
		List<WebElement> findElements = driver.findElements(By.xpath("//ul[@class='erkvQe']/li[@class='sbct']"));
		for (WebElement webElement : findElements) {
		 System.out.println(webElement.getText());

			
		}
		
	}

}

package testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class MobileShop {
	
	WebDriver driver;
	@Before 
	public void beforeMethodTest()
	{
		//browser invoke - 
				System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
				driver = new ChromeDriver();
				System.out.println("Before method");
	}

	@Test 
	public void t_01_check_website_is_working()
	
	{
        //Navigate to Rcas URL
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		String expected = driver.getTitle();
		String actual = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		Assert.assertEquals(expected,actual);
		
	}	
	
	@After
	public void afterMethodTest()
	{
		driver.close();
		System.out.println("After method call");
	}
	
}

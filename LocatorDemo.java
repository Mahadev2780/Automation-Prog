package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G://Testing//Selenium//chromedriver.exe/");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// Using by.id
		
		//driver.findElement(By.id("email")).sendKeys("Maddy");
		
		//using by.name
		//driver.findElement(By.name("pass")).sendKeys("Maddy@123");
		//using by.tagname
		//driver.findElement(By.tagName("button")).click();
		//driver.close();
		// using by.classname
		//driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();
		//driver.findElement(By.tagName("button")).click();
		//driver.findElement(By.className(className))
	}

}

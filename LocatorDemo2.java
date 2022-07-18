package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G://Testing//Selenium//chromedriver.exe/");
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.google.co.in/");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//using by.className
		//driver.findElement(By.className("gb_d")).click();
		
		//using by.linkText
		//driver.findElement(By.linkText("Images")).click();
		
		//using by.PartialLinkText
		//driver.findElement(By.partialLinkText("Ima")).click();
		
		//Xpath by.attribute
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Maddy");
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Maddy");
		
		//using xpath by text
		
		//driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Maddy");
	}

}

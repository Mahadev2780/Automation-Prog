package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "G://Testing//Selenium//chromedriver.exe/");
			WebDriver driver =new ChromeDriver();
			//driver.get("https://www.facebook.com/");
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Maddy");
			driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
			//driver.findElement(By.ByXPath)

	}

}

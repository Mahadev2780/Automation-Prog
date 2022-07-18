package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Key_Tab {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G://Testing//Selenium//chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.name("email")).sendKeys("Maddy");
		Thread.sleep(2000);
		
		Actions a=new Actions(driver);
		a.sendKeys(Keys.TAB).build().perform();
		driver.findElement(By.id("pass")).sendKeys("Maddy123");
		driver.findElement(By.name("login")).click();
	}

}

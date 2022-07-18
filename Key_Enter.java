package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Key_Enter {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G://Testing//Selenium//chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.uitestpractice.com/Students/Actions");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.name("click")).click();
		Thread.sleep(2000);
		
		Actions a=new Actions(driver);
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
	}

}

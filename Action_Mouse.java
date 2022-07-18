package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Mouse {

	public static void main(String[] args) throws InterruptedException {
		
 System.setProperty("webdriver.chrome.driver", "G://Testing//Selenium//chromedriver.exe/");
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.google.com/");
 driver.manage().window().maximize();
 Thread.sleep(2000);
 WebElement a=driver.findElement(By.linkText("Gmail"));
 Actions b= new Actions(driver);
 b.moveToElement(a).perform();
 
//b.click(a).build().perform();
	}

}

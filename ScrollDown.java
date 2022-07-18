package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "G://Testing//Selenium//chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	// Scroll Down
	driver.findElement(By.xpath("//a[text()='Gmail']")).click();
	JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("window.scrollBy(100,2000)");
	Thread.sleep(3000);
	
	// Scroll Up
	driver.findElement(By.xpath("//a[text()='Gmail']")).click();
	JavascriptExecutor j1=(JavascriptExecutor)driver;
	j1.executeScript("window.scrollBy(0,-2000)");
	
}

}


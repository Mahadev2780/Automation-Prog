package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G://Testing//Selenium//chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.switchTo().frame(1);
		driver.findElement(By.linkText("Alert")).click();
		
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("org.openqa.selenium.cli")).click();
		
	}

}

package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G://Testing//Selenium//chromedriver.exe/");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("Nokia");
		Thread.sleep(2000);
		List<WebElement>a=driver.findElements(By.tagName("li"));
		int b=a.size();
		System.out.println(b);
		
		for(int i=0;i<=b-1;i++)
		{
			String abc=a.get(i).getText();
			System.out.println(abc);
			Thread.sleep(2000);
		}
		
	}

}

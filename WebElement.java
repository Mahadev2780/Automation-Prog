package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement  {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G://Testing//Selenium//chromedriver.exe/");
		WebDriver d= new ChromeDriver();
		d.get("https://www.google.com/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		//String abc=d.findElement(By.xpath("//a[text()='Gmail']")).getText();
		//System.out.println(abc);
		String b=d.findElement(By.tagName("a")).getText();
		System.out.println(b);
		//d.close();
		
		
		
	
		

	}
	}



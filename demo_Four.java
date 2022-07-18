package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_Four {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "G://Testing//Selenium//chromedriver.exe/");
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		//d.findElement(By.name("q")).sendKeys("Virat Kohli");
		//d.findElement(By.name("btnk")).click();
		d.navigate().to("https://www.facebook.com/");
		//d.close();
		d.navigate().to("https://www.amazon.in/");
		//d.navigate().back();
		
		

	}

}

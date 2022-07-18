package Automation;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Three {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "G:/Testing/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");
		//driver.manage().window().maximize();
		driver.manage().window().maximize();;
		Thread.sleep(2000);
		//driver.close();
		//String abc=driver.getCurrentUrl();
		//System.out.println(abc);
		driver.findElement(By.name("username")).sendKeys("m2malge");
		//driver.findElement(By.name("pass")).sendKeys("Maddy");
		driver.findElement(By.name("signin")).click();
		//Dimension d=new Dimension(100,100);
		//driver.manage().window().setSize(d);
		//Point p =new Point(200,200);
		//driver.manage().window().setPosition(p);
		//String xyz=driver.getCurrentUrl();
		//System.out.println(xyz);
		//String source=driver.getPageSource();
		//System.out.println(source);
		//String abc=driver.getTitle();
		//System.out.println(abc);
	}

}

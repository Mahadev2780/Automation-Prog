package Automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G://Testing//Selenium//chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String>a=driver.getWindowHandles();
		Iterator<String>b=a.iterator();
		b.next();
		String W2nd=b.next();
		driver.switchTo().window(W2nd);
		driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
		driver.findElement(By.name("btnLogin")).click();

	}

}

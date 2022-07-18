package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G://Testing//Selenium//chromedriver.exe/");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement abc=(WebElement) driver.findElement(By.name("country"));
		Select s =new Select((org.openqa.selenium.WebElement) abc);
		List<WebElement>b=s.getOptions();
		for(int i=0;i<=b.size()-1;i++)
		{
			String xyz =b.get(i).getText();
			System.out.println(xyz);
		
		}
		int z=b.size();
		System.out.println(z);
		
		
	}

}

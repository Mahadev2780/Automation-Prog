package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G://Testing//Selenium//chromedriver.exe/");
		//System.setProperty("webdriver.chrome.driver", "URL");
		WebDriver driver=new ChromeDriver();
		//driver.navigate().to("https://www.facebook.com/");
		//driver.navigate().to("https://www.youtube.com/");
		//String title=driver.getTitle(); 
		//System.out.println(title);
		//driver.get("URL");
		
	}

}

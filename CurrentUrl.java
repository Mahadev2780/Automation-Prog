package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentUrl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.webdriver", "G:/Testing/Selenium/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.youtube.com/");
		driver.navigate().to("https://in.search.yahoo.com/?fr2=inr");
		driver.navigate().forward();
		String url =driver.getCurrentUrl();
		System.out.println(url);

	}

}

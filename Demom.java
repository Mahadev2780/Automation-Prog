package Automation;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demom {
	public static void main(String[] args) throws Exception  {
		System.setProperty("webdiver.chrome.driver", "G://Testing//Selenium//chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Point p= new Point(200,300);
		
		driver.manage().window().setPosition(p);
	}

}

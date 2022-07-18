package Automation;




import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PosDim {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G://Testing//Selenium//chromedriver.exe/");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		//Dimension p=new Dimension(300,400);
		//driver.manage().window().setSize(p);
		//Point p=new Point(200,300);
		//driver.manage().window().setPosition(p);
		String abc=driver.findElement(By.linkText("Gmail")).getText();
		System.out.println(abc);
	}

}

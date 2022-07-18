package Automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Trial {

	public static void main(String[] args) throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver","G:/Testing/Selenium/chromedriver.exe" );
		//WebDriver driver=new ChromeDriver();
		//driver.get("https://www.facebook.com");
		//driver.navigate().to("https://www.google.co.in");

		//driver.manage().window().maximize();
		//Thread.sleep(2000);
		//driver.navigate().to("https://www.google.co.in");
		//Thread.sleep(2000);
		//driver.navigate().to("https://in.search.yahoo.com/?fr2=inr");
		//Thread.sleep(2000);
		//driver.navigate().back();
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@id='email']" )).sendKeys("Mahadev");
		//driver.findElement(By.xpath("//input[@id='pass']"  )).sendKeys("Maddy123");
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		
		//driver.close();
		//File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//File d=new File("C:/Users/DELL/Desktop/ScreenTest.bmp");
		//File d=new File("Screen.bmp");

		//FileHandler.copy(s, d);
		FileInputStream f=new FileInputStream("C:/Users/DELL/Desktop/Excel1.xlsx");
		//String a=WorkbookFactory.create(f).getSheet("Sheet1").getRow(3).getCell(2).getStringCellValue();
		
		Sheet s=WorkbookFactory.create(f).getSheet("Sheet1");
		String a=s.getRow(3).getCell(2).getStringCellValue();
		double b=s.getRow(4).getCell(3).getNumericCellValue();
		System.out.println(a);
		System.out.println(b);

		
	}

}

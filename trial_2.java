package Automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class trial_2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "G://Testing//Selenium//chromedriver.exe/");
		//WebDriver driver=new ChromeDriver();
		//driver.get("https://meet.google.com/landing?lfhs=2");
		//driver.manage().window().maximize();
	    //Thread.sleep(2000);
	   //File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   //File d=new File("C://Users//DELL//Desktop//Screen.bmp");
	   //FileHandler.copy(s, d);
		FileInputStream f =new FileInputStream("C:/Users/DELL/Desktop/Excel2.xlsx");
		Sheet s =WorkbookFactory.create(f).getSheet("Sheet1");
		String a=s.getRow(0).getCell(1).getStringCellValue();
		double b=s.getRow(1).getCell(2).getNumericCellValue();
		System.out.println(a);
		System.out.println(b);

	}

}

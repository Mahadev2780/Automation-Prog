package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
	
	@FindBy(xpath="//input[@type='text']") private WebElement UN;
	@FindBy(xpath="//input[@type='password'] ") private WebElement PWD;
	
	public Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void LoginpageUserName()
	{
		UN.sendKeys("Maddy");
	}
	
	public void LoginpagePassword()
	{
		PWD.sendKeys("Maddy@123");
	}
	
	

}

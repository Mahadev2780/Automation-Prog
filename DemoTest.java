package Automation;

import org.testng.annotations.Test;

public class DemoTest {
  @Test(priority=0)
  public void verifyTitle() {
	  System.out.println("Enter The Url");
  }
  @Test(priority=1)
  public void UserName() {
	  System.out.println("Enter The Username");
	  
  }
  @Test(priority=2)
  public void Password() {
	  System.out.println("Enter The Password");
  }
  @Test(priority=3)
  public void LoginpageButton() {
	  System.out.println("Clock on Button");
  }
}

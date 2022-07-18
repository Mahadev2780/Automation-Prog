package Automation;

import org.testng.annotations.Test;

public class TrialNg {
  @Test
  public void Login() {
	  System.out.println("Login successfully");
  }
  @Test(dependsOnMethods= {"Login"})
  public void Password() {
	  System.out.println("Password entered correctly");
  }
  @Test
  public void Homepage() {
	  System.out.println("HomePage displayed");
  }
  @Test
  public void LogOut() {
	  System.out.println("Logout Successfully");
  }
}

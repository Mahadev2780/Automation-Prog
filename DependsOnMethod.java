package Automation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependsOnMethod {
  @BeforeMethod
  public void Login() {
	  System.out.println("Login Successfully");
  }
  @AfterMethod
  public void Logout() {
	  System.out.println("Logout Successfully");
  }
  @Test
  public void Search() {
	  System.out.println("Search Successfully");
  }
  @Test
  public void AdvanceSearch() {
	  System.out.println("AdvanceSearch Successfully");
  }
}

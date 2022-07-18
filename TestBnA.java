package Automation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBnA {
  @Test
  public class ClassName1 {
	  @BeforeMethod
	  public void login() {
	  System.out.println("Login successfully");
	  }
	  @AfterMethod
	  public void logout() {
	  System.out.println("Logout successfully");
	  }
	  @Test(priority=2)
	  public void addProduct() {
	  System.out.println("Add product successfully");
	  }
	  @Test(priority=1)
	  public void addVendor() {
	  System.out.println("Add vendor successfully");
	  }
	  @Test(priority=3)
	  public void addCurrency() {
	  System.out.println("Add currency successfully");
  }
}
}

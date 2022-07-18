package Automation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Priority {
  @BeforeTest
  public void Entered() {
	  System.out.println("Entered Successfully");
  }
  @AfterTest
  public void Exit() {
	  System.out.println("Exit Successfully");
  }
  @Test(priority=0)
  public void Add() {
	  System.out.println("Add Method");
  }
  @Test(priority=1)
  public void Min() {
	  System.out.println("Min Method");
  }
  @Test(priority=2)
  public void Max() {
	  System.out.println("Max Method");
  }
}

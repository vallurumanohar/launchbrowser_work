package PackTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestTestNG {
  @Test
  public void tc1() {
	  Reporter.log("Execute tc1 test case", true);
  }
  @Test
  public void tc2() {
	  Reporter.log("Execute tc2 test case", true);
  }
  @Test
  public void tc3() {
	  Reporter.log("Execute tc3 test case", true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("Execute tc1 test case", true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("Execute tc1 test case", true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("Execute tc1 test case", true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("Execute tc1 test case", true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("Execute tc1 test case", true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("Execute tc1 test case", true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("Execute tc1 test case", true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("Execute tc1 test case", true);
  }

}

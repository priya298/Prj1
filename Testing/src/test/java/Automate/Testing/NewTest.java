package Automate.Testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;

public class NewTest extends BasePage 
{

  @BeforeClass
  @Parameters("browser")
  public void beforeClass(String browser) throws Exception 
  {
	  browserLaunch(browser, getData("amazonUrl"));
  }
  
  @Test
  public void f() 
  {
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("videos");
  }
  
  @AfterClass
  public void afterClass() 
  {
	  
  }

}

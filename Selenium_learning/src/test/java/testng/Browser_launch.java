package testng;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class Browser_launch  {
	public WebDriver driver;
	 

  @Test(description="launch")
  public void testcase1() {
	  WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	  
  }
  
  @Test(dependsOnMethods="testcase1",description="login")
  public void testcase2() throws Exception {
	  
	  Thread.sleep(1000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
  }
  @Test(dependsOnMethods="testcase2")
  public void testcase3() {
	  driver.findElement(By.id("btnLogin")).click();

  }
	

 
}


package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Admin_page   {
	
	 WebDriver driver;


	 	  @Test
	  public void testcase4()  {
		  
		 driver.findElement(By.xpath("//*[@id=\'menu_admin_viewAdminModule\']/b")).click();
	  }
	  
	  @Test
	  public void testcase5() throws Exception {
	  WebElement job =driver.findElement(By.id("menu_admin_Job"));

      Actions action=new Actions(driver);
      Thread.sleep(1000);
      action.moveToElement(job).click();
	  }

  
	
	  }
	


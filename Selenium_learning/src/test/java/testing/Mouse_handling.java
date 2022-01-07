package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_handling {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
        driver.findElement(By.xpath("//*[@id=\'menu_admin_viewAdminModule\']/b")).click();
        
    WebElement job =driver.findElement(By.id("menu_admin_Job"));
    WebElement jobcategory =driver.findElement(By.id("menu_admin_jobCategory"));
 
    
      
        Actions action=new Actions(driver);
        Thread.sleep(1000);
        action.moveToElement(job).click();
        Thread.sleep(1000);
        action.moveToElement(jobcategory).click().build().perform();
 
        WebElement checkbox =driver.findElement(By.xpath("//*[@id=\"ohrmList_chkSelectRecord_7\"]"));
    
      action.click(checkbox).perform();
   
	}

}

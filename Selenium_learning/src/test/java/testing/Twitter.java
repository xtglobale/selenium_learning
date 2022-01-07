package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Twitter {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).sendKeys("hyderabad deccan");
		driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/input")).click();
		Thread.sleep(2000);
      /* Select date=new Select(driver.findElement(By.xpath
    		   ("//*[@id=\"jDate\"]/span/div/div/div[2]/table/tbody/tr[2]/td[4]/a")));
       date.selectByValue("5");*/
		driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[2]/table/tbody/tr[2]/td[4]/a")).click();
		/*driver.findElement(By.xpath("//*[@id=\"journeyQuota\"]/div/div[3]/span")).click();
		Thread.sleep(2000);
		Select category=new Select(driver.findElement(By.xpath
				("//*[@id=\"journeyQuota\"]/div/div[4]/div/ul/p-dropdownitem[5]/li")));
		category.selectByIndex(2);*/
		driver.findElement(By.xpath("//*[@id=\"journeyClass\"]/div/div[3]/span")).click();
		Select all_class=new Select (driver.findElement(By.xpath("//*[@id=\"journeyClass\"]/div/div[4]/div/ul/p-dropdownitem[2]/li")));
		all_class.selectByVisibleText("Anubhuti Class (EA)");
	}

}

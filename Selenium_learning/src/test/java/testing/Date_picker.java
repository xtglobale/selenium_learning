package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Date_picker {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("vij");
	
		driver.findElement(By.id("dest")).sendKeys("Hyderabad");
		
		
		driver.findElement(By.id("onward_cal")).click();
		/*driver.findElement(By.xpath
				("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[4]/td[3]")).click();*/
		driver.findElement(By.xpath
				("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
	driver.findElement(By.xpath
				("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[4]/td[4]")).click();
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[3]/button")).click();
	
	
	
	}

}

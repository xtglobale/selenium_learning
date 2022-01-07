package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Click_hold {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement item1=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
		WebElement item2=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]"));
		WebElement item3=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]"));
		WebElement item4=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]"));
		
		Actions action=new Actions(driver);
		action.clickAndHold(item1).clickAndHold(item4).release().build().perform();
		
		
	}

}

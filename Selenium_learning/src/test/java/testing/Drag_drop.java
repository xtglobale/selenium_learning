package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_drop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Actions action=new Actions(driver);
		
		action.dragAndDrop(drag, drop).build().perform();
	}

}

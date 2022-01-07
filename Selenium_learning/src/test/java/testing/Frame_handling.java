package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame_handling {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement text= driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
		
		System.out.println(text.getText());

	}

}

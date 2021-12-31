package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	 WebDriver driver;
	//public static void main(String[] args) {
		// in place of system.set property we use webdrivermanager to get latest version
		public void launch() {
			
			
		WebDriverManager.chromedriver().setup();//to download latest version
		driver=new ChromeDriver();//going to launch chrome browser
		driver.get("https://www.facebook.com/");//launch the browser
		}
		public void details() {
		driver.findElement(By.id("email")).sendKeys("devi");
		driver.findElement(By.id("pass")).sendKeys("prasanna");
		driver.findElement(By.xpath("//*[@name='login']")).click();
		//driver.close();//close the browser
		
		}

}

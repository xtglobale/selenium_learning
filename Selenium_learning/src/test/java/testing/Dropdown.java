package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();//to download latest version
		WebDriver driver=new ChromeDriver();//going to launch chrome browser
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805499%7Ce%7Cfacebook%20create%20account%7C&placement=&creative=550525805499&keyword=facebook%20create%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-18000061760%26loc_physical_ms%3D1007740%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQiAt8WOBhDbARIsANQLp9638zJzjWECH1AyLk0AieysZHSc_rSDxqNXSkaRVoR8Fce9Vm84-KkaAlw9EALw_wcB");
      Select day=new Select(driver.findElement(By.id("day")));
      day.selectByVisibleText("20");
      Select month=new Select(driver.findElement(By.id("month")));
    //  month.selectByVisibleText("Nov");
     // month.selectByIndex(2);
      month.selectByValue("7");
      
      
      
	}

}

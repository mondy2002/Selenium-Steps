package mouseandkeyboard;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import locators.ID;

public class windowsewitch {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://blog.hubspot.com/website/how-to-open-external-links-in-a-new-window-in-wordpress");
			WebElement  ori = driver.findElement(By.linkText("link building strategy"));
	           //WebDriverWait wait = new WebDriverWait(driver,   Duration.ofMinutes(1) );
	       
			ori.click();
			Set<String> ids =driver.getWindowHandles();
			
			Iterator <String> it =ids.iterator();
			String parentid =it.next();
			String childid =it.next();
			driver.switchTo().window(childid);
			System.out.println(driver.getCurrentUrl());


	}

}

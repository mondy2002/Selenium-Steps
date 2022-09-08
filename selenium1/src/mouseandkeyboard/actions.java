package mouseandkeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.facebook.com/signup");
			driver.manage().window().maximize();
			Actions action=new Actions(driver); 
			WebElement first =driver.findElement(By.name("firstname"));
			action.moveToElement(first).click().sendKeys("mondy").doubleClick().build().perform();
			//context click means right click 
			action.moveToElement(first).contextClick().build().perform();
			//if i want to press the shift button on the keyboard to send capital letters 
			action.moveToElement(first).click().keyDown(Keys.SHIFT).sendKeys("mondy").doubleClick().build().perform();
	}

}

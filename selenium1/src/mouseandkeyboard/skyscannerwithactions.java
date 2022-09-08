package mouseandkeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class skyscannerwithactions {

	public static void main(String[] args) {
		  //System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		     WebDriverManager.chromedriver().setup();
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
		
			driver.get("https://www.skyscanner.net/");
			WebElement  ori = driver.findElement(By.name("fsc-origin-search"));
			ori.clear();
			ori.sendKeys("cairo");
			ori.sendKeys(Keys.TAB);
			ori.clear();
			
			Actions action=new Actions(driver); 
			action.sendKeys("new york").build().perform();
			for (int i=0;i<4;i++)
			{
				action.sendKeys(Keys.TAB).build().perform();
			}
			action.sendKeys(Keys.ENTER).build().perform();	

	}

}

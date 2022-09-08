package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticdynamicdropdown {

	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				driver.get("https://www.facebook.com/signup");
				driver.manage().window().maximize();
				WebElement day=driver.findElement(By.id("day"));
		
			 Select dayvalue= new Select(day); 
			 dayvalue.selectByValue("7");
			 dayvalue.selectByIndex(7);
			 dayvalue.selectByVisibleText("31");
			 WebElement option1 = driver.findElement(By.xpath("//label[@class='_58mt']"));
			 option1.click();

	}

}

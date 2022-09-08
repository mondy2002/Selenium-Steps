package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isdisplayed {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.kayak.com/flights?lang=en&skipapp=true&gclid=Cj0KCQjw2_OWBhDqARIsAAUNTTFIkLA_23PXiBIvQy8MNlpEDukwmXfK3iwGPOEjdtsi3yE2oOC71kgaAvLPEALw_wcB&aid=83197552261");
			
			System.out.println(driver.findElement(By.xpath("//span[@aria-label='End date calendar input']")).isDisplayed());
			
			WebElement kind =driver.findElement(By.xpath("//svg[@class='wIIH-chevron']"));
			kind.click();
			Select type= new Select(kind);
		
			driver.findElement(By.xpath("//span[@aria-label='One-way']")).click();
			
	        System.out.println(driver.findElement(By.xpath("//span[@aria-label='End date calendar input']")).isDisplayed());
	

	}

}

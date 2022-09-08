package advanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calenderhack {

	public static void main(String[] args) {
		    System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		   
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.booking.com/index.html?aid=7920626");
			//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			//this code dont workkkkkkkkk
			WebElement date  =driver.findElement(By.xpath("//div[@data-placeholder='Check-in']"));
			JavascriptExecutor js= ((JavascriptExecutor) driver);
			 js.executeScript("arguments[0].removeAttribute('data-display aria-hidden')", date);
			
			 WebElement date2  =driver.findElement(By.xpath("//div[@data-placeholder='Check-in']"));
			  js.executeScript("arguments[0].setAttribute('value','28/02/2022')", date2);
			 // driver.findElement(By.xpath("//div[@data-placeholder='Check-in']")).sendKeys("28/02/2022");
			
	}

}

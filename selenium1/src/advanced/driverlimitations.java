package advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverlimitations {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.bbc.com/");
			WebElement footer = driver.findElement(By.className("orb-footer-inner"));
			//that is the way to print out the number of links in the footer 
			 List<WebElement> links = footer.findElements(By.tagName("a"));
		      System.out.println( links.size());

	}

}

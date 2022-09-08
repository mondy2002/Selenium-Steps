package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxes {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://echoecho.com/htmlforms09.htm");
			driver.manage().window().maximize();
			List <WebElement> checkboxes=driver.findElements(By.xpath("//input[@name='Checkbox']"));
			checkboxes.get(1).click();
			int count =driver.findElements(By.xpath("//input[@name='Checkbox']")).size();
			for (int i =0;i<count ;i++)
			
			{
				driver.findElements(By.xpath("//input[@name='Checkbox']")).get(i).click();
			}
			

	}

}

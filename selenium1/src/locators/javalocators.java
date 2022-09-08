package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javalocators {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://echoecho.com/javascript4.htm");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@value='alert box']")).click();
			driver.switchTo().alert().accept();
			driver.findElement(By.xpath("//input[@value='confirm box']")).click();
			driver.switchTo().alert().dismiss();
			driver.findElement(By.xpath("//input[@value='prompt box']")).click();
			driver.switchTo().alert().sendKeys("ef2kn");

	}

}

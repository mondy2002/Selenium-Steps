package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecuter {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://demo.guru99.com/test/guru99home/");
			WebElement btn =driver.findElement(By.id("philadelphia-field-submit"));
			JavascriptExecutor js= ((JavascriptExecutor) driver);
			js.executeScript("arguments[0].scrollIntoView(true);",btn);
			js.executeScript("arguments[0].style.border='3px solid red';",btn);
			js.executeScript("alert ('"+"hi, i am expert"+"')");
			

	}
}

	

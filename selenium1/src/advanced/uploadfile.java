package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadfile {

	public static void main(String[] args) {
	            System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		   
				WebDriver driver =new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://tus.io/demo.html");
				driver.findElement(By.id("js-file-input")).sendKeys("C:\\Mondy_cv.pdf");

	}

}

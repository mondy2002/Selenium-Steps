package advanced;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class implicitandexplicitwait {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("http://library-app.firebaseapp.com");
			// implicit wait is dynamic and supported by selenium and and global
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.findElement(By.id("ember12")).click();
			// explicit wait is dynamic and supported by selenium and and private

           //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120, 1));
           //wait.until(ExpectedConditions.elementToBeClickable(  driver.findElement(By.id("ember31"))));
            
            driver.findElement(By.id("ember31")).click();
            driver.navigate().back();


	}

}

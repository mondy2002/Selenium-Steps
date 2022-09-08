package advanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class deletecookies {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		   
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cookiebot.com/en/cookie-checker/?utm_source=google&utm_medium=cpc&utm_campaign=middle-east-asia-generic&utm_device=c&utm_term=website%20cookies&utm_content=asia-eng-cookies-website&gclid=Cj0KCQjw54iXBhCXARIsADWpsG9ZsJQ_IK44pjG2dDYcM__kFblLz2PLM2HAELv5WX_kYuZafvKRALMaAojuEALw_wcB");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		/* driver.manage().deletecookiename("");
		 * this is used to delete cookie with specified name 
*/
	}

}

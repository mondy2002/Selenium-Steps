import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("http://www.google.com/");
			driver.manage().window().maximize();
			driver.navigate().to("http://www.facebook.com/");
			driver.navigate().back();
			driver.navigate().forward();

	}

}

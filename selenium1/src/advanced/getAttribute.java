package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		   
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		String logattribute="https://ir.ebaystatic.com/rs/v/fxxj3ttftm5ltcqnto1o4baovyl.png";
        System.out.println(driver.findElement(By.id("gh-logo")).getAttribute("src"));
	}

}

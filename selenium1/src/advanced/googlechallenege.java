package advanced;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class googlechallenege {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		   
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("Eg");
		WebElement list =driver.findElement(By.xpath("//ul[@role='listbox']"));
	
		List <WebElement> options= list.findElements(By.tagName("span"));
		int count =options.size();
		for (int i=0;i<count;i++)
		{
			System.out.println(options.get(i).getText());
		}


	}

}

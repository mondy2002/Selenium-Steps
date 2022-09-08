package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

final class clickonelementbytext {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		   
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		//driver.findElement(By.xpath("//*[text()='Solid Documents']")).click();
		//you can use contains if you dont have the exact name 
		driver.findElement(By.xpath("//*[contains(text(),'Solid')]")).click();

	}

}

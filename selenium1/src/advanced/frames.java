package advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://demo.guru99.com/test/guru99home/");
			//you have to move to the frame of the photo cause you still can"t access it   
			// driver.switchTo().frame("a077aa5e");
			
			// if there is no id or name to the  frame we can access it by the xpath 
			//WebElement frame = driver .findElement(By.xpath("//iframe[@id='a077aa5e']"));
			//driver.switchTo().frame(frame);
			//driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
			//another way if there are more than one frame and i dont know the id of the frame 
			
			int count =driver.findElements(By.tagName("iframe")).size();
			for (int i=0;i<count;i++)
			{
				driver.switchTo().frame(i);
				int frame =driver.findElements(By.xpath("//img[@src='Jmeter720.png']")).size();
				System.out.println(frame);
				driver.switchTo().defaultContent();
			}
			// now after i ran this code i have known the specific frame and then i can execute the code above this block of code 
			
			

	}

}

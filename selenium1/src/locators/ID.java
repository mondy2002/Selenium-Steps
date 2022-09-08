package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {

	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("http://www.facebook.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("email")).sendKeys("mondy");
			// driver.findElement(By.linkText("Forgotten password?")).click();
			//xpath
			//this is the x path -->      //tagname [@attribute='value']
			//another way to search the likelyhhod of the attribute 
			//     tagname [contains(@ attrribute ,'value')]
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123");
			//to check if the xpath is valid or not you can go to the console beside the inspect and write small jave script code 
			//$x(xpath)
			//i can use this way for xpath to choose the second element for many elements that have the same xpath
			//driver.findElement(By.xpath("//input[@type='password'][2]")).sendKeys("123");
		      /*css selector syntax    tagname [attribute='value']
			or   tagname # id
			driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123");
			driver.findElement(By.cssSelector("input#password")).sendKeys("123");
			css selector by class name         tagname.classname 
			driver.findElement(By.cssSelector("class._6luy _55r1")).sendKeys("222");
to check if the css selector is valid just type in console    $$(".classname")
			*/
	


	}
}

package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setchrome {

	public static  void main(String[] args) {
      System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("http://www.google.com/");
	String url = driver.getCurrentUrl();
	if (url.equals("https://www.google.com/?gws_rd=ssl"))
	{
		System.out.println(" url pass");
	}
	else
	{
		System.out.println(" url fail");
	}
		
	String title =driver.getTitle();
	if (title.equals("Google"))
	{
		System.out.println(" title  pass");
	}
	else
	{
		System.out.println(" title fail");
	}
	
	
	
	
	
	}

}

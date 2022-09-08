import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class runseleniumonIE {

	public static void main(String[] args) {
	      System.setProperty("webdriver.edge.driver", "C:\\browsers\\msedgedriver.exe");
	  	WebDriver driver =new EdgeDriver();
	  	driver.get("http://www.google.com/");

	}

}

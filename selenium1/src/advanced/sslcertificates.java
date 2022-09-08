package advanced;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class sslcertificates {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
        // this is how to accept ssl certificates in case that website  dont accept it
        // or insecure websites 
		   ChromeOptions option = new ChromeOptions(); 
		   option.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		   option.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		   option.addArguments("--incognito");  // that is used to open it in incognito mode 
		WebDriver driver =new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

	}

}

package SelGrid.SelGrid;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
 
import java.net.MalformedURLException;
import java.net.URL;


public class App 
{
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);

		RemoteWebDriver driver= new RemoteWebDriver(new URL("http://192.168.1.100:9890/wd/hub"), dc);
		
		//Load the Url
		driver.get("http://www.leaftaps.com/opentaps");
		
		//Enter the username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		//Enter the Password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//Click on Login
		driver.findElementByClassName("decorativeSubmit").click();
		
		//Click on Logout
		driver.findElementByClassName("decorativeSubmit").click();
	}
}

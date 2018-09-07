package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

/*
 * @Author: Dhairya
 * Date: 7th Aug. 2018
 * @Class: Provide Singleton driver object to run test in browser set in configuration file. 
 */
public class SeleniumDriver {
	
	static String browser = ElementUtilities.getValue("browser");
	private static WebDriver driver;

	/*
	 * @Author: Dhairya
	 * Date: 7th Aug. 2018
	 * @Method: Provide Singleton driver object to run test. 
	 */
	
	public static WebDriver getDriver(){
		
		if(driver == null){
			
		switch (browser)
		{
			case("chrome"):
			{
				
// Creating chrome Driver
				
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
			
// Deleting cookies of browser before starting automation.
			
			driver.manage().deleteAllCookies();
		
			break;
			}
			
//Creating IE Driver
			
			case("ie"):
			{
			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			DesiredCapabilities ieCap =  DesiredCapabilities.internetExplorer();
			ieCap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
			driver.manage().deleteAllCookies();
			
			break;
			}
			/*
			 *  in selenium 3.0 we need to use gecko driver but as we are using 2.53 version 
			 *  so directly can intentiate driver of firefox.
			 *  Default firefox browser
			 */
			default:
			case("firefox"):
			{
				ProfilesIni profile = new ProfilesIni();
				FirefoxProfile myprofile = profile.getProfile("default");
				driver = new FirefoxDriver(myprofile);
				driver.manage().deleteAllCookies();
				break;
			}
			
		}
	}
		return driver;
}
}


	


}

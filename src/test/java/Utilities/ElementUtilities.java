package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtilities {

	static WebDriver driver = SeleniumDriver.getDriver();
	static WebElement element;

	/*
	 * @Author Dhairya Yadav Date: 7th Aug. 2018
	 * 
	 * @Method: Method is used to search the element on webpage.
	 * 
	 * It has following advantages over POM Model:
	 * 
	 * It auto scroll the webpage if element is not visible in current view. It
	 * applies dynamic wait to element till it is visible. It bring the element
	 * into focus to act on it. Find element and return for further use.
	 * 
	 * POM Model just identifies element using property. Don't provide option if
	 * element not visible till scroll etc. But this generic logic will help.
	 */

	public static WebElement searchElement(String elementId) {

		String xpath = ElementUtilities.getXpathValue(elementId);

		try {

			// Defining dynamic wait by taking time from configuration file.

			WebDriverWait wait = new WebDriverWait(driver,
					Integer.parseInt(ElementUtilities.getConfigurationValue("dynamicTimeout")));

			// Dynamic wait till found.

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));

			// Define element using xpath.

			element = driver.findElement(By.xpath(xpath));

			// scroll till element is visible.

			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

			// Take element into focus.

			Actions actions = new Actions(driver);
			actions.moveToElement(element);
			actions.perform();

			// Wait to adjust execution sync.

			Thread.sleep(500);

		} catch (ElementNotVisibleException e) {
			e.getMessage();
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return element;
	}

	public static boolean clickWhenEnable(WebElement element){
		if(element.isEnabled()){
			element.click();
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean inputWhenEnable(WebElement element, String value){
		if(element.isEnabled()){
			element.sendKeys(value);
			return true;
		}else{
			return false;
		}
	}
	/*
	 * @Author Dhairya Yadav Date: 7th Aug. 2018
	 * 
	 * @Method: Method is used to read value from property file for a given key.
	 */

	public static String getConfigurationValue(String key) {
		File file = new File("Configuration.properties");
		Properties property = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			property.load(fis);
		} catch (FileNotFoundException e) {
			System.out.println("Configuration file not found");
			e.getMessage();
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Exception while reading configuration value for " + key);
			e.getMessage();
			e.printStackTrace();
		}

		// return value for Key

		String value = property.getProperty(key);
		return value;
	}

	/*
	 * @Method is implemented to get xpath value of key provided.
	 */
	public static String getXpathValue(String key) {
		File file = new File("ObjectRepositories.properties");
		Properties property = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			property.load(fis);
		} catch (FileNotFoundException e) {
			System.out.println("Object Identification  file not found");
			e.getMessage();
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Exception while reading Object Identification value for " + key);
			e.getMessage();
			e.printStackTrace();
		}

		// return value for Key

		String value = property.getProperty(key);
		return value;
	}

}
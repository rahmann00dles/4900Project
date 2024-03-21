package Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	
	public static WebDriver driverSetup(String browser) {
		
		switch(browser) {
		case "Chrome":
		case "chrome":
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			return driver;
		case "Firefox":
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver1 = new FirefoxDriver();
			return driver1;
		default:
			WebDriverManager.iedriver().setup();
			WebDriver driver2 = new EdgeDriver();
			return driver2;
		}
		
	}

}

package Selenium;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class testcap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragini\\Downloads\\chromedriver.exe");

		driver = new ChromeDriver();

		// Go to URL
		driver.get("https://www.stqatools.com/");
		driver.manage().window().maximize();
		// Created object of DesiredCapabilities class
		DesiredCapabilities capabilities = new DesiredCapabilities();
		// Set your device name
		capabilities.setCapability("deviceName", "your Device Name");
		// Set BROWSER_NAME desired capability.
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		// Set your mobile device's OS version.
		capabilities.setCapability(CapabilityType.BROWSER_VERSION, "5.1");
		// Set android platformName desired capability.
		capabilities.setCapability("platformName", "Android");
		System.out.println("Setting android platform");
		driver.quit();
		
	}

}

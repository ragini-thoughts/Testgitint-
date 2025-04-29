package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class opennewtab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragini\\Downloads\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//Navigating to amazon.com
		driver.get("https://www.amazon.in//");
		driver.manage().window().maximize();
		String currentHandle= driver.getWindowHandle();
		// Searching for Headphones
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Headphones", Keys.ENTER);

		//Clicking on search button
		String UrlToClick=driver.findElement(By.xpath("//span[contains(text(),'Infinity (JBL) Glide 500 Wireless Headphones with ')]")).getAttribute("href");
driver.quit();	
	}

}

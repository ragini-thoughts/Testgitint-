package Selenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardIntera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragini\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.stqatools.com");
		driver.manage().window().maximize();

// Create object of Action class
		Actions action = new Actions(driver);

// Sendkeys using Action class object
		action.sendKeys(Keys.ENTER).build().perform();

// Send mulyiple keys using action class
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();

	}

}

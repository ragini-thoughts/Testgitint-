package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragini\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://artoftesting.com/sampleSiteForSelenium");
		driver.manage().window().maximize();
		//Double click the button to launch an alertbox
				Actions action = new Actions(driver);
				WebElement btn = driver.findElement(By.id("dblClkBtn"));
				action.doubleClick(btn).perform();
				
				//Thread.sleep just for user to notice the event
				Thread.sleep(3000);
				
				//Closing the driver instance
				driver.quit();
	}

}

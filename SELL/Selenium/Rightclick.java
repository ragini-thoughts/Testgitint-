package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragini\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
	//	Options.addArguments("--remote-allow-origins=*");
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		//Right click in the TextBox
				Actions action = new Actions(driver);
				WebElement searchBox = driver.findElement(By.id("fname"));
				action.contextClick(searchBox).perform();
				
				//Thread.sleep just for user to notice the event
				Thread.sleep(3000);
				
				//Closing the driver instance
				driver.quit();
	}

}

package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBackForwHis {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragini\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Navigating to the desired website
		driver.get("https://artoftesting.com/sampleSiteForSelenium");
		//Used for demo purpose only, not required
		Thread.sleep(4000);
		//Clicking a link
		WebElement artOfTestingLogo = driver.findElement(By.cssSelector("div.navbar-header"));
		artOfTestingLogo.click();
		//Navigating back in browser 
		driver.navigate().back();
		//Used for demo purpose only, not required
		Thread.sleep(4000);
		//Navigating forward in browser 
		driver.navigate().forward();
	}

}

package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
@Test
public class testScroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragini\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		//Launch flipkart
		driver.get("http://www.flipkart.com");
					
		//Write the search term - Buddha in search box
		WebElement searchBox = driver.findElement(By.id("fk-top-search-box"));
		searchBox.sendKeys("Buddha");
				
		//Click on searchButton
		WebElement searchButton = driver.findElement(By.className("search-bar-submit"));
		searchButton.click();
		
		//Inserting an optional wait of 3 seconds just to notice scroll down event
		Thread.sleep(3000);
		
		//Scroll down the webpage by 2500 pixels
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0, 2500)"); 
				
		//Optional Wait
	        Thread.sleep(3000);
	}
	}



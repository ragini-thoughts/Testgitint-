package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Select {

	public static void selectByVisibleText(String string) {
		// TODO Auto-generated method stub
		
				// TODO Auto-generated method stub
				WebDriver driver;
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragini\\Downloads\\chromedriver.exe");
				driver = new ChromeDriver();
				// CSS Selector Rule – #id
				// <button id="submitButton1" type="button" class="btn">Submit</button>
				// syntax- css=tag#id
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				driver.findElement(By.id("email")).sendKeys("Arnav");
				driver.findElement(By.id("pass")).sendKeys("a");
				driver.findElement(By.name("login")).click();
			}

			{
				// Use class selector
				WebDriver driver;
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragini\\Downloads\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("https://www.browserstack.com/");
				Actions action = new Actions(driver); 
				WebElement Element = driver.findElement(By.linkText("Get started free"));

				action.moveToElement(Element).click();
			}

		
	
	}



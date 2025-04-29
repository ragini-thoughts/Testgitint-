package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating instance of Chrome driver
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragini\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();

		// Step#2- Launching URL
		driver.get("https://demo.guru99.com/test/newtours/register.php");

		// Maximizing window
				driver.manage().window().maximize();
				Select drpCountry = new Select();
				drpCountry.selectByVisibleText("ANTARCTICA");
				// Selecting Items in a Multiple SELECT elements
				driver.get("http://jsbin.com/osebed/2");
				Select fruits = new Select();
				fruits.selectByVisibleText("Banana");
				System.out.println("SElected Banana");
				//fruits.selectByIndex(1);
	}

}

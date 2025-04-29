package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class allselectorss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragini.DESKTOP-1J8B12N\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
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

}


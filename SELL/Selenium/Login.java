package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragini\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://apps.goultimus.in/");
		driver.manage().window().maximize();	
		driver.findElement(By.id("soccode")).sendKeys("442144");
		driver.findElement(By.id("username")).sendKeys("kop");
		driver.findElement(By.id("password")).sendKeys("a");
		driver.findElement(By.id("loginButton")).click();
		System.out.println("Login Done with Submit");
	}

}

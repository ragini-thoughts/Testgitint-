package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragini\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		//Selecting Checkbox and using isSelected Method		
        driver.get("https://demo.guru99.com/test/facebook.html");	
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("Angha");
        driver.findElement(By.id("pass")).sendKeys("123456");
        driver.findElement(By.id("loginbutton")).click();
	}

}

package Selenium;


import java.lang.module.ModuleDescriptor.Opens;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class selectdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragini\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://apps.goultimus.in/");
		driver.manage().window().maximize();
		// WebElement element = driver.findElement(By.id("elementId"));
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("soccode")).sendKeys("442144");
		driver.findElement(By.id("username")).sendKeys("kop");
		driver.findElement(By.id("password")).sendKeys("a");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//a[@id='menuID1']")).click();
		driver.findElement(By.xpath("//button[@id='agentShowTransactionButton11']")).click();
		WebElement datebox = driver.findElement(By.xpath("//input[@id='transactionListDate']"));
		datebox.clear();
	    datebox.sendKeys("07/04/2023");
	   
	   datebox.click();
	    
		
	}


}

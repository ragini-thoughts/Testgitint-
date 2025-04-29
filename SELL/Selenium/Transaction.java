package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Transaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C://Users//ragini.DESKTOP-1J8B12N//Downloads//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://coop.goultimus.in/");
		driver.manage().window().maximize();
		// WebElement element = driver.findElement(By.id("elementId"));
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("soccode")).sendKeys("442144");
		driver.findElement(By.id("username")).sendKeys("kop");
		driver.findElement(By.id("password")).sendKeys("a");
		driver.findElement(By.id("loginButton")).click();
		System.out.println("Login Done with Submit");
		// driver.findElement(By.id("menuID1")).click();
		// driver.findElement(By.id("agentShowTransactionButton11")).click();
		driver.findElement(By.xpath("//a[@id='menuID1']")).click();
		driver.findElement(By.xpath("//button[@id='agentShowTransactionButton11']")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}

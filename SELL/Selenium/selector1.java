package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	// Use class selector
			WebDriver driver;
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragini\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
		//	String eTitle = "Demo Guru99 Page";
		//	String aTitle = "";
			driver.get("http://demo.guru99.com/test/newtours/register.php");
		System.out.println(driver.getTitle());
		String S = "9999999999";
		String S1 = "789456";	
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("table:nth-child(2) tbody:nth-child(1) tr:nth-child(2) td:nth-child(2) > input:nth-child(1)")).sendKeys("Suyog");
		driver.findElement(By.cssSelector("table:nth-child(2) tbody:nth-child(1) tr:nth-child(3) td:nth-child(2) > input:nth-child(1)")).sendKeys("Amol");
		driver.findElement(By.cssSelector("table:nth-child(2) tbody:nth-child(1) tr:nth-child(4) td:nth-child(2) > input:nth-child(1)")).sendKeys("9999999999");
		if (S.equals(S1)) {
			System.out.println("Valid ");
		} else {
			System.out.println("Invalid");
		}
		driver.findElement(By.cssSelector("#userName")).sendKeys("a@gmail.com");
		if(driver.getPageSource().contains("Register: Mercury Tours")){
			System.out.println("Text is present");
			}else{
			System.out.println("Text is absent");
			
			}
		}
	}



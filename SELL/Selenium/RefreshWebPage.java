package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshWebPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Driver.navigate.refresh command
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C://Users//ragini.DESKTOP-1J8B12N//Downloads//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://apps.goultimus.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("soccode")).sendKeys("442144");
		driver.findElement(By.id("username")).sendKeys("kop");
		driver.findElement(By.id("password")).sendKeys("a");
		driver.navigate().refresh();
	}

	public static class Getmethod {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			// Driver.navigate.refresh command
			WebDriver driver;
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragini\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://apps.goultimus.in/");
			driver.manage().window().maximize();
			driver.findElement(By.id("soccode")).sendKeys("442144");
			driver.findElement(By.id("username")).sendKeys("kop");
			driver.findElement(By.id("password")).sendKeys("a");
			driver.get(driver.getCurrentUrl());
		}

		public static class Navigatemethod {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				// Driver.navigate.refresh command
				WebDriver driver;
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragini\\Downloads\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("https://apps.goultimus.in/");
				driver.manage().window().maximize();
				driver.findElement(By.id("soccode")).sendKeys("442144");
				driver.findElement(By.id("username")).sendKeys("kop");
				driver.findElement(By.id("password")).sendKeys("a");
				driver.navigate().to(driver.getCurrentUrl());
			}

			public static class SendKeysmethodusingF5Key {

				public static void main(String[] args) {
					// TODO Auto-generated method stub
					// Driver.navigate.refresh command
					WebDriver driver;
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragini\\Downloads\\chromedriver.exe");
					driver = new ChromeDriver();
					driver.get("https://apps.goultimus.in/");
					driver.manage().window().maximize();
					driver.findElement(By.id("soccode")).sendKeys("442144");
					driver.findElement(By.id("username")).sendKeys("kop");
					driver.findElement(By.id("password")).sendKeys("a");
					driver.findElement(By.id("username")).sendKeys(Keys.F5);
				}
			}
		}
	}
}
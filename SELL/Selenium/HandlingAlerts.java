package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragini\\Downloads\\chromedriver.exe");

		driver = new ChromeDriver();
//Set implicit wait of 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		// Handling alert boxes
		// Click on generate alert button
		driver.findElement(By.cssSelector("div#AlertBox button")).click();
		Thread.sleep(3000);
		// Using Alert class to first switch to or focus to the alert box
		Alert alert = driver.switchTo().alert();
		// Using accept() method to accept the alert box
		alert.accept();
		// Handling confirm box
		// Click on Generate Confirm Box
		driver.findElement(By.cssSelector("div#ConfirmBox button")).click();
		Thread.sleep(3000);
		Alert confirmBox = driver.switchTo().alert();
		// Using dismiss() command to dismiss the confirm box
		// Similarly accept can be used to accept the confirm box
		confirmBox.dismiss();

		// Handling prompt box`
		// Click on Generate Prompt Box
		// driver.findElement(By.cssSelector("div#PromptBox button")).click();
		// Thread.sleep(3000);
		// Alert promptBox = driver.switchTo().alert();
		// Using accept() method to accept the prompt box

		// promptBox.accept();
		// Thread.sleep(3000);
		// driver.quit();
//
	}

}

package Selenium;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickCMDOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragini\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://the-internet.herokuapp.com/context_menu");
		WebElement clickable = driver.findElement(By.id("hot-spot"));
		new Actions(driver).contextClick(clickable).perform();
		Alert alert = new WebDriverWait(driver, Duration.ofSeconds(2)).until(ExpectedConditions.alertIsPresent());
		// Assertions.assertEquals("You selected a context menu",
		alert.getText();
		System.out.println("You selected a context menu");
	}
}

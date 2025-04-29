package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.NoSuchElementException;
public class CheckVisibile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragini\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	      driver.get("https://www.tutorialspoint.com/index.htm");
	      try {
	         // identify element
	         WebElement t = driver.findElement(By.cssSelector("h4"));
	         // Explicit wait condition for visibility of element
	         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	         wait.until(ExpectedConditions .visibilityOfElementLocated(By.cssSelector("h4")));
	         System.out.println("Element is visible");
	      }
	      catch(NoSuchElementException n) {
	         System.out.println("Element is invisible");
	      }
	      driver.close();
	}

}

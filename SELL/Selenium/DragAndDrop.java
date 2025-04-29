package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragini\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/v");
		driver.getCurrentUrl();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		source.click();
		// dragAndDrop() method for dragging the element from source to //destination
		Actions a = new Actions(driver);
		Thread.sleep(5000);
		a.dragAndDrop(source, target).build().perform();
		Thread.sleep(5000);
		driver.quit();
	}

}

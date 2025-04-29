package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollUpDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragini\\Downloads\\chromedriver.exe");
	driver = new ChromeDriver();
	//Implivit wait
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	//URL Launch
	driver.get("https://www.tutorialspoint.com/index.htm");
	// scroll down by 500 pixels with Javascript Executor
	JavascriptExecutor j = (JavascriptExecutor) driver;
    j.executeScript("window.scrollBy(0,500)");
    // identify element
    WebElement m = driver.findElement(By.linkText("Latest Courses"));
    String s = m.getText();
    System.out.println("Text obtained on scrolling down: "+ s);
    // scroll down up 500 pixels with Javascript Executor
    j.executeScript("window.scrollBy(0,-500)");
    // identify element
    WebElement n = driver.findElement(By.tagName("h4"));
    String r = n.getText();
    System.out.println("Text obtained on scrolling up: "+ r);
    driver.quit();
	}

}

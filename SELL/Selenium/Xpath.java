package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragini\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
		driver.manage().window().maximize();
		// identify elements with findElements xpath
		List p = driver.findElements(By.xpath("//ul[@class='toc reading']/li"));
		// count of list of matching elements
		int s = p.size();
		// identify element with xpath
		WebElement m = driver.findElement(By.xpath("//ul[@class='toc reading']/li[1]"));
		System.out.println("Element text is: " + m.getText());

		driver.quit();
	}

}

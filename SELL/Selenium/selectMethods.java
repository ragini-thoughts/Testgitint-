package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectMethods {

	public static class Dropdowns {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriver driver;
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragini\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();

			driver.get("https://www.bstackdemo.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//select")).click();
			List<WebElement> allOptions = driver.findElements(By.cssSelector("select option"));
			String option = "Highest to lowest";
// Iterate the list using for loop
			for (int i = 0; i < allOptions.size(); i++) {
				if (allOptions.get(i).getText().contains(option)) {
					allOptions.get(i).click();
					System.out.println("clicked");
					break;

				}

			}
		}

	}
}

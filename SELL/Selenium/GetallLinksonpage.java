package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetallLinksonpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragini\\Downloads\\chromedriver.exe");

		driver = new ChromeDriver();
		//Launching sample website
		 driver.get("https://artoftesting.com/sampleSiteForSelenium");
		 driver.manage().window().maximize();
		 
		 //Get list of web-elements with tagName  - a
		 List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		 
		 //Traversing through the list and printing its text along with link address
		 for(WebElement link:allLinks){
		 System.out.println(link.getText() + " - " + link.getAttribute("href"));
		 }
		 
		 //Commenting driver.quit() for user to easily verify the links
		driver.quit();
	}

}

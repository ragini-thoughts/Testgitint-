package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class captchcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C://Users//ragini.DESKTOP-1J8B12N//Downloads//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://yourwebsites.com");
		driver.manage().window().maximize();
        driver.getTitle();
        WebElement contextMenuElement = driver.findElement(By.id("idOfElement")); 
        
//        WebElement clickable = null;
//		new Actions(driver).contextClick(clickable).perform();
        Actions actions = new Actions(driver); 
        actions.contextClick(contextMenuElement).build().perform(); 
 
         
        WebElement menuItem = driver.findElement(By.xpath("xpath of element")); 
        menuItem.click(); 
 
        driver.quit();  
	}

}

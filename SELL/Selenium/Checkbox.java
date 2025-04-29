package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C://Users//ragini.DESKTOP-1J8B12N//Downloads//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		driver = new ChromeDriver();
		//Selecting Checkbox and using isSelected Method		
        driver.get("https://demo.guru99.com/test/facebook.html");	
        driver.manage().window().maximize();
        WebElement chkFBPersist = driver.findElement(By.id("persist_box"));							
        for (int i=0; i<2; i++) {											
            chkFBPersist.click (); 			
            System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());							
        }		
		//driver.close();	
	}

}

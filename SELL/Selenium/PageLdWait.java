package Selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLdWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragini\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		//implicit wait
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      //URL launch
	      driver.get("https://www.tutorialspoint.com/index.htm");
	      driver.manage().window().maximize();
	      // JavaScript Executor to check ready state
	      JavascriptExecutor j = (JavascriptExecutor)driver;
	      if (j.executeScript("return document.readyState").toString().equals("complete")){
	         System.out.println("Page has loaded");
	      }
	      //iterate 50 times after every one second to verify if in ready state
	      for (int i=0; i<50; i++){
	         try {
	            Thread.sleep(1000);
	         }catch (InterruptedException ex) {
	            System.out.println("Page has not loaded yet ");
	         }
	         //again check page state
	         if (j.executeScript("return document.readyState").toString().equals("complete")){
	            break;

	}
	      }
	}
}

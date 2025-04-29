package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FinalNavigate {
	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragini\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		// Declare a variable URL with data type String and stores the URL of the web page. 
		   String URL = "http://www.google.com"; 

		// Call navigate().to() command to navigate the URL of the web page. 
		   driver.navigate().to(URL); // It takes parameter URL as a String and returns nothing. 

		// Wait for Page to load completely. 
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS ); 

		// Click on Gmail link text. 
		// Call findElement method using WebDriver reference variable 'driver'. 
		   WebElement element = driver.findElement(By.linkText("Gmail")); // The return type of findElement method is WebElement. 
		   element.click(); 
		   
		   String titlePage1 = driver.getTitle(); 
		   System.out.println("Title of web page: " +titlePage1); 

		// Move to the previous web page. 
		// Call navigate().back() command to move back by one page on the browser's history. 
		   driver.navigate().back(); 
		   try 
		   { 
		      Thread.sleep(1000); 
		   } 
		   catch (InterruptedException e) 
		   { 
		     e.printStackTrace(); 
		   } 
		   String titleOfBackpage = driver.getTitle(); 
		   System.out.println("Title of back page: " +titleOfBackpage); 

		   int titleLengthBP = titleOfBackpage.length(); 
		   System.out.println("Length of title of back page: " +titleLengthBP); 

		// Move to the next web page. 
		// Call navigate().forward() command to move forward by one page on the browser's history. 
		   driver.navigate().forward(); // It takes nothing as parameter and returns nothing. 
		   
		   String titleOfForwardpage = driver.getTitle(); 
		   System.out.println("Title of forward page: " +titleOfForwardpage); 
		   
		   int titleLengthFP = titleOfForwardpage.length(); // Return type of the length() method is an integer. 
		   System.out.println("Length of title of forward page: " +titleLengthFP); 

		// Refresh the current webpage. 
		// Call navigate().refresh() command to refresh the current page. 
		   driver.navigate().refresh(); // accepts nothing as a parameter and returns nothing. 
		   System.out.println("Refresh is successfully"); 
		   
		   String titleOfRefreshpage = driver.getTitle(); // line 1. 
		   int titleLengthRP = titleOfRefreshpage.length(); // line 2. // Since return type of length() method is integer, we will store it using a variable with data type integer. 

		   System.out.println("Length of title of refresh page: " +titleLengthRP); 

		// The above two lines (line 1 and line 2) of code can also be written in one step like this. 
		// int titleLengthRP = driver.getTitle().length(); 

		// Close the browser. 
		   driver.close(); // It takes nothing as a parameter and returns nothing. 
		  } 
		
		}



package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cmdex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	//all cmds together
				WebDriver driver;
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragini\\Downloads\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				//Launch sampleSiteForSelenium
				driver.get("https://artoftesting.com/sampleSiteForSelenium");
							
				//Fetch the text "This is sample text!" and print it on the console
				//Use the id of the div to locate it and then fecth text using the getText() method
				String sampleText = driver.findElement(By.id("idOfDiv")).getText();
				System.out.println(sampleText);
					
				//Waiting for 3 seconds just for the user to efficiently check automation
				//Its not mandatory though
				Thread.sleep(3000);
					
				//Using linkText locator to find the link and then using click() to click on it
				driver.findElement(By.linkText("This is a link")).click();
					
				Thread.sleep(3000);
				
				//Finding textbox using id locator and then using send keys to write in it
				driver.findElement(By.id("fname")).sendKeys("Kuldeep Rana");
					
				Thread.sleep(3000);
				
				//Clear the text written in the textbox
				driver.findElement(By.id("fname")).clear();
					
				Thread.sleep(3000);
				
				//Clicking on button using click() command
				driver.findElement(By.id("idOfButton")).click();
					
				Thread.sleep(3000);
					
				//Find radio button by name and check it using click() function
				driver.findElement(By.id("male")).click();
					
				Thread.sleep(3000);
					
				//Find checkbox by cssSelector and check it using click() function
				driver.findElement(By.cssSelector("input.Automation")).click();
						
				Thread.sleep(3000);
					
				//Using Select class for for selecting value from dropdown
				@SuppressWarnings("unused")
				Xpath dropdown = new Xpath();
			//	dropdown.selectByVisibleText("Database Testing");
			//	dropdown.selectByVisibleText("Performance");
			//	Thread.sleep(50000);
				
				//Close the browser
				driver.close();
				}
				
			
			
	}



package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
public class ResizeBrowser {
	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragini\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.softwaretestingmaterial.com");
        System.out.println(driver.manage().window().getSize());
        //Create object of Dimensions class
        Dimension d = new Dimension(480,620);
        //Resize the current window to the given dimension
        driver.manage().window().setSize(d);
        System.out.println(driver.manage().window().getSize());	
	}

}

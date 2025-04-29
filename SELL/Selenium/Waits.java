package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits {

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragini\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String eTitle = "Demo Guru99 Page";
		String aTitle = "";
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		aTitle = driver.getTitle();
		// compare the actual title with the expected title
		if (aTitle.equals(eTitle)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		// close browser
		driver.close();

	}

}

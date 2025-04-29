package testcol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C://Users//ragini.DESKTOP-1J8B12N//Downloads//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://pigmytest.rtac.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("soccode")).sendKeys("100044");
		driver.findElement(By.id("username")).sendKeys("pune");
		driver.findElement(By.id("password")).sendKeys("a");
		driver.findElement(By.id("loginButton")).click();
		System.out.println("Login successful!");
	}
}

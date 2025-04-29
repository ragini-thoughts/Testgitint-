package Selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C://Users//ragini.DESKTOP-1J8B12N//Downloads//chromedriver-win64//chromedriver-win64//chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the URL
        String URL = "https://the-internet.herokuapp.com/drag_and_drop";
        driver.get(URL);

        // Maximize the window
        driver.manage().window().maximize();

        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Initialize Actions class
        Actions builder = new Actions(driver);

        // Locate the source and target elements
        WebElement from = driver.findElement(By.id("column-a"));
        WebElement to = driver.findElement(By.id("column-b"));

        // Perform drag and drop
        builder.dragAndDrop(from, to).perform();

        // Verify if the text changed in the target box
        String textTo = to.getText();
        if (textTo.equals("Dropped!")) {
            System.out.println("PASS: File is dropped to target as expected");
        } else {
            System.out.println("FAIL: File couldn't be dropped to target as expected");
        }

        // Close the browser
        driver.quit();
    }
}

package Selenium;
import java.text.ParseException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Noofrowsandcols {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//program to Fetch number of rows and columns from Dynamic WebTable
		WebDriver wd;
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Ragini\\Downloads\\chromedriver.exe");
		  wd= new ChromeDriver();
	        wd.get("https://demo.guru99.com/test/web-table-element.php");  
	        wd.manage().window().maximize();
	        //No.of Columns
	        List <WebElement> col = wd.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
	        System.out.println("No of cols are : " +col.size()); 
	        //No.of rows 
	        List <WebElement> rows = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
	        System.out.println("No of rows are : " + rows.size());
	        wd.close();
		
	}

}

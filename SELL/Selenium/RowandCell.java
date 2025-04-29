package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RowandCell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ragini\\Downloads\\chromedriver.exe");
		 wd= new ChromeDriver();
		 wd.get("https://demo.guru99.com/test/web-table-element.php"); 
		 wd.manage().window().maximize();
		 wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 WebElement baseTable = wd.findElement(By.tagName("table"));
		  
		 //To find third row of table
		 WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
         String rowtext = tableRow.getText();
		 System.out.println("Third row of table : "+rowtext);
		    
		    //to get 3rd row's 2nd column data
		    WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
		    String valueIneed = cellIneed.getText();
		    System.out.println("Cell value is : " + valueIneed); 
		    wd.close();
	}
	//Table is located using locator property “tagname”.
//	Using XPath “//*[@id=\”leftcontainer\”]/table/tbody/tr[3]” find the 3rd row and gets its text using getText () function
//	Using Xpath “//*[@id=\”leftcontainer\”]/table/tbody/tr[3]/td[2]” find the 2nd cell in 3rd row and gets its text using getText () function

}

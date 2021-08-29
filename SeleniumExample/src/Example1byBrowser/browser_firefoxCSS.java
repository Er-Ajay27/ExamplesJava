package Example1byBrowser;

import java.awt.Toolkit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class browser_firefoxCSS {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * System.setProperty("webdriver.gecko.driver","D:\\fire\\geckodriver.exe");
		 * WebDriver driver=new FirefoxDriver();
		 * driver.get("https://www.w3schools.com/html/html_tables.asp"); WebElement
		 * footer= driver.findElement(By.xpath("//table[@id='customers']"));
		 * 
		 * List<WebElement> allrow =footer.findElements(By.tagName("tr"));
		 * System.out.println("no of rows"+allrow);
		 * 
		 * int i=0; for(WebElement ele:allrow) { List<WebElement> echcl
		 * =ele.findElements(By.tagName("td")); i++;
		 * System.out.println("no of column in"+i+"row are"+echcl.size());
		 * 
		 * for(WebElement column:echcl) { System.out.println("|"+column.getText()); }
		 * 
		 * System.out.println(""); }
		 */
		
		
		  System.setProperty("webdriver.gecko.driver","D:\\fire\\geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  
		  driver.get("https://www.w3schools.com/html/html_tables.asp");
		  driver.manage().window().maximize();
		  
		  WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
		  List<WebElement> allrows = table.findElements(By.tagName("tr"));
		  
		  System.out.println("allrows "+ allrows.size()); 
		  int i=0;
		  
		  for(WebElement eachrows:allrows) { 
			  List<WebElement> eachcolumn = table.findElements(By.tagName("td")); 
			  i++;
			  System.out.println("no. of col in "+ i + " row are "+ eachcolumn.size());
		  
			  for(WebElement column: eachcolumn) { 
				  System.out.println("|"+ column.getText()); 
			  } 
			  	System.out.println(" "); 
			  }
		  
		  Toolkit.getDefaultToolkit().beep(); 
		  System.out.println("End of code");
		 
	}

}

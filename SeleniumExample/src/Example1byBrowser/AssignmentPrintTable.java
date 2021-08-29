package Example1byBrowser;

import java.awt.Toolkit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssignmentPrintTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\fire\\geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		driver1.get("https://money.rediff.com/index.html/");
		driver1.manage().window().maximize();
		
		WebElement table =   driver1.findElement(By.xpath("div.hmnseindicestable"));
		
		List<WebElement> allrows = driver1.findElements(By.xpath("//body[1]/div[2]/div[9]/div[8]/div[1]/div[1]/div[1]/ul[1]/li[1]"));
		
		 System.out.println("allrows "+ allrows.size()); 
		  int i=0;
		  
		  for(WebElement eachrows:allrows) { 
			  List<WebElement> eachcolumn = table.findElements(By.tagName("li.alignR")); 
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

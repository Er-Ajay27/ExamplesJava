package Example1byBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AssignGoogle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\fire\\geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		driver1.get("https://www.google.com/");
		driver1.manage().window().maximize();
		Actions act = new Actions(driver1);
		
		WebElement textbox = driver1.findElement(By.xpath("//input[@name='q']"));
		//act.moveToElement(textbox).click().keyDown(Keys.SHIFT).sendKeys("Where to go").build().perform();
		
		  act.moveToElement(textbox).click().sendKeys("Where is Indore").build().perform(); 
		  //act.moveToElement(textbox).sendKeys(Keys.ARROW_LEFT).build().perform();
		  for(int i=0;i<7;i++)
		  { 
			  act.moveToElement(textbox).sendKeys(Keys.ARROW_LEFT).build().perform();
		  //Thread.sleep(2000); 
		  } 
		  Thread.sleep(3000);
		  //act.moveToElement(textbox).contextClick().perform(); //driver1.close();
		  //act.contextClick().build().perform();
		 		
		/*
		 * driver1.findElement(By.xpath("//input[@name='q']")).
		 * sendKeys("Where is Indoor");
		 * driver1.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ARROW_LEFT)
		 * ;
		 */
		act.release();
	}

}

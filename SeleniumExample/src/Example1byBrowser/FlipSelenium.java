package Example1byBrowser;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipSelenium {

	WebDriver driver = new FirefoxDriver();
	
	public void GotoFlipkart() {
		driver.get("https://www.flipkart.com/");
	}
	public void TypeAndSearch() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();//input
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hp laptop");//type text 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();//click on search button
			
	}
	public void AddTocart() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@data-id='COMFZHFWETTEFHVZ']")).click();
		//driver.findElement(By.)
		driver.navigate().to("https://www.flipkart.com/hp-15s-ryzen-3-dual-core-3250u-8-gb-1-tb-hdd-windows-10-home-15s-gr0011au-thin-light-laptop/p/itma23a328a1f458?pid=COMFZHFWETTEFHVZ&lid=LSTCOMFZHFWETTEFHVZ2OSEK3&marketplace=FLIPKART&q=hp+laptop&store=6bo%2Fb5g&spotlightTagId=BestsellerId_6bo%2Fb5g&srno=s_1_1&otracker=search&otracker1=search&fm=SEARCH&iid=00b48429-0563-48b3-b802-3bb5cbeb7832.COMFZHFWETTEFHVZ.SEARCH&ppt=sp&ppn=sp&ssid=ovh2f2hf63splzi81630155524880&qH=9d1edd3d0f6d1b3c");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]")).click();
	}
	
	
	


}
package Example1byBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_firefox1_salesforce {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","D:\\selenium\\driver\\chromedriver.exe");

		/*WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("From selenium");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("From selenium");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='password']")).click();

		driver.close();
		*/
		System.setProperty("webdriver.gecko.driver","D:\\fire\\geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		driver1.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		driver1.manage().window().maximize();
		
		
		driver1.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Ajay");
		Thread.sleep(2000);
		
		driver1.findElement(By.name("UserLastName")).sendKeys("Ingle");
		Thread.sleep(2000);
		
		driver1.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("ajay@gmail.com");
		Thread.sleep(2000);
		
		driver1.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("Zensar");
		Thread.sleep(2000);
		
		driver1.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("0123456789");
		Thread.sleep(2000);
		
		driver1.findElement(By.linkText("Contact")).click();
		Thread.sleep(3000);
		
		driver1.findElement(By.partialLinkText("rights")).click();
		Thread.sleep(3000);
		
		
		driver1.close();
		/*
		WebDriver driver2=new ChromeDriver();
		driver2.manage().window().maximize();
		//driver2.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver2.get("https://sellglobal.ebay.in/seller-center/");
		
	    //driver2.findElement.xpath("//div[@id='footer']"));
		
	   
		
		WebElement footer= driver2.findElement(By.xpath("//ul[@id='menu-footer-menu']"));
		List<WebElement> all_elements =footer.findElements(By.tagName("a"));

		for(WebElement element:all_elements)
			System.out.println(element.getText());
		//driver2.findElement(By.cssSelector(input[name]))
		/*driver2.findElement(By.xpath("//input[starts-with(@name, 'confirm_passwd')]")).sendKeys("12345678");
		Thread.sleep(3000);
		
		WebElement jt= driver2.findElement(By.xpath("//select[@id='country']")))
        driver2.close();
        */
		
		/*
		WebDriver driver3=new ChromeDriver();
		driver3.manage().window().maximize();
		driver3.get("https://the-internet.herokuapp.com/add_remove_elements/");
		WebElement footer= driver3.findElement(By.xpath("//div[@id='elements']"));
		
		WebElement ele= driver3.findElement(By.xpath("//button[contains(text(),'Add Element')]")).click();
		
		for(ele=0;)
	    footer.findElement(By.xpath("(//*[@class='added-manually'])[5]")).click();
	    
	    driver3.close();
	    */
		

	}

}

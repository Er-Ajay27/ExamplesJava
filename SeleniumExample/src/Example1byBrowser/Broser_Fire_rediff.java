package Example1byBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Broser_Fire_rediff {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\fire\\geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		driver1.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver1.manage().window().maximize();
		String title = driver1.getTitle();
		System.out.println( "Title : " + title);
		
		System.out.println("URL : "+driver1.getCurrentUrl());
		String pageSourc = driver1.getPageSource();
		System.out.println( "Page Source : " + pageSourc);
		driver1.navigate().to("http://yatra.com");
		
		driver1.navigate().back();
		
		//driver1.navigate().forward();
		
		driver1.findElement(By.xpath("//tbody/tr[11]/td[3]/input[1]")).sendKeys("Ajay");
		Thread.sleep(2000);
		
		
		driver1.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]")).sendKeys("asb@gmail.com");
		Thread.sleep(2000);
		
		driver1.findElement(By.xpath("//input[starts-with(@name,'chk_altemail')]")).click();
		Thread.sleep(3000);
		
		driver1.findElement(By.xpath("//input[@value='f']")).click();
		Thread.sleep(3000);
		driver1.close();
		
		
		
	}

}

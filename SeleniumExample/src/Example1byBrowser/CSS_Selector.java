package Example1byBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSS_Selector {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","D:\\fire\\geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		driver1.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		driver1.manage().window().maximize();
		//driver1.findElement(By.cssSelector("button[name^='start']")).click();
		//Thread.sleep(2000);
		driver1.findElement(By.cssSelector("input[name^='UserFirst']")).sendKeys("Ajay");
		Thread.sleep(2000);
		driver1.findElement(By.cssSelector("input[name*='UserLast']")).sendKeys("Ingle");
		Thread.sleep(2000);
		driver1.findElement(By.cssSelector("input[name$='Email']")).sendKeys("ajay@gmail.com");
		Thread.sleep(2000);
		WebElement byClass = driver1.findElement(By.cssSelector("footer.bottom"));
		String divClass = byClass.getText();
		System.out.println(divClass);
		
		driver1.close();
		//driver1.findElement(By.cssSelector("")).sendKeys("");
		//driver1.findElement(By.cssSelector("")).sendKeys("");
	}

}

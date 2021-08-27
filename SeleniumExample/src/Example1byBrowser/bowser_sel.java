package Example1byBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class bowser_sel {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","D:\\fire\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@name='UserFirstName']"));
		
		WebElement jt= driver.findElement(By.xpath("//select[@name='UserTitle']"));
		Select jobtitle = new Select(jt);
		jobtitle.selectByIndex(4);
		Thread.sleep(2000);
		
		WebElement selected = jobtitle.getFirstSelectedOption();
		System.out.println(selected.getText());
		
		Thread.sleep(3000);
		
		
		jobtitle.selectByVisibleText("Sales Manager"); 	
		Thread.sleep(3000);
		jobtitle.selectByValue("Customer_Service_Manager_AP");		
		Thread.sleep(3000);
		jobtitle.selectByIndex(5); 		
		Thread.sleep(2000);
		
		System.out.println("- - - - - - - - - - -");
		//List<WebElement> jobtitle_options = jobtitle.getOptions();
		List<WebElement> jobtitle_options = jobtitle.getOptions();
		for(WebElement titlename : jobtitle_options)
			System.out.println(titlename.getText());
	
		Thread.sleep(2000);
		
		List<WebElement> label_elemet = driver.findElements(By.tagName("label"));
		for(WebElement element : label_elemet)
			System.out.println(element.getText());
		
		//Weblement selected =c
		
		driver.close();
	}
}

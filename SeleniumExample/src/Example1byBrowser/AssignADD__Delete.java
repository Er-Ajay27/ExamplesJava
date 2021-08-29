package Example1byBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssignADD__Delete {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\fire\\geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		driver1.get("https://the-internet.herokuapp.com/add_remove_elements/");
		driver1.manage().window().maximize();

		for(int i=0;i<=7;i++) {
			driver1.findElement(By.xpath("//button[contains(text(),'Add Element')]")).click();
		}
		Thread.sleep(1000);
		driver1.findElement(By.xpath("(//button[@class='added-manually'])[7]")).click();
		driver1.close();
	}

}

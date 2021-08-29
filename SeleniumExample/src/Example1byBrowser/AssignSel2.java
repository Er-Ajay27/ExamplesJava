package Example1byBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssignSel2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","D:\\fire\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://sellglobal.ebay.in/seller-center/");
		
		WebElement fte= driver.findElement(By.xpath("//ul[@id='menu-footer-menu']"));
		List<WebElement> all_elements =fte.findElements(By.tagName("a"));

		for(WebElement element:all_elements)
			System.out.println(element.getText());

	}

}

package Example1byBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssignmentsSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\fire\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		driver.manage().window().maximize();
		
		System.out.println("-----LABEL-----");
		List<WebElement> label_element=driver.findElements(By.tagName("label"));
		for(WebElement element : label_element)
			System.out.println(element.getText());
		
		System.out.println("-----AnchorTag-----");
		List<WebElement> link_element=driver.findElements(By.tagName("a"));
		for(WebElement element : link_element)
				System.out.println(element.getText());
		
		System.out.println("-----Anchor Tag by size-----");
		int sizeoflinks=link_element.size();
		for(int i=0;i<sizeoflinks;i++)
			System.out.println(link_element.get(i).getText());
		
		System.out.println("-----All-----");
		List<WebElement> all_elements=driver.findElements(By.xpath("//*"));
		for(WebElement element : all_elements)
				System.out.println(element.getTagName()+" "+element.getText());
		
		driver.close();

	}

}

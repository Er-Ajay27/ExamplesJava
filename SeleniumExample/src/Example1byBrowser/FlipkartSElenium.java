package Example1byBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartSElenium  {

	//static WebDriver driver1=new FirefoxDriver();
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\fire\\geckodriver.exe");
		
		//float b =1/2f;
		//System.out.println(b);
		FlipSelenium f = new FlipSelenium();
		f.GotoFlipkart();
		f.TypeAndSearch();
		f.AddTocart();
	}

	
}

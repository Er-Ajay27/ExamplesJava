package Example1byBrowser;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class BrowserScreenshot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver","D:\\fire\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		//driver.get("https://www.salesforce.com/");
		TakesScreenshot srcshot= ((TakesScreenshot)driver);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destfile = "d://selenium1//screenshots.png";
		File targetfile = new File(destfile);
		Files.copy(src, targetfile);
		System.out.println("End Of code");
		
		/*
		 * System.out.println(driver.getTitle());
		 * Assert.assertEquals("Login | Salesforce",driver.getTitle());
		 */
		
	}

}

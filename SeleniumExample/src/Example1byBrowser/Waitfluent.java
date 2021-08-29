package Example1byBrowser;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class Waitfluent {

		@SuppressWarnings("deprecation")
		public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver", "D:\\\\fire\\\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
			driver.findElement(By.xpath("//*[@id='post-body-5280210221385817166']/div[1]/button")).click();
			
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
					//ignoring(NoSuchElementException.class);
			//Timeout - 30 seconds; Check every 5 seconds; ignore NoSuchElementException

			WebElement element = wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
					WebElement element = driver.findElement(By.xpath("//*[@id='demo']"));
					String getTextOnPage = element.getText();
					if (getTextOnPage.equals("Software Testing Material - DEMO PAGE")) {
						System.out.println(getTextOnPage);
						System.out.println("Found element - DEMO PAGE");
						return element;
					} else {
						System.out.println("FluentWait Failed");
						return null;
					}
				}
			});

	}

}

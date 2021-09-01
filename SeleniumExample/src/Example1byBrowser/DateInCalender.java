package Example1byBrowser;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;

public class DateInCalender {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws ParseException {
		
		String date ="26/08/2019";
				Date d = new Date();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				
				
				Date expectedDate = dateFormat.parse(date); 
				String day1 = new SimpleDateFormat("dd").format(expectedDate);
				String month = new SimpleDateFormat("MMMM").format(expectedDate);
				String year  = new SimpleDateFormat("yyyy").format(expectedDate);
				System.out.println("Date is : "+ date);
				System.out.println("Day value is: "+day1);
				System.out.println("Month is : "+month);
				System.out.println("Year is : "+year);
				
				String expectedMonthYear = month +" "+ year;
				
				System.out.println("Expected Month year is: "+expectedMonthYear);
	}

}

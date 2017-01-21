package week2Day1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.math.NumberUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindLastElementInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set driver property
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Launch chrome browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Launch URL
		driver.get("http://legacy.crystalcruises.com/Calendar.aspx");
		
		
		List<WebElement> listOfAllLinks=driver.findElementsByLinkText("Get-a-Quote");
		int listSize=listOfAllLinks.size();
		System.out.println("Total links: "+listSize);
		listOfAllLinks.get(listSize-1).click();
		
		
		
	}

}

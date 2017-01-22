package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAndAlerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		 driver.switchTo().frame("iframeResult");
		 driver.findElementByXPath("/html/body/button").click();
		 Alert alt=driver.switchTo().alert();
		 String str="Amrita and Priya";
		 alt.sendKeys(str);
		 alt.accept();
		 String pageText=driver.findElementById("demo").getText();
		 if(pageText.contains(str))
		 {
			 System.out.println("Entered text "+str+" is present");
		 }
		 else
		 {
			 System.out.println("Entered text "+str+" is not present");
		 }
		 
		 
	

	}

}

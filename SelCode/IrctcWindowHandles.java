package day4;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcWindowHandles {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElementByXPath("//*[@id='demon_content']/div[2]/input").click();
		Thread.sleep(1000);
		driver.findElementByLinkText("Contact Us").click();
		
		Set<String> allWindows=driver.getWindowHandles();
		System.out.println(allWindows.size());
		for (String eachWindow : allWindows) {
			driver.switchTo().window(eachWindow);
		}
		
		System.out.println(driver.getTitle());
		driver.quit();

	}

}

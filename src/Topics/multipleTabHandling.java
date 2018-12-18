package Topics;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class multipleTabHandling {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		//		goto url
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
	}
	
	@Test
	public void multipleTabHandling() {
		String parentWindow = driver.getWindowHandle();		
		driver.findElement(By.id("button1")).click();
		Set<String> handles = driver.getWindowHandles();
		for(String childWindow : handles) {
			if(!childWindow.equals(parentWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println("Browser name ------"+driver.getTitle());
				driver.manage().window().maximize();
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}

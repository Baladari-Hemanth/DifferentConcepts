package Topics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class php {
	
	public static WebDriver driver;

	@BeforeTest
	public void openBrowser() throws Exception{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();

		//		goto url
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.phptravels.net/");
		Thread.sleep(5000);
	}
	
	@Test
	public void test() {
		
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		WebElement myaccountlink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"li_myaccount\"]/a/text()")));
		myaccountlink.click();
		
		
	//	driver.findElement(By.xpath("//*[@id=\"li_myaccount\"]/a/i[contains(text(), \" My Account \")]")).click();
//		driver.findElement(By.linkText(" My Account ")).click();
	}

}

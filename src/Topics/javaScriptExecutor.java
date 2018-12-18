package Topics;

import java.util.concurrent.TimeUnit;

import org.apache.commons.collections.FastArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class javaScriptExecutor {

	public static WebDriver driver;
	public static JavascriptExecutor js;

	@BeforeTest
	public void openBrowser() throws Exception{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();

		//		Java script executor
		js = (JavascriptExecutor) driver;
		//		goto url
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");
	}

	//    to type text in Selenium WebDriver without using sendKeys() method 
	@Test(priority=1)
	public void sendKeysMethod() {
		WebElement UserId = driver.findElement(By.name("uid"));
		boolean actul = UserId.isDisplayed();
		js.executeScript("arguments[0].value='user'", UserId);
		Assert.assertEquals(actul, true, "text box is shown");
	}

	//	click a Button in Selenium WebDriver using JavaScript
	@Test(priority=2)
	public void clickMethod() {
		WebElement login = driver.findElement(By.name("btnLogin"));
		js.executeScript("arguments[0].click();", login);
		//popUp handling
		driver.switchTo().alert().accept();
	}

	//	element highliter using javaScript
	@Test(priority=3)
	public void elementHighLighter() throws InterruptedException {
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.name("btnLogin"));
		js.executeScript("arguments[0].style.border='10px solid red'", login);
	}

	//	To generate Alert Pop window in selenium
	@Test(priority=4)
	public void generatePopUpWindow() throws InterruptedException {
		js.executeScript("alert('Welcome To Hemanth Testing');");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}

	//	 refresh browser window using Javascript
	//	@Test(priority=4)
	public void refreshBrowser() {
		js.executeScript("history.go(0)");
	}

	//	  Scroll on page using Javascript
	//	@Test(priority=4)
	public void scroll() {
		js.executeScript("scroll(0,150)");
	}
	
	@AfterTest
	public void closeBroswer() {
		driver.close();
	}

}

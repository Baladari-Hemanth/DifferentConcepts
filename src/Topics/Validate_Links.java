package Topics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.util.RetryAnalyzerCount;
import io.appium.java_client.android.AndroidDriver;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import org.openqa.selenium.TakesScreenshot;

public class Validate_Links {

	public static WebDriver driver;
	public WebDriverWait wait = null;
	public Logger logger = null;
	public FileInputStream ConfigfileInput = null;
	public FileInputStream LocatefileInput = null;
	public Properties Configuration;
	public Properties Locators;
	String destDir;
	DateFormat dateFormat;

	@BeforeTest
	public void Configuration() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		logger = Logger.getLogger("WashLite");
		PropertyConfigurator.configure("Log4j.properties");
		driver = new ChromeDriver();
		wait= new WebDriverWait(driver, 200);
		File Conf = new File(System.getProperty("user.dir")+"//Properties//Configuration.properties");
		File Locate = new File(System.getProperty("user.dir")+"//Properties//Locators.properties");
		
		try 
		{
			ConfigfileInput = new FileInputStream(Conf);
			LocatefileInput = new FileInputStream(Locate);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		Configuration = new Properties();
		Locators = new Properties();
		try 
		{
			Configuration.load(ConfigfileInput);
			Locators.load(LocatefileInput);
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	@Test
	public void Validate() throws Exception
	{
		logger.info("Browser Launched Successfully");
		driver.manage().window().maximize();
		logger.info("Browser Maximized Successfully");
		driver.get(Configuration.getProperty("ProdURL"));
		logger.info("URL Loaded Successfully");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.getProperty("MobilePay")))));
		driver.findElement(By.xpath(Locators.getProperty("MobilePay"))).click();
		logger.info("MobilePay Link Clicked Successfully");
		Thread.sleep(15);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.getProperty("ImageCloseCallOut")))));
		driver.findElement(By.xpath(Locators.getProperty("ImageCloseCallOut"))).click();
		logger.info("MobilePay Call Out Clicked Successfully");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.getProperty("Residents")))));
		driver.findElement(By.xpath(Locators.getProperty("Residents"))).click();
		logger.info("Residents Link Clicked Successfully");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.getProperty("Contact")))));
		driver.findElement(By.xpath(Locators.getProperty("Contact"))).click();
		logger.info("Contact Link Clicked Successfully");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.getProperty("Nav")))));
		driver.findElement(By.xpath(Locators.getProperty("Nav"))).click();
		logger.info("Nav Link Clicked Successfully");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.getProperty("SCALR")))));
		driver.findElement(By.xpath(Locators.getProperty("SCALR"))).click();
		logger.info("Common Area Laundry Rooms Link Clicked Successfully");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.getProperty("Nav")))));
		driver.findElement(By.xpath(Locators.getProperty("Nav"))).click();
		logger.info("Commercial Laundry Link Clicked Successfully");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.getProperty("SCl")))));
		driver.findElement(By.xpath(Locators.getProperty("SCl"))).click();
		logger.info("Campus Laundry Link Clicked Successfully");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.getProperty("Nav")))));
		driver.findElement(By.xpath(Locators.getProperty("Nav"))).click();
		logger.info("Wash Nav Btn Link Clicked Successfully");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.getProperty("Campus")))));
		driver.findElement(By.xpath(Locators.getProperty("Campus"))).click();
		logger.info("Wash-Benefits Link Clicked Successfully");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.getProperty("WhyWash")))));
		driver.findElement(By.xpath(Locators.getProperty("WhyWash"))).click();
		logger.info("Why Wash Link Clicked Successfully");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.getProperty("WhyWashBenifit")))));
		driver.findElement(By.xpath(Locators.getProperty("WhyWashBenifit"))).click();
		logger.info("WhyWashBenifit Link Clicked Successfully");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.getProperty("WhyWash")))));
		driver.findElement(By.xpath(Locators.getProperty("WhyWash"))).click();
		logger.info("WhyWashBenifit Link Clicked Successfully");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.getProperty("Testimonial")))));
		driver.findElement(By.xpath(Locators.getProperty("Testimonial"))).click();
		logger.info("Testimonial Link Clicked Successfully");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.getProperty("WhyWash")))));
		driver.findElement(By.xpath(Locators.getProperty("WhyWash"))).click();
		logger.info("WhyWashBenifit Link Clicked Successfully");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.getProperty("Green")))));
		driver.findElement(By.xpath(Locators.getProperty("Green"))).click();
		logger.info("Green Link Clicked Successfully");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.getProperty("About")))));
		driver.findElement(By.xpath(Locators.getProperty("About"))).click();
		logger.info("About Link Clicked Successfully");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.getProperty("Corporate")))));
		driver.findElement(By.xpath(Locators.getProperty("Corporate"))).click();
		logger.info("Corporate Link Clicked Successfully");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.getProperty("About")))));
		driver.findElement(By.xpath(Locators.getProperty("About"))).click();
		logger.info("About Link Clicked Successfully");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.getProperty("Leadership")))));
		driver.findElement(By.xpath(Locators.getProperty("Leadership"))).click();
		logger.info("Leadership Link Clicked Successfully");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.getProperty("About")))));
		driver.findElement(By.xpath(Locators.getProperty("About"))).click();
		logger.info("About Link Clicked Successfully");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.getProperty("Divisons")))));
		driver.findElement(By.xpath(Locators.getProperty("Divisons"))).click();
		logger.info("Divisons Link Clicked Successfully");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.getProperty("About")))));
		driver.findElement(By.xpath(Locators.getProperty("About"))).click();
		logger.info("About Link Clicked Successfully");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.getProperty("Careers")))));
		driver.findElement(By.xpath(Locators.getProperty("Careers"))).click();
		logger.info("Careers Link Clicked Successfully");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.getProperty("About")))));
		driver.findElement(By.xpath(Locators.getProperty("About"))).click();
		logger.info("About Link Clicked Successfully");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.getProperty("Locations")))));
		driver.findElement(By.xpath(Locators.getProperty("Locations"))).click();
		logger.info("Locations Link Clicked Successfully");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.getProperty("About")))));
		driver.findElement(By.xpath(Locators.getProperty("About"))).click();
		logger.info("About Link Clicked Successfully");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.getProperty("Press")))));
		driver.findElement(By.xpath(Locators.getProperty("Press"))).click();
		logger.info("Press Link Clicked Successfully");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.getProperty("Help")))));
		driver.findElement(By.xpath(Locators.getProperty("Help"))).click();
		logger.info("Help Link Clicked Successfully");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.getProperty("HRequest")))));
		driver.findElement(By.xpath(Locators.getProperty("HRequest"))).click();
		logger.info("HRequest Link Clicked Successfully");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.getProperty("Help")))));
		driver.findElement(By.xpath(Locators.getProperty("Help"))).click();
		logger.info("Help Link Clicked Successfully");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.getProperty("HRRefund")))));
		driver.findElement(By.xpath(Locators.getProperty("HRRefund"))).click();
		logger.info("HRRefund Link Clicked Successfully");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.getProperty("Help")))));
		driver.findElement(By.xpath(Locators.getProperty("Help"))).click();
		logger.info("Help Link Clicked Successfully");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.getProperty("HFA")))));
		driver.findElement(By.xpath(Locators.getProperty("HFA"))).click();
		logger.info("Fix Laundry App Link Clicked Successfully");
	}
	@AfterTest
	public void takeScreenShot() throws Exception
	{
		destDir = "screenshots";
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
		new File(destDir).mkdirs();
		String destFile = dateFormat.format(new Date()) + ".png";
		try {
			FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
		}catch (IOException e) {
			e.printStackTrace();
		}
		driver.quit();

	}
}



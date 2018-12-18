package Topics;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class screenShotCapture {

	public static WebDriver driver;
	public static Logger logger;

	@Test(priority=1)
	public void testGuru99TakeScreenShot() throws Exception{

		logger=Logger.getLogger("My_Own_Project");
		PropertyConfigurator.configure("log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();

		//goto url
		logger.info("Opening the url");
		driver.get("http://demo.guru99.com/V4/");
		

		//Call take screenshot function
		logger.info("Call take screenshot function");
		takeSnapShot(System.getProperty("user.dir")+"\\Images\\test.png") ;    

	}

	public void takeSnapShot(String fileWithPath) throws Exception{

		//Call getScreenshotAs method to create image file

		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		//Move image file to new destination

		File DestFile=new File(fileWithPath);

		//Copy file at destination

		FileUtils.copyFile(screenshotFile, DestFile);

	}
	
	@Test(priority=2)
	public void closeWindow() {
		// TODO Auto-generated method stub
		driver.close();
		logger.info("window is closed");
	}

}

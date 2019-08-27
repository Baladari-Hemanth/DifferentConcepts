package Topics;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowsing {

	public static WebDriver driver;

	@Parameters("browser")
	@BeforeTest
	public void openBrowser(String browser) throws Exception{
		//Check if parameter passed from TestNG is 'firefox'
		if(browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		//Check if parameter passed as 'chrome'
		else if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
			driver = new ChromeDriver();
		}

		//		goto url
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void start() {
		driver.get("http://demo.guru99.com/V4/");
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}

/*
 	<test thread-count="5" name="Test">
		<classes>
			<class name="Topics.crossBrowsing" />
		</classes>
	</test> <!-- Test -->


 	<test name="ChromeTest">
		<parameter name="browser" value="Chrome" />
		<classes>
			<class name="Topics.crossBrowing" />
		</classes>
	</test>

<test name="FirefoxTest">
		<parameter name="browser" value="Firefox" />
		<classes>
			<class name="Topics.crossBrowing" />
		</classes>
	</test>
 */
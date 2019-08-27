package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.Login;

public class TestClass {
	
	WebDriver driver;

	Login objLogin;

	HomePage objHomePage;

	@BeforeTest

    public void setup(){
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://demo.guru99.com/V4/");
        
        System.out.println("url is opened");

    }
	
	@Test(priority=0)

    public void test_Home_Page_Appear_Correct(){
		
	    objLogin = new Login(driver);
	    
	  //Verify login page title

	    String loginPageTitle = objLogin.getLoginTitle();
	    
	    Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
	    
	  //login to application

	    objLogin.loginToGuru99("mgr123", "mgr!23");

	    // go the next page

	    objHomePage = new HomePage(driver);

	    //Verify home page

	    Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
		
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}

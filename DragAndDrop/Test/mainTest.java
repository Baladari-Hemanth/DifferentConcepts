package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.loginPage;

public class mainTest {
	
	WebDriver driver;
	
	loginPage objLoginPage;
	
	@BeforeTest
    public void setup(){
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");

        driver = new ChromeDriver();
        
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("http://qa.heliumats.com/#/login");
        
        System.out.println("url is opened");

    }
	
	@Test(priority=1)
	public void loginAs() throws InterruptedException {
		Thread.sleep(2000);
		objLoginPage = new loginPage(driver);
		objLoginPage.login("bharatpatel@heliumedge.com", "bharatpatel");
		objLoginPage.test();
		objLoginPage.dragAndDrop();
	}

}

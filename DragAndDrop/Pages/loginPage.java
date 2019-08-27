package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class loginPage {
	
	WebDriver driver;
	
	By emailTxt = By.xpath("//input[@type='email']");
	By pswrdTxt = By.xpath("//input[@type='password']");
	By lgnBtn = By.xpath("//button[@type='submit']");
	
	//Dashboard
	By sideMenu = By.xpath("//*[@id=\"sideMenu\"]/div/button[3]");
	By akash = By.xpath("//*[@id=\"mainContent\"]/he-candidate-list-page/div/div[2]/div[2]/table/tbody/tr[8]/td[2]/div/he-photo-content/div/a");
	By jobBtn = By.xpath("//*[@id=\"mat-tab-label-0-1\"]");
	
	By newFrame = By.xpath("//h1[contains(text(),'Big Data Solution Architect-Hortonworks Hadoop')]");

	By endFrame = By.xpath("//*[@id=\"mat-tab-content-0-1\"]/div/he-candidate-job-tab/div/div/div[2]/div/mat-list");
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void login(String username, String password) {
		driver.findElement(emailTxt).sendKeys(username);
		driver.findElement(pswrdTxt).sendKeys(password);
		driver.findElement(lgnBtn).click();
	}
	
	public void test() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(sideMenu).click();
		Thread.sleep(2000);
		driver.findElement(akash).click();
		Thread.sleep(2000);
		driver.findElement(jobBtn).click();
	}
	
	public void dragAndDrop() throws InterruptedException {
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.dragAndDrop(driver.findElement(newFrame), driver.findElement(endFrame)).build().perform();
	}
	
	
}

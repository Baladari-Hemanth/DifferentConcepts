package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver driver;

	By UserID = By.xpath("//input[@name='uid']");

	By Password = By.xpath("//input[@name='password']");

	By Title_Text = By.xpath("//h2[@class='barone']");

	By Login = By.xpath("//input[@name='btnLogin' and @value='LOGIN']");

	public Login(WebDriver driver) {
		this.driver = driver;
	}

	//Set user name in textbox

	public void setUserName(String strUserName){

		driver.findElement(UserID).sendKeys(strUserName);

	}

	//Set password in password textbox

	public void setPassword(String strPassword){

		driver.findElement(Password).sendKeys(strPassword);

	}

	//Click on login button

	public void clickLogin(){

		driver.findElement(Login).click();

	}

	//Get the title of Login Page

	public String getLoginTitle(){

		return    driver.findElement(Title_Text).getText();

	}
	
	
	 public void loginToGuru99(String strUserName,String strPasword){

	        //Fill user name

	        this.setUserName(strUserName);

	        //Fill password

	        this.setPassword(strPasword);

	        //Click Login button

	        this.clickLogin();        
	    }

}

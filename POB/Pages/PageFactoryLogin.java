package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryLogin {

	WebDriver driver;

	@FindBy(xpath="//input[@name='uid']")
	WebElement UserID;

	@FindBy(xpath="//input[@name='password']")
	WebElement Password;

	@FindBy(xpath="//h2[@class='barone']")
	WebElement Title_Text;

	@FindBy(xpath="//input[@name='btnLogin' and @value='LOGIN']")
	WebElement Login;

	public PageFactoryLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//Set user name in textbox

	public void setUserName(String strUserName){
		UserID.sendKeys(strUserName);
	}

	//Set password in password textbox

	public void setPassword(String strPassword){
		Password.sendKeys(strPassword);
	}

	//Click on login button

	public void clickLogin(){
		Login.click();
	}

	//Get the title of Login Page

	public String getLoginTitle(){
		return Title_Text.getText();
	}
	
	 public void loginToGuru99(String strUserName,String strPasword){
		 setUserName(strUserName);
		 setPassword(strPasword);
		 clickLogin();
	 }
}

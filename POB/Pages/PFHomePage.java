package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PFHomePage {

	WebDriver driver;

	@FindBy(xpath="//table//tr[@class='heading3']")
	WebElement LoggedInUserName;

	public PFHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//Get the User name from Home Page

	public String getHomePageDashboardUserName(){

		return LoggedInUserName.getText();

	}


}

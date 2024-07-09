package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {

	//Finding WebElements Using @FindBy Annotations
    
	@FindBy (xpath="//p[.='KYC']")private WebElement KycLnk;
	
	@FindBy(xpath="//p[.='Orders']")private WebElement OrdersLnk;
	
	@FindBy(xpath="//p[.='Log Out']")private WebElement LogOutLnk;
    
	//Rule-3:Create a constructor to initilise these elements
    
	public MyProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Rule-4:Provide getters to access these variables
	
	public WebElement getKycLnk() {
		return KycLnk;
	}

	public WebElement getOrdersLnk() {
		return OrdersLnk;
	}

	public WebElement getLogOutLnk() {
		return LogOutLnk;
	}
    
	//Business Libraries
	
	
}

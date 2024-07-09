package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {

	//Finding WebElements Using @FindBy Annotations
    
	@FindBy(xpath="//button[.=' Register ']")private WebElement RegisterLnk;
	
	@FindBy(xpath="//button[.='Login']")private WebElement LoginBtn;
	
	@FindBy (xpath="//img[@data-bs-target='#exampleModalLogout']")private WebElement ProfileImage;
	
 //	@FindBy(xpath="(//input[@autocomplete='one-time-code'])[1]")private WebElement OtpFrstBox;
    
	//Rule-3:Create a constructor to initilise these elements
    
	public DashBoardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Rule-4:Provide getters to access these variables
	
	public WebElement getRegisterLnk() {
		return RegisterLnk;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	
	public WebElement getProfileImage() {
		return ProfileImage;
	}
	
	
	//Business Libraries
	
		
	
}

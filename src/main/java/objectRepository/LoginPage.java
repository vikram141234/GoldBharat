package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//Finding WebElements Using @FindBy Annotations
    
	@FindBy (xpath="//input[@formcontrolname='phone']")private WebElement MobileNumberEdt;
	
	@FindBy(xpath="//button[.='Login']")private WebElement LoginBtn;
	
	@FindBy(xpath="//span[.='Register']")private WebElement RegisterLnk;
	
	@FindBy(xpath="(//input[@autocomplete='one-time-code'])[1]")private WebElement OtpFrstBox;
    
	//Rule-3:Create a constructor to initilise these elements
    
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Rule-4:Provide getters to access these variables
	
	public WebElement getMobileNumberEdt() {
		return MobileNumberEdt;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}

	public WebElement getRegisterLnk() {
		return RegisterLnk;
	}

	public WebElement getOtpFrstBox() {
		return OtpFrstBox;
	}
	
	//Business Libraries
	
	public void loginToApplication(String MobileNumber, String Otp) throws Exception
	{
		MobileNumberEdt.sendKeys(MobileNumber);
		LoginBtn.click();
		Thread.sleep(3000);
		OtpFrstBox.sendKeys(Otp);
	}
}

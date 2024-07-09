package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	//Finding WebElements Using @FindBy Annotations
    
	@FindBy(xpath="//input[@formcontrolname='businessName']")private WebElement BusinessNameEdt;
	
	@FindBy(xpath="//input[@formcontrolname='personName']")private WebElement PersonNameEdt;
	
	@FindBy(xpath="//input[@formcontrolname='email']")private WebElement EmailEdt;
	
	@FindBy(xpath="//input[@formcontrolname='phone']")private WebElement PhoneNumberEdt;
	
	@FindBy(xpath="//input[@formcontrolname='establishedDate']")private WebElement EstablishDateEdt;
	
	@FindBy(xpath="//input[@formcontrolname='pincode']")private WebElement PinCodeEdt;
	
	@FindBy(xpath="//button[.=' Register ']")private WebElement RegisterBtn;
	
	@FindBy(xpath="//span[.='Login Now']")private WebElement LoginNowLnk;
    
	//Rule-3:Create a constructor to initilise these elements
    
	public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Rule-4:Provide getters to access these variables
	
	public WebElement getBusinessNameEdt() {
		return BusinessNameEdt;
	}

	public WebElement getPersonNameEdt() {
		return PersonNameEdt;
	}

	public WebElement getEmailEdt() {
		return EmailEdt;
	}

	public WebElement getPhoneNumberEdt() {
		return PhoneNumberEdt;
	}

	public WebElement getEstablishDateEdt() {
		return EstablishDateEdt;
	}

	public WebElement getPinCodeEdt() {
		return PinCodeEdt;
	}

	public WebElement getRegisterBtn() {
		return RegisterBtn;
	}

	public WebElement getLoginNowLnk() {
		return LoginNowLnk;
	}
	
	//Business Libraries
	
	public void registerIntoApplication(String BusinessName, String PersonName, String Email, String PhoneNumber, String EstbDate, String PinCode)
	{
		BusinessNameEdt.sendKeys(BusinessName);
		PersonNameEdt.sendKeys(PersonName);
		EmailEdt.sendKeys(Email);
		PhoneNumberEdt.sendKeys(PhoneNumber);
		EstablishDateEdt.sendKeys(EstbDate);
		PinCodeEdt.sendKeys(PinCode);
		RegisterBtn.click();
	}
	
}

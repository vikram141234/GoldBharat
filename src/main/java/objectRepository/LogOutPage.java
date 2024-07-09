package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {

	//Finding WebElements Using @FindBy Annotations
    
	@FindBy (xpath="//button[.='Ok']")private WebElement OkBtn;
	
	@FindBy(xpath="//button[.='Cancel']")private WebElement CancelBtn;
	
	//Rule-3:Create a constructor to initilise these elements
    
	public LogOutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Rule-4:Provide getters to access these variables
	
	public WebElement getOkBtn() {
		return OkBtn;
	}

	public WebElement getCancelBtn() {
		return CancelBtn;
	}
	
	//Business Libraries
	
}

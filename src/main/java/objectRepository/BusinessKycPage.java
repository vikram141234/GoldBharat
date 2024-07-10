package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.WebDriverUtility;

public class BusinessKycPage {

	//Finding WebElements Using @FindBy Annotations
	
	//Propretor
    
	@FindBy(xpath="//select[@class='my-select']")private WebElement BusinessTypeDrpDwn;
	
	@FindBy(xpath="//input[@formcontrolname='proprietor_name']")private WebElement PropretorNameEdt;
	
	@FindBy(xpath="//input[@formcontrolname='proprietor_pan']")private WebElement PropretorPanNoEdt;
	
 	@FindBy(xpath="//input[@formcontrolname='proprietor_pan_image']")private WebElement PropretorUploadPanChooseFileBtn;
 	
    @FindBy(xpath="//input[@formcontrolname='proprietor_gst']")private WebElement PropretorGstNoEdt;
	
	@FindBy(xpath="//input[@formcontrolname='proprietor_gst_image']")private WebElement PropretorUploadGstNoChooseFileBtn;
	
	@FindBy(xpath="//input[@formcontrolname='bank_name']")private WebElement PropretorBankNameEdt;
	
 	@FindBy(xpath="//input[@formcontrolname='account_number']")private WebElement PropretorAccountNoEdt;
 	
    @FindBy(xpath="//input[@formcontrolname='ifsc_code']")private WebElement PropretorIfscCodeEdt;
	
	@FindBy(xpath="//input[@formcontrolname='account_holder_name']")private WebElement PropretorAcHolderNameEdt;
 	
 	//LLP
 	
    @FindBy(xpath="//input[@formcontrolname='director_name']")private WebElement LLpDirectorNameEdt;
	
	@FindBy(xpath="//input[@formcontrolname='director_mobile']")private WebElement LLpDirectorMobileNoEdt;
	
 	@FindBy(xpath="//input[@formcontrolname='director_aadhar']")private WebElement LLpDirectorAadharNoEdt;
 	
    @FindBy(xpath="//input[@formcontrolname='director_aadhar_front_image']")private WebElement LLpUploadAadharFrontSideChooseFileBtn;
	
	@FindBy(xpath="//input[@formcontrolname='director_aadhar_back_image']")private WebElement LLpUploadAadharBackSideChooseFileBtn;
	
	@FindBy(xpath="//input[@formcontrolname='director_pan']")private WebElement LLpDirectorPanNoEdt;
	
 	@FindBy(xpath="//input[@formcontrolname='director_pan_image']")private WebElement LLpDirectorUploadPanImageChooseFileBtn;
 	
    @FindBy(xpath="//input[@formcontrolname='director_gst']")private WebElement LLpDirectorGstNoEdt;
	
	@FindBy(xpath="//input[@formcontrolname='director_gst_image']")private WebElement LLpDirectorGstImageChooseFileBtn;
	
 	@FindBy(xpath="//input[@formcontrolname='director_cin']")private WebElement LLpDirectorCinNoEdt;
 	
    @FindBy(xpath="//input[@formcontrolname='cin_number_image']")private WebElement LLpDirectorUploadCinChooseFileBtn;
	
	@FindBy(xpath="//input[@formcontrolname='profile_picture']")private WebElement LLpDirectorUploadProfilePictureChooseFileBtn;
	
 	@FindBy(xpath="//input[@formcontrolname='bank_name']")private WebElement LLpBankNameEdt;
 	
    @FindBy(xpath="//input[@formcontrolname='account_number']")private WebElement LLpAcNoEdt;
	
	@FindBy(xpath="//input[@formcontrolname='ifsc_code']")private WebElement LLpIfscCodeEdt;
	
	@FindBy(xpath="//input[@formcontrolname='account_holder_name']")private WebElement LLpAcHolderNameEdt;
	
	//Pvt Ltd
	
    @FindBy(xpath="//input[@formcontrolname='director_nameone']")private WebElement PvtLtdFirstDirectorNameEdt;
 	
    @FindBy(xpath="//input[@formcontrolname='director_mobile']")private WebElement PvtLtdDirectorMobileNoEdt;
	
	@FindBy(xpath="//input[@formcontrolname='director_aadharone']")private WebElement PvtLtdFirstDirectorAadharNoEdt;
	
 	@FindBy(xpath="//input[@formcontrolname='director_aadhar_front_imageone']")private WebElement PvtLtdFirstDirectorUploadAadharFrontChooseFileBtn;
 	
    @FindBy(xpath="//input[@formcontrolname='director_aadhar_back_imageone']")private WebElement PvtLtdFirstDirectorUploadAadharBackChooseFileBtn;
	
	@FindBy(xpath="//input[@formcontrolname='director_panone']")private WebElement PvtLtdFirstDirectorPanNoEdt;
	
 	@FindBy(xpath="//input[@formcontrolname='director_pan_imageone']")private WebElement PvtLtdFirstDirectorPanCardChooseFileBtn;
 	
    @FindBy(xpath="//input[@formcontrolname='director_nametwo']")private WebElement PvtLtdSecondDirectorNameEdt;
 	
	@FindBy(xpath="//input[@formcontrolname='director_aadhartwo']")private WebElement PvtLtdSecondDirectorAadharNoEdt;
	
 	@FindBy(xpath="//input[@formcontrolname='director_aadhar_front_imagetwo']")private WebElement PvtLtdSecondDirectorUploadAadharFrontChooseFileBtn;
 	
    @FindBy(xpath="//input[@formcontrolname='director_aadhar_back_imagetwo']")private WebElement PvtLtdSecondDirectorUploadAadharBackChooseFileBtn;
	
	@FindBy(xpath="//input[@formcontrolname='director_pantwo']")private WebElement PvtLtdSecondDirectorPanNoEdt;
	
 	@FindBy(xpath="//input[@formcontrolname='director_pan_imagetwo']")private WebElement PvtLtdSecondDirectorPanCardChooseFileBtn;
 	
    @FindBy(xpath="//input[@formcontrolname='director_gst']")private WebElement PvtLtdDirectorGstNoEdt;
	
	@FindBy(xpath="//input[@formcontrolname='director_gst_image']")private WebElement PvtLtdDirectorUploadGstChooseFileBtn;
	
	@FindBy(xpath="//input[@formcontrolname='director_cin']")private WebElement PvtLtdDirectorCinNoEdt;
	
 	@FindBy(xpath="//input[@formcontrolname='account_number']")private WebElement PvtLtdDirectorUploadCinNoImageChooseFileBtn;
 	
    @FindBy(xpath="//input[@formcontrolname='profile_picture']")private WebElement PvtLtdUploadYourImageChooseFileBtn;
	
	@FindBy(xpath="//input[@formcontrolname='bank_name']")private WebElement PvtLtdBankNameEdt;
	
	@FindBy(xpath="//input[@formcontrolname='account_number']")private WebElement PvtLtdAcNoEdt;
	
	@FindBy(xpath="//input[@formcontrolname='ifsc_code']")private WebElement PvtLtdIfscCodeEdt;
	
	@FindBy(xpath="//input[@formcontrolname='account_holder_name']")private WebElement PvtLtdAcHolderNameEdt;
	
	//Ltd
	
    @FindBy(xpath="//input[@formcontrolname='director_nameone']")private WebElement LtdFirstDirectorNameEdt;
 	
    @FindBy(xpath="//input[@formcontrolname='director_mobile']")private WebElement LtdDirectorMobileNoEdt;
	
	@FindBy(xpath="//input[@formcontrolname='director_aadharone']")private WebElement LtdFirstDirectorAadharNoEdt;
	
 	@FindBy(xpath="//input[@formcontrolname='director_aadhar_front_imageone']")private WebElement LtdFirstDirectorUploadAadharFrontChooseFileBtn;
 	
    @FindBy(xpath="//input[@formcontrolname='director_aadhar_back_imageone']")private WebElement LtdFirstDirectorUploadAadharBackChooseFileBtn;
	
	@FindBy(xpath="//input[@formcontrolname='director_panone']")private WebElement LtdFirstDirectorPanNoEdt;
	
 	@FindBy(xpath="//input[@formcontrolname='director_pan_imageone']")private WebElement LtdFirstDirectorPanCardChooseFileBtn;
 	
    @FindBy(xpath="//input[@formcontrolname='director_nametwo']")private WebElement LtdSecondDirectorNameEdt;
 	
	@FindBy(xpath="//input[@formcontrolname='director_aadhartwo']")private WebElement LtdSecondDirectorAadharNoEdt;
	
 	@FindBy(xpath="//input[@formcontrolname='director_aadhar_front_imagetwo']")private WebElement LtdSecondDirectorUploadAadharFrontChooseFileBtn;
 	
    @FindBy(xpath="//input[@formcontrolname='director_aadhar_back_imagetwo']")private WebElement LtdSecondDirectorUploadAadharBackChooseFileBtn;
	
	@FindBy(xpath="//input[@formcontrolname='director_pantwo']")private WebElement LtdSecondDirectorPanNoEdt;
	
 	@FindBy(xpath="//input[@formcontrolname='director_pan_imagetwo']")private WebElement LtdSecondDirectorPanCardChooseFileBtn;
 	
    @FindBy(xpath="//input[@formcontrolname='director_gst']")private WebElement LtdDirectorGstNoEdt;
	
	@FindBy(xpath="//input[@formcontrolname='director_gst_image']")private WebElement LtdDirectorUploadGstChooseFileBtn;
	
	@FindBy(xpath="//input[@formcontrolname='director_cin']")private WebElement LtdDirectorCinNoEdt;
	
 	@FindBy(xpath="//input[@formcontrolname='account_number']")private WebElement LtdDirectorUploadCinNoImageChooseFileBtn;
 	
    @FindBy(xpath="//input[@formcontrolname='profile_picture']")private WebElement LtdUploadYourImageChooseFileBtn;
	
	@FindBy(xpath="//input[@formcontrolname='bank_name']")private WebElement LtdBankNameEdt;
	
	@FindBy(xpath="//input[@formcontrolname='account_number']")private WebElement LtdAcNoEdt;
	
	@FindBy(xpath="//input[@formcontrolname='ifsc_code']")private WebElement LtdIfscCodeEdt;
	
	@FindBy(xpath="//input[@formcontrolname='account_holder_name']")private WebElement LtdAcHolderNameEdt;
	
 	@FindBy(xpath="//button[.='Submit']")private WebElement SubmitBtn;
    
	//Rule-3:Create a constructor to initilise these elements
    
	public BusinessKycPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Rule-4:Provide getters to access these variables
	
	public WebElement getBusinessTypeDrpDwn() {
		return BusinessTypeDrpDwn;
	}
    
	public WebElement getPropretorNameEdt() {
		return PropretorNameEdt;
	}

	public WebElement getPropretorPanNoEdt() {
		return PropretorPanNoEdt;
	}

	public WebElement getPropretorUploadPanChooseFileBtn() {
		return PropretorUploadPanChooseFileBtn;
	}

	public WebElement getPropretorGstNoEdt() {
		return PropretorGstNoEdt;
	}

	public WebElement getPropretorUploadGstNoChooseFileBtn() {
		return PropretorUploadGstNoChooseFileBtn;
	}

	public WebElement getPropretorBankNameEdt() {
		return PropretorBankNameEdt;
	}

	public WebElement getPropretorAccountNoEdt() {
		return PropretorAccountNoEdt;
	}

	public WebElement getPropretorIfscCodeEdt() {
		return PropretorIfscCodeEdt;
	}

	public WebElement getPropretorAcHolderNameEdt() {
		return PropretorAcHolderNameEdt;
	}

	public WebElement getLLpDirectorNameEdt() {
		return LLpDirectorNameEdt;
	}

	public WebElement getLLpDirectorMobileNoEdt() {
		return LLpDirectorMobileNoEdt;
	}

	public WebElement getLLpDirectorAadharNoEdt() {
		return LLpDirectorAadharNoEdt;
	}

	public WebElement getLLpUploadAadharFrontSideChooseFileBtn() {
		return LLpUploadAadharFrontSideChooseFileBtn;
	}

	public WebElement getLLpUploadAadharBackSideChooseFileBtn() {
		return LLpUploadAadharBackSideChooseFileBtn;
	}

	public WebElement getLLpDirectorPanNoEdt() {
		return LLpDirectorPanNoEdt;
	}

	public WebElement getLLpDirectorUploadPanImageChooseFileBtn() {
		return LLpDirectorUploadPanImageChooseFileBtn;
	}

	public WebElement getLLpDirectorGstNoEdt() {
		return LLpDirectorGstNoEdt;
	}

	public WebElement getLLpDirectorGstImageChooseFileBtn() {
		return LLpDirectorGstImageChooseFileBtn;
	}

	public WebElement getLLpDirectorCinNoEdt() {
		return LLpDirectorCinNoEdt;
	}

	public WebElement getLLpDirectorUploadCinChooseFileBtn() {
		return LLpDirectorUploadCinChooseFileBtn;
	}

	public WebElement getLLpDirectorUploadProfilePictureChooseFileBtn() {
		return LLpDirectorUploadProfilePictureChooseFileBtn;
	}

	public WebElement getLLpBankNameEdt() {
		return LLpBankNameEdt;
	}

	public WebElement getLLpAcNoEdt() {
		return LLpAcNoEdt;
	}

	public WebElement getLLpIfscCodeEdt() {
		return LLpIfscCodeEdt;
	}

	public WebElement getLLpAcHolderNameEdt() {
		return LLpAcHolderNameEdt;
	}

	public WebElement getPvtLtdFirstDirectorNameEdt() {
		return PvtLtdFirstDirectorNameEdt;
	}

	public WebElement getPvtLtdDirectorMobileNoEdt() {
		return PvtLtdDirectorMobileNoEdt;
	}

	public WebElement getPvtLtdFirstDirectorAadharNoEdt() {
		return PvtLtdFirstDirectorAadharNoEdt;
	}

	public WebElement getPvtLtdFirstDirectorUploadAadharFrontChooseFileBtn() {
		return PvtLtdFirstDirectorUploadAadharFrontChooseFileBtn;
	}

	public WebElement getPvtLtdFirstDirectorUploadAadharBackChooseFileBtn() {
		return PvtLtdFirstDirectorUploadAadharBackChooseFileBtn;
	}

	public WebElement getPvtLtdFirstDirectorPanNoEdt() {
		return PvtLtdFirstDirectorPanNoEdt;
	}

	public WebElement getPvtLtdFirstDirectorPanCardChooseFileBtn() {
		return PvtLtdFirstDirectorPanCardChooseFileBtn;
	}

	public WebElement getPvtLtdSecondDirectorNameEdt() {
		return PvtLtdSecondDirectorNameEdt;
	}

	public WebElement getPvtLtdSecondDirectorAadharNoEdt() {
		return PvtLtdSecondDirectorAadharNoEdt;
	}

	public WebElement getPvtLtdSecondDirectorUploadAadharFrontChooseFileBtn() {
		return PvtLtdSecondDirectorUploadAadharFrontChooseFileBtn;
	}

	public WebElement getPvtLtdSecondDirectorUploadAadharBackChooseFileBtn() {
		return PvtLtdSecondDirectorUploadAadharBackChooseFileBtn;
	}

	public WebElement getPvtLtdSecondDirectorPanNoEdt() {
		return PvtLtdSecondDirectorPanNoEdt;
	}

	public WebElement getPvtLtdSecondDirectorPanCardChooseFileBtn() {
		return PvtLtdSecondDirectorPanCardChooseFileBtn;
	}

	public WebElement getPvtLtdDirectorGstNoEdt() {
		return PvtLtdDirectorGstNoEdt;
	}

	public WebElement getPvtLtdDirectorUploadGstChooseFileBtn() {
		return PvtLtdDirectorUploadGstChooseFileBtn;
	}

	public WebElement getPvtLtdDirectorCinNoEdt() {
		return PvtLtdDirectorCinNoEdt;
	}

	public WebElement getPvtLtdDirectorUploadCinNoImageChooseFileBtn() {
		return PvtLtdDirectorUploadCinNoImageChooseFileBtn;
	}

	public WebElement getPvtLtdUploadYourImageChooseFileBtn() {
		return PvtLtdUploadYourImageChooseFileBtn;
	}

	public WebElement getPvtLtdBankNameEdt() {
		return PvtLtdBankNameEdt;
	}

	public WebElement getPvtLtdAcNoEdt() {
		return PvtLtdAcNoEdt;
	}

	public WebElement getPvtLtdIfscCodeEdt() {
		return PvtLtdIfscCodeEdt;
	}

	public WebElement getPvtLtdAcHolderNameEdt() {
		return PvtLtdAcHolderNameEdt;
	}

	public WebElement getLtdFirstDirectorNameEdt() {
		return LtdFirstDirectorNameEdt;
	}

	public WebElement getLtdDirectorMobileNoEdt() {
		return LtdDirectorMobileNoEdt;
	}

	public WebElement getLtdFirstDirectorAadharNoEdt() {
		return LtdFirstDirectorAadharNoEdt;
	}

	public WebElement getLtdFirstDirectorUploadAadharFrontChooseFileBtn() {
		return LtdFirstDirectorUploadAadharFrontChooseFileBtn;
	}

	public WebElement getLtdFirstDirectorUploadAadharBackChooseFileBtn() {
		return LtdFirstDirectorUploadAadharBackChooseFileBtn;
	}

	public WebElement getLtdFirstDirectorPanNoEdt() {
		return LtdFirstDirectorPanNoEdt;
	}

	public WebElement getLtdFirstDirectorPanCardChooseFileBtn() {
		return LtdFirstDirectorPanCardChooseFileBtn;
	}

	public WebElement getLtdSecondDirectorNameEdt() {
		return LtdSecondDirectorNameEdt;
	}

	public WebElement getLtdSecondDirectorAadharNoEdt() {
		return LtdSecondDirectorAadharNoEdt;
	}

	public WebElement getLtdSecondDirectorUploadAadharFrontChooseFileBtn() {
		return LtdSecondDirectorUploadAadharFrontChooseFileBtn;
	}

	public WebElement getLtdSecondDirectorUploadAadharBackChooseFileBtn() {
		return LtdSecondDirectorUploadAadharBackChooseFileBtn;
	}

	public WebElement getLtdSecondDirectorPanNoEdt() {
		return LtdSecondDirectorPanNoEdt;
	}

	public WebElement getLtdSecondDirectorPanCardChooseFileBtn() {
		return LtdSecondDirectorPanCardChooseFileBtn;
	}

	public WebElement getLtdDirectorGstNoEdt() {
		return LtdDirectorGstNoEdt;
	}

	public WebElement getLtdDirectorUploadGstChooseFileBtn() {
		return LtdDirectorUploadGstChooseFileBtn;
	}

	public WebElement getLtdDirectorCinNoEdt() {
		return LtdDirectorCinNoEdt;
	}

	public WebElement getLtdDirectorUploadCinNoImageChooseFileBtn() {
		return LtdDirectorUploadCinNoImageChooseFileBtn;
	}

	public WebElement getLtdUploadYourImageChooseFileBtn() {
		return LtdUploadYourImageChooseFileBtn;
	}

	public WebElement getLtdBankNameEdt() {
		return LtdBankNameEdt;
	}

	public WebElement getLtdAcNoEdt() {
		return LtdAcNoEdt;
	}

	public WebElement getLtdIfscCodeEdt() {
		return LtdIfscCodeEdt;
	}

	public WebElement getLtdAcHolderNameEdt() {
		return LtdAcHolderNameEdt;
	}

	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}
    
	//Business Libraries
    
	WebDriverUtility wUtil = new WebDriverUtility();
	
	public void updateKycIfBusinessTypeIsPropretor(String PropretorBusinessType, String PropretorName, String PropretorPanNo, String PropretorPanImagePath, String PropretorGstNo, String PropretorGstNoImagePath, String PropretorBankName, String PropretorAcNo, String PropretorIfscCode, String PropretorAcHolderName) throws Exception
	{
		Thread.sleep(2000);
		wUtil.handleDropdownByValue(BusinessTypeDrpDwn, PropretorBusinessType);
		Thread.sleep(2000);
		PropretorNameEdt.sendKeys(PropretorName);
		Thread.sleep(2000);
		PropretorPanNoEdt.sendKeys(PropretorPanNo);
		Thread.sleep(2000);
		PropretorUploadPanChooseFileBtn.sendKeys(PropretorPanImagePath);
		Thread.sleep(2000);
		PropretorGstNoEdt.sendKeys(PropretorGstNo);
		Thread.sleep(2000);
		PropretorUploadGstNoChooseFileBtn.sendKeys(PropretorGstNoImagePath);
		Thread.sleep(2000);
		PropretorBankNameEdt.sendKeys(PropretorBankName);
		Thread.sleep(2000);
		PropretorAccountNoEdt.sendKeys(PropretorAcNo);
		Thread.sleep(2000);
		PropretorIfscCodeEdt.sendKeys(PropretorIfscCode);
		Thread.sleep(2000);
		PropretorAcHolderNameEdt.sendKeys(PropretorAcHolderName);
		Thread.sleep(2000);
		SubmitBtn.click();
		
	}
	
	public void updateKycIfBusinessTypeIsLLP(String LLpBusinessType, String LLpDirectorName, String LLpDirectorMobileNo, String LLpDirectorAadhaarNo, String LLpAadharFrontImagePath, String LLpAadharBackImagePath, String LLpDirectorPanNo, String LLpDirectorPanImagePath, String LLpDirectorGstNo, String LLpDirectorGstImagePath, String LLpDirectorCinNo, String LLpDirectorCinImagePath, String LLpDirectorProfileImagePath, String LLpBankName,String LLpAcNo, String LLpIfscCode, String LLpAcHolderName) throws Exception
	{
		Thread.sleep(2000);
		wUtil.handleDropdownByValue(BusinessTypeDrpDwn, LLpBusinessType);
		Thread.sleep(2000);
		LLpDirectorNameEdt.sendKeys(LLpDirectorName);
		Thread.sleep(2000);
		LLpDirectorMobileNoEdt.sendKeys(LLpDirectorMobileNo);
		Thread.sleep(2000);
		LLpDirectorAadharNoEdt.sendKeys(LLpDirectorAadhaarNo);
		Thread.sleep(2000);
		LLpUploadAadharFrontSideChooseFileBtn.sendKeys(LLpAadharFrontImagePath);
		Thread.sleep(2000);
		LLpUploadAadharBackSideChooseFileBtn.sendKeys(LLpAadharBackImagePath);
		Thread.sleep(2000);
		LLpDirectorPanNoEdt.sendKeys(LLpDirectorPanNo);
		Thread.sleep(2000);
		LLpDirectorUploadPanImageChooseFileBtn.sendKeys(LLpDirectorPanImagePath);
		Thread.sleep(2000);
		LLpDirectorGstNoEdt.sendKeys(LLpDirectorGstNo);
		Thread.sleep(2000);
		LLpDirectorGstImageChooseFileBtn.sendKeys(LLpDirectorGstImagePath);
		Thread.sleep(2000);
		LLpDirectorCinNoEdt.sendKeys(LLpDirectorCinNo);
        Thread.sleep(2000);
		LLpDirectorUploadCinChooseFileBtn.sendKeys(LLpDirectorCinImagePath);
		Thread.sleep(2000);
		LLpDirectorUploadProfilePictureChooseFileBtn.sendKeys(LLpDirectorProfileImagePath);
		Thread.sleep(2000);
		LLpBankNameEdt.sendKeys(LLpBankName);
		Thread.sleep(2000);
		LLpAcNoEdt.sendKeys(LLpAcNo);
        Thread.sleep(2000);
		LLpIfscCodeEdt.sendKeys(LLpIfscCode);
		Thread.sleep(2000);
		LLpAcHolderNameEdt.sendKeys(LLpAcHolderName);
		Thread.sleep(2000);
		SubmitBtn.click();
		
	}
	
	public void updateKycIfBusinessTypeIsPvtLtd(String PvtLtdBusinessType, String PvtLtdFirstDirectorName, String PvtLtdDirectorMobileNo, String PvtLtdFrstDirectorAadhaarNo, String PvtLtdFrstDirectorAadharFrntImagePath, String PvtLtdFrstDirectorAadharBackImagePath, String PvtLtdFrstDirectorPanNo, String PvtLtdFrstDirectorPanImagePath, String PvtLtdSecondDirectorName, String PvtLtdSecondDirectorAadharNo, String PvtLtdSecondDirectorAadharFrontImagePath, String PvtLtdSecondDirectorAadharBackImagePath, String PvtLtdSecondDirectorPanNo, String PvtLtdSecondDirectorPanImagePath,String PvtLtdDirectorGstNo, String PvtLtdDirectorGstImagePath, String PvtLtdDirectorCinNo, String PvtLtdDirectorCinImagePath, String PvtLtdProfilePhotoPath, String PvtLtdBankName, String PvtLtdAcNo, String PvtLtdIfscCode, String PvtLtdAcHolderName) throws Exception
	{
		Thread.sleep(2000);
		wUtil.handleDropdownByValue(BusinessTypeDrpDwn, PvtLtdBusinessType);
		Thread.sleep(2000);
		PvtLtdFirstDirectorNameEdt.sendKeys(PvtLtdFirstDirectorName);
		Thread.sleep(2000);
		PvtLtdDirectorMobileNoEdt.sendKeys(PvtLtdDirectorMobileNo);
		Thread.sleep(2000);
		PvtLtdFirstDirectorAadharNoEdt.sendKeys(PvtLtdFrstDirectorAadhaarNo);
		Thread.sleep(2000);
		PvtLtdFirstDirectorUploadAadharFrontChooseFileBtn.sendKeys(PvtLtdFrstDirectorAadharFrntImagePath);
		Thread.sleep(2000);
		PvtLtdFirstDirectorUploadAadharBackChooseFileBtn.sendKeys(PvtLtdFrstDirectorAadharBackImagePath);
		Thread.sleep(2000);
		PvtLtdFirstDirectorPanNoEdt.sendKeys(PvtLtdFrstDirectorPanNo);
		Thread.sleep(2000);
		PvtLtdFirstDirectorPanCardChooseFileBtn.sendKeys(PvtLtdFrstDirectorPanImagePath);
		Thread.sleep(2000);
		PvtLtdSecondDirectorNameEdt.sendKeys(PvtLtdSecondDirectorName);
		Thread.sleep(2000);
		PvtLtdSecondDirectorAadharNoEdt.sendKeys(PvtLtdSecondDirectorAadharNo);
		Thread.sleep(2000);
		PvtLtdSecondDirectorUploadAadharFrontChooseFileBtn.sendKeys(PvtLtdSecondDirectorAadharFrontImagePath);
		Thread.sleep(2000);
		PvtLtdSecondDirectorUploadAadharBackChooseFileBtn.sendKeys(PvtLtdSecondDirectorAadharBackImagePath);
		Thread.sleep(2000);
		PvtLtdSecondDirectorPanNoEdt.sendKeys(PvtLtdSecondDirectorPanNo);
		Thread.sleep(2000);
		PvtLtdSecondDirectorPanCardChooseFileBtn.sendKeys(PvtLtdSecondDirectorPanImagePath);
		Thread.sleep(2000);
		PvtLtdDirectorGstNoEdt.sendKeys(PvtLtdDirectorGstNo);
		Thread.sleep(2000);
		PvtLtdDirectorUploadGstChooseFileBtn.sendKeys(PvtLtdDirectorGstImagePath);
		Thread.sleep(2000);
		PvtLtdDirectorCinNoEdt.sendKeys(PvtLtdDirectorCinNo);
		Thread.sleep(2000);
		PvtLtdDirectorUploadCinNoImageChooseFileBtn.sendKeys(PvtLtdDirectorCinImagePath);
		Thread.sleep(2000);
		PvtLtdUploadYourImageChooseFileBtn.sendKeys(PvtLtdProfilePhotoPath);
		Thread.sleep(2000);
		PvtLtdBankNameEdt.sendKeys(PvtLtdBankName);
		Thread.sleep(2000);
		PvtLtdAcNoEdt.sendKeys(PvtLtdAcNo);
		Thread.sleep(2000);
		PvtLtdIfscCodeEdt.sendKeys(PvtLtdIfscCode);
		Thread.sleep(2000);
		PvtLtdAcHolderNameEdt.sendKeys(PvtLtdAcHolderName);
		Thread.sleep(2000);
		SubmitBtn.click();
	}
	
	public void updateKycIfBusinessTypeIsLtd(String LtdBusinessType, String LtdFirstDirectorName, String LtdDirectorMobileNo, String LtdFrstDirectorAadhaarNo, String LtdFrstDirectorAadharFrntImagePath, String LtdFrstDirectorAadharBackImagePath, String LtdFrstDirectorPanNo, String LtdFrstDirectorPanImagePath, String LtdSecondDirectorName, String LtdSecondDirectorAadharNo, String LtdSecondDirectorAadharFrontImagePath, String LtdSecondDirectorAadharBackImagePath, String LtdSecondDirectorPanNo, String LtdSecondDirectorPanImagePath,String LtdDirectorGstNo, String LtdDirectorGstImagePath, String LtdDirectorCinNo, String LtdDirectorCinImagePath, String LtdProfilePhotoPath, String LtdBankName, String LtdAcNo, String LtdIfscCode, String LtdAcHolderName) throws Exception
	{
		Thread.sleep(2000);
		wUtil.handleDropdownByValue(BusinessTypeDrpDwn, LtdBusinessType);
		Thread.sleep(2000);
		PvtLtdFirstDirectorNameEdt.sendKeys(LtdFirstDirectorName);
		Thread.sleep(2000);
		PvtLtdDirectorMobileNoEdt.sendKeys(LtdDirectorMobileNo);
		Thread.sleep(2000);
		PvtLtdFirstDirectorAadharNoEdt.sendKeys(LtdFrstDirectorAadhaarNo);
		Thread.sleep(2000);
		PvtLtdFirstDirectorUploadAadharFrontChooseFileBtn.sendKeys(LtdFrstDirectorAadharFrntImagePath);
		Thread.sleep(2000);
		PvtLtdFirstDirectorUploadAadharBackChooseFileBtn.sendKeys(LtdFrstDirectorAadharBackImagePath);
		Thread.sleep(2000);
		PvtLtdFirstDirectorPanNoEdt.sendKeys(LtdFrstDirectorPanNo);
		Thread.sleep(2000);
		PvtLtdFirstDirectorPanCardChooseFileBtn.sendKeys(LtdFrstDirectorPanImagePath);
		Thread.sleep(2000);
		PvtLtdSecondDirectorNameEdt.sendKeys(LtdSecondDirectorName);
		Thread.sleep(2000);
		PvtLtdSecondDirectorAadharNoEdt.sendKeys(LtdSecondDirectorAadharNo);
		Thread.sleep(2000);
		PvtLtdSecondDirectorUploadAadharFrontChooseFileBtn.sendKeys(LtdSecondDirectorAadharFrontImagePath);
		Thread.sleep(2000);
		PvtLtdSecondDirectorUploadAadharBackChooseFileBtn.sendKeys(LtdSecondDirectorAadharBackImagePath);
		Thread.sleep(2000);
		PvtLtdSecondDirectorPanNoEdt.sendKeys(LtdSecondDirectorPanNo);
		Thread.sleep(2000);
		PvtLtdSecondDirectorPanCardChooseFileBtn.sendKeys(LtdSecondDirectorPanImagePath);
		Thread.sleep(2000);
		PvtLtdDirectorGstNoEdt.sendKeys(LtdDirectorGstNo);
		Thread.sleep(2000);
		PvtLtdDirectorUploadGstChooseFileBtn.sendKeys(LtdDirectorGstImagePath);
		Thread.sleep(2000);
		PvtLtdDirectorCinNoEdt.sendKeys(LtdDirectorCinNo);
		Thread.sleep(2000);
		PvtLtdDirectorUploadCinNoImageChooseFileBtn.sendKeys(LtdDirectorCinImagePath);
		Thread.sleep(2000);
		PvtLtdUploadYourImageChooseFileBtn.sendKeys(LtdProfilePhotoPath);
		Thread.sleep(2000);
		PvtLtdBankNameEdt.sendKeys(LtdBankName);
		Thread.sleep(2000);
		PvtLtdAcNoEdt.sendKeys(LtdAcNo);
		Thread.sleep(2000);
		PvtLtdIfscCodeEdt.sendKeys(LtdIfscCode);
		Thread.sleep(2000);
		PvtLtdAcHolderNameEdt.sendKeys(LtdAcHolderName);
		Thread.sleep(2000);
		SubmitBtn.click();
	}
	
}

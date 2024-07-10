package Kyc;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepository.BusinessKycPage;
import objectRepository.DashBoardPage;
import objectRepository.MyProfilePage;

public class KycForAllBusinessTypes extends BaseClass{

	@Test
	public void KycForPropretor() throws Exception
	{
		String PropretorBusinessType="Proprietor", PropretorName="Abc", PropretorPanNo="CTPPG2533D", PropretorPanImagePath="C:\\Users\\vikra\\OneDrive\\Desktop\\One Drive Folder\\OneDrive\\Pictures\\Saved Pictures", PropretorGstNo="29GGGGG1314R9Z6", PropretorGstNoImagePath="C:\\Users\\vikra\\OneDrive\\Desktop\\One Drive Folder\\OneDrive\\Pictures\\Saved Pictures", PropretorBankName="Andhra Bank", PropretorAcNo="1513059188", PropretorIfscCode="ANDB0007806", PropretorAcHolderName="Hitler";
	    String LLpBusinessType="LLP", LLpDirectorName="Def", LLpDirectorMobileNo="9865321475", LLpDirectorAadhaarNo="436263256859", LLpAadharFrontImagePath="Give Front Image Path", LLpAadharBackImagePath="Give Back Image Path", LLpDirectorPanNo="CTPPK3566D", LLpDirectorPanImagePath="Path", LLpDirectorGstNo="29GGGGG1314R9Z6", LLpDirectorGstImagePath="Path", LLpDirectorCinNo="L01631KA2010PTC096843", LLpDirectorCinImagePath="Path", LLpDirectorProfileImagePath="Path", LLpBankName="SBI Bank", LLpAcNo="95625638965", LLpIfscCode="SBIN0006593", LLpAcHolderName="Ghi";
	    String PvtLtdBusinessType="Pvt LTD", PvtLtdFirstDirectorName="asdfg", PvtLtdDirectorMobileNo="7895489632", PvtLtdFrstDirectorAadhaarNo="854269325863", PvtLtdFrstDirectorAadharFrntImagePath="Path", PvtLtdFrstDirectorAadharBackImagePath="Path", PvtLtdFrstDirectorPanNo="CTPPO6588T", PvtLtdFrstDirectorPanImagePath="Path", PvtLtdSecondDirectorName="Hijk", PvtLtdSecondDirectorAadharNo="965823659417", PvtLtdSecondDirectorAadharFrontImagePath="Path", PvtLtdSecondDirectorAadharBackImagePath="Path", PvtLtdSecondDirectorPanNo="CPLLK6533P", PvtLtdSecondDirectorPanImagePath="Path", PvtLtdDirectorGstNo="29GGGGG1314R9Y8", PvtLtdDirectorGstImagePath="Path", PvtLtdDirectorCinNo="L01631KA2010PTC096843", PvtLtdDirectorCinImagePath="Path", PvtLtdProfilePhotoPath="Path", PvtLtdBankName="ICICI Bank", PvtLtdAcNo="95683265412", PvtLtdIfscCode="ICIC0000075", PvtLtdAcHolderName="TechO125";
	    String LtdBusinessType="LTD", LtdFirstDirectorName="POKJllkj", LtdDirectorMobileNo="8935645452", LtdFrstDirectorAadhaarNo="9632569836", LtdFrstDirectorAadharFrntImagePath="Path", LtdFrstDirectorAadharBackImagePath="Path", LtdFrstDirectorPanNo="KLOOP3366H", LtdFrstDirectorPanImagePath="Path", LtdSecondDirectorName="ASDFGH", LtdSecondDirectorAadharNo="996933265366", LtdSecondDirectorAadharFrontImagePath="Path", LtdSecondDirectorAadharBackImagePath="Path", LtdSecondDirectorPanNo="NMLLP3622L", LtdSecondDirectorPanImagePath="Path", LtdDirectorGstNo="29GGGGG1314R9L3", LtdDirectorGstImagePath="Path", LtdDirectorCinNo="L01631KA2010PTC096639", LtdDirectorCinImagePath="Path", LtdProfilePhotoPath="Path", LtdBankName="Jupiter", LtdAcNo="36985412365", LtdIfscCode="FDRL8886669", LtdAcHolderName="Xyz";
				
		DashBoardPage dbPage = new DashBoardPage(driver);
		dbPage.getProfileImage().click();
		MyProfilePage mpPage = new MyProfilePage(driver);
		mpPage.getKycLnk().click();
		BusinessKycPage bkPage = new BusinessKycPage(driver);
		bkPage.updateKycIfBusinessTypeIsPropretor(PropretorBusinessType, PropretorName, PropretorPanNo, PropretorPanImagePath, PropretorGstNo, PropretorGstNoImagePath, PropretorBankName, PropretorAcNo, PropretorIfscCode, PropretorAcHolderName);
		Thread.sleep(2000);
		dbPage.getProfileImage().click();
		Thread.sleep(2000);
		mpPage.getKycLnk().click();
		Thread.sleep(2000);
		bkPage.updateKycIfBusinessTypeIsLLP(LLpBusinessType, LLpDirectorName, LLpDirectorMobileNo, LLpDirectorAadhaarNo, LLpAadharFrontImagePath, LLpAadharBackImagePath, LLpDirectorPanNo, LLpDirectorPanImagePath, LLpDirectorGstNo, LLpDirectorGstImagePath, LLpDirectorCinNo, LLpDirectorCinImagePath, LLpDirectorProfileImagePath, LLpBankName, LLpAcNo, LLpIfscCode, LLpAcHolderName);
		Thread.sleep(2000);
		dbPage.getProfileImage().click();
		Thread.sleep(2000);
		mpPage.getKycLnk().click();
		Thread.sleep(2000);
		bkPage.updateKycIfBusinessTypeIsPvtLtd(PvtLtdBusinessType, PvtLtdFirstDirectorName, PvtLtdDirectorMobileNo, PvtLtdFrstDirectorAadhaarNo, PvtLtdFrstDirectorAadharFrntImagePath, PvtLtdFrstDirectorAadharBackImagePath, PvtLtdFrstDirectorPanNo, PvtLtdFrstDirectorPanImagePath, PvtLtdSecondDirectorName, PvtLtdSecondDirectorAadharNo, PvtLtdSecondDirectorAadharFrontImagePath, PvtLtdSecondDirectorAadharBackImagePath, PvtLtdSecondDirectorPanNo, PvtLtdSecondDirectorPanImagePath, PvtLtdDirectorGstNo, PvtLtdDirectorGstImagePath, PvtLtdDirectorCinNo, PvtLtdDirectorCinImagePath, PvtLtdProfilePhotoPath, PvtLtdBankName, PvtLtdAcNo, PvtLtdIfscCode, PvtLtdAcHolderName);
		Thread.sleep(2000);
		dbPage.getProfileImage().click();
		Thread.sleep(2000);
		mpPage.getKycLnk().click();
		Thread.sleep(2000);
		bkPage.updateKycIfBusinessTypeIsLtd(LtdBusinessType, LtdFirstDirectorName, LtdDirectorMobileNo, LtdFrstDirectorAadhaarNo, LtdFrstDirectorAadharFrntImagePath, LtdFrstDirectorAadharBackImagePath, LtdFrstDirectorPanNo, LtdFrstDirectorPanImagePath, LtdSecondDirectorName, LtdSecondDirectorAadharNo, LtdSecondDirectorAadharFrontImagePath, LtdSecondDirectorAadharBackImagePath, LtdSecondDirectorPanNo, LtdSecondDirectorPanImagePath, LtdDirectorGstNo, LtdDirectorGstImagePath, LtdDirectorCinNo, LtdDirectorCinImagePath, LtdProfilePhotoPath, LtdBankName, LtdAcNo, LtdIfscCode, LtdAcHolderName);
		
	}
	
}

package Utilities;

public class ExcelData extends ExcelUtils {

	final static String Path_TestData = System.getProperty("user.dir");
	final static String File_TestData = "//testdata.xlsx";	
	
	protected static String URL = ExcelUtils.getCellData(Path_TestData + File_TestData, "TestData", "Url", 2);
	protected static String Username = ExcelUtils.getCellData(Path_TestData + File_TestData, "TestData", "UserName", 2);
	protected static String Password = ExcelUtils.getCellData(Path_TestData + File_TestData, "TestData", "PassWord", 2);
	protected static String PolicyNo = ExcelUtils.getCellData(Path_TestData + File_TestData, "TestData", "PolicyNumber", 2);
	protected static String Evntdate = ExcelUtils.getCellData(Path_TestData + File_TestData, "TestData", "EventDate", 2);
	protected static String Product = ExcelUtils.getCellData(Path_TestData + File_TestData, "TestData", "Product", 2);
	protected static String scheduleOfbenefits = ExcelUtils.getCellData(Path_TestData + File_TestData, "TestData", "ScheduleOfBenefits", 2);
	protected static String SIScoverage = ExcelUtils.getCellData(Path_TestData + File_TestData, "TestData", "SISCoverage", 2);
	protected static String coverage = ExcelUtils.getCellData(Path_TestData + File_TestData, "TestData", "Coverage", 2);
	protected static String occupation = ExcelUtils.getCellData(Path_TestData + File_TestData, "TestData", "Occupation", 2);
	protected static String relationship = ExcelUtils.getCellData(Path_TestData + File_TestData, "TestData", "Relationship", 2);
	protected static String provincecode = ExcelUtils.getCellData(Path_TestData + File_TestData, "TestData", "ProvinceCode", 2);
	protected static String eventdescription = ExcelUtils.getCellData(Path_TestData + File_TestData, "TestData", "EventDescription", 2);
	protected static String subclaimdescription = ExcelUtils.getCellData(Path_TestData + File_TestData, "TestData", "SubClaimDescription", 2);
	protected static String causecode = ExcelUtils.getCellData(Path_TestData + File_TestData, "TestData", "CauseCode", 2);
	protected static String subclaimcode = ExcelUtils.getCellData(Path_TestData + File_TestData, "TestData", "SubClaimCode", 2);
	protected static String claimtype = ExcelUtils.getCellData(Path_TestData + File_TestData, "TestData", "ClaimType", 2);
	protected static String causeofloss = ExcelUtils.getCellData(Path_TestData + File_TestData, "TestData", "CauseOfLoss", 2);
	protected static String contributingfactor = ExcelUtils.getCellData(Path_TestData + File_TestData, "TestData", "ContributingFactor", 2);
	protected static String conditioncode = ExcelUtils.getCellData(Path_TestData + File_TestData, "TestData", "ConditionCode", 2);
	protected static String causeofdeath = ExcelUtils.getCellData(Path_TestData + File_TestData, "TestData", "CauseOfDeath", 2);
	protected static String medicaldiagnosis = ExcelUtils.getCellData(Path_TestData + File_TestData, "TestData", "MedicalDiagnosis", 2);
	protected static String numberofevents = ExcelUtils.getCellData(Path_TestData + File_TestData, "TestData", "NumberOfEvents", 2);
	protected static String benefittype = ExcelUtils.getCellData(Path_TestData + File_TestData, "TestData", "BenefitType", 2);
	protected static String totalclaimAmt = ExcelUtils.getCellData(Path_TestData + File_TestData, "TestData", "TotalClaimAmt", 2);
	protected static String benificiarytype = ExcelUtils.getCellData(Path_TestData + File_TestData, "TestData", "BenificiaryType", 2);
	protected static String beneficiaryname = ExcelUtils.getCellData(Path_TestData + File_TestData, "TestData", "BeneficiaryName", 2);
	protected static String Benrelationship = ExcelUtils.getCellData(Path_TestData + File_TestData, "TestData", "BenRelationship", 2);
	protected static String indemnitytypecode = ExcelUtils.getCellData(Path_TestData + File_TestData, "TestData", "IndemnityTypeCode", 2);
	protected static String comment = ExcelUtils.getCellData(Path_TestData + File_TestData, "TestData", "Comment", 2);
	protected static String paymentletter = ExcelUtils.getCellData(Path_TestData + File_TestData, "TestData", "PaymentLetter", 2);
	protected static String receiptdate = ExcelUtils.getCellData(Path_TestData + File_TestData, "TestData", "ReceiptDate", 2);
	protected static String paymentdescription = ExcelUtils.getCellData(Path_TestData + File_TestData, "TestData", "PaymentDescription", 2);
	protected static String paymentmethod = ExcelUtils.getCellData(Path_TestData + File_TestData, "TestData", "PaymentMethod", 2);
	protected static String paymentmode = ExcelUtils.getCellData(Path_TestData + File_TestData, "TestData", "PaymentMode", 2);
}

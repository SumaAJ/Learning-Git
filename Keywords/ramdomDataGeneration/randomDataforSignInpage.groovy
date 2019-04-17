package ramdomDataGeneration

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class randomDataforSignInpage {

	public String firstName;
	public String lastName;
	public String email;
	public String password;
	public String zipCode;
	public String phoneNumber;

	@Keyword
	def randomData(){
		Random random=new Random();

		firstName="firstName"+random.nextInt();
		lastName="lastName"+random.nextInt();
		email="email"+random.nextInt()+"@gmail.com";
		password="password"+random.nextInt();
		Integer zip=(Integer)(Math.random()*100+562000);
		zipCode= Integer.toString(zip);
		Long phone=(Long)(Math.random()*100000+33330000000L);
		phoneNumber =Long.toString(phone);


		WebUI.sendKeys(findTestObject('SignInPage/FirstName'),firstName);
		WebUI.sendKeys(findTestObject('SignInPage/LastName'), lastName);
		WebUI.sendKeys(findTestObject('SignInPage/Email'), email);
		WebUI.sendKeys(findTestObject('SignInPage/PhoneNumber'), phoneNumber);
		WebUI.sendKeys(findTestObject('SignInPage/ZipCode'), zipCode);
		WebUI.sendKeys(findTestObject('SignInPage/Password'), password);
	}


	def SignInCredentials(){

		WebUI.sendKeys(findTestObject('SignInPage/FirstName'),firstName);
		WebUI.sendKeys(findTestObject('SignInPage/LastName'), lastName);
		WebUI.sendKeys(findTestObject('SignInPage/Email'), email);
		WebUI.sendKeys(findTestObject('SignInPage/Password'), password);
		WebUI.sendKeys(findTestObject('SignInPage/ZipCode'), zipCode);
		WebUI.sendKeys(findTestObject('SignInPage/PhoneNumber'), phoneNumber);
	}
}

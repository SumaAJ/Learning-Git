import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('HomePageTestCase/VerifytheFindAStore'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('FindAStoreElements/enterKeywordText'), 3)

System.out.println(WebUI.getText(findTestObject('FindAStoreElements/enterKeywordText')))

WebUI.waitForElementPresent(findTestObject('FindAStoreElements/enterKeywordTextbox'), 2)

WebUI.sendKeys(findTestObject('FindAStoreElements/enterKeywordTextbox'), 'Kori Chair')

WebUI.click(findTestObject('FindAStoreElements/goButton'))

WebUI.delay(5)

CustomKeywords.'dropDown.HomePageDropDownHandle.listOFproduct'()


import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.TexturePaintContext.Int as Int
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Common TestCase/OpenBrowserNavigateToURL'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('SignInPage/MyAccount'), 4)

WebUI.mouseOver(findTestObject('SignInPage/MyAccount'))

WebUI.waitForElementPresent(findTestObject('SignInPage/SignUpPage'), 2)

WebUI.click(findTestObject('SignInPage/SignUpPage'))

WebUI.verifyElementText(findTestObject('SignInPage/OfferTextMessage'), 'Sign up for Insider Perks and get 10% off your next visit!')

CustomKeywords.'ramdomDataGeneration.randomDataforSignInpage.randomData'()

/*WebDriver webDriver = DriverFactory.getWebDriver();

	Int size =webDriver.findElements(By.tagName("iframe")).size();

System.out.println(size);
webDriver.switchTo().frame(2);
webDriver.findElement(By.xpath("//input[@id='dwfrm_profile_customer_terms']")).click();*/
WebUI.scrollToPosition(3, 50)

System.out.println(WebUI.getText(findTestObject('SignInPage/PolicyAcceptText')))

WebUI.delay(5)

WebUI.click(findTestObject('SignInPage/acceptCheckBoxObject'))

WebUI.verifyElementChecked(findTestObject('SignInPage/acceptCheckBoxObject'), 2)


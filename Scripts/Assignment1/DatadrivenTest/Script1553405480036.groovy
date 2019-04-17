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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.BreakIterator as BreakIterator
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.machinepublishers.jbrowserdriver.Alert as Alert
import javafx.scene.control.Alert.AlertType as AlertType
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.server.htmlrunner.HTMLSuiteResult.HrefConverter as HrefConverter
import org.apache.jasper.tagplugins.jstl.core.If as If
import org.apache.poi.hssf.record.PageBreakRecord.Break as Break
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser(null)

url = findTestData('New Test Data').getValue('url', 1)

keyword = findTestData('New Test Data').getValue('keyword', 1)

urlToSearch = findTestData('New Test Data').getValue('keyword', 1)

WebUI.maximizeWindow()

WebUI.navigateToUrl(url)

WebUI.setText(findTestObject('Page_Google/input_q'), keyword)

WebUI.sendKeys(findTestObject('Object Repository/Page_Google/input_q'), Keys.chord(Keys.RETURN))

'In Object we have added one link now we are modifying that object'

'by setting URL = http://www.societyhive.com/'
l1: for (int j = 1; j <= 4; j++) {
    String xpathval = ((('//*[@id=' + '"rso"') + ']/div/div/div[') + j) + ']/div/div/h3/a'

    LinkToSearch = WebUI.modifyObjectProperty(findTestObject('Object Repository/resultPage/resultLink'), 'xpath', 'equals', 
        xpathval, true)

    LinkVal = WebUI.getAttribute(LinkToSearch, 'href', FailureHandling.STOP_ON_FAILURE)

    if (LinkVal == urlToSearch) {
        WebUI.click(LinkToSearch, FailureHandling.STOP_ON_FAILURE)

        Break l1
    }
}

WebUI.closeBrowser()


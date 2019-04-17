

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

public class CommonMethodTotakeTestObject {
	
	def testObject(TestObject object)
	{
		
		WebElement element=WebUiCommonHelper.findElement(object,20)
		WebDriver driver=DriverFactory.getWebDriver();
	}
}

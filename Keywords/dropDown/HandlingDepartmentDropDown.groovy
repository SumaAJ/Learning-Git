package dropDown

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.remote.server.DriverFactory

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper

public class HandlingDepartmentDropDown {


	@Keyword
	def listofDepartmentmenu(TestObject object) {

		List<WebElement> element=WebUiCommonHelper.findWebElements(object, 10);
		for(WebElement ele:element) {
			System.out.println(ele.getText())
		}
	}
}

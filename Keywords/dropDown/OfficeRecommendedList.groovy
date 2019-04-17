package dropDown

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory

public class OfficeRecommendedList {


	@Keyword
	def recommendedListofOffice(String text) {
		System.out.println("Verify the input string "+text);
		WebDriver webDriver = DriverFactory.getWebDriver();

		List<WebElement> element=webDriver.findElements(By.xpath("//div[@id='visualnav1_rr']//li//h3"));
		for(int i=0;i<element.size();i++) {
			System.out.println(element.get(i).getText());
		}
	}
}

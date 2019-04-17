package dropDownUsingSelect

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory

public class HandleDropdownUsingSelectclass {


	@Keyword
	def dropDownofmaxDistance() {
		System.out.println("Verify the input string ");
		WebDriver webDriver = DriverFactory.getWebDriver();

		WebElement listofMaxDistance=webDriver.findElement(By.xpath("//*[@id='dwfrm_storelocator_maxdistance']"));

		Select select=new Select(listofMaxDistance);
		List<WebElement> allMaXDistance= select.getOptions();

		LinkedHashMap<String, Integer> map=new LinkedHashMap<String, Integer>();
		for(WebElement maxDistance:allMaXDistance) {
			String key=maxDistance.getText();
			if(map.containsKey(key)) {
				Integer value=map.get(key);
				value++;
				map.put(key, value);
			}

			else{

				map.put(key, 1);
			}
		}
		System.out.println(map);
		Set<String> allKeys=map.keySet();
		for(String key:allKeys) {

			System.out.println(key);
		}
		select.selectByValue("100");
	}
}

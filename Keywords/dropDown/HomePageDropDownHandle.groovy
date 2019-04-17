package dropDown

import java.util.concurrent.TimeUnit

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory

public class HomePageDropDownHandle {

	public WebDriver webDriver;
	@Keyword
	def dropDownHandle(String text) {
		System.out.println("Verify the input string "+text);
		webDriver= DriverFactory.getWebDriver();

		List<WebElement> element=webDriver.findElements(By.xpath("//ul[@class='menu-category level-1 subcats'] /li/a"));
		for(int i=0;i<element.size();i++) {
			System.out.println(element.get(i).getText());
		}
	}

	@Keyword
	def listOFproduct() {
		webDriver= DriverFactory.getWebDriver();

		List<WebElement> element=webDriver.findElements(By.xpath("//ul[@id='search-result-items']/li"));
		for(int i=0;i<element.size();i++) {
			System.out.println("text of the product: "+element.get(i).getText());

			if((element.get(i).getText()).contains("Kori Chair, Blue")) {
				element.get(i).click();
				webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS)
				try{
					WebElement storeaddress=webDriver.findElements(By.xpath("//span[contains(text(),'Store is Washington-Puyallup')]"));
					System.out.println(storeaddress.getText());
				}

				catch(Exception e) {
					System.out.println("product not present")
				}
			}

			else{
				System.out.println("product not not there in your location");
			}
		}
	}
}








/*//Boolean dropDownData= webDriver.findElements(By.xpath("//ul[@class='menu-category level-1 subcats'] /li/a")).size()>0;
 try{
 if(dropDownData) {
 List<WebElement> element=webDriver.findElements(By.xpath("//ul[@class='menu-category level-1 subcats'] /li/a"));
 System.out.println("Verify the input string "+text);
 for(int i=0;i<=element.size();i++) {
 if(element.get(i).getText().equals(text)) {
 System.out.println(element.get(i).getText());
 Actions actions=new Actions(webDriver);
 actions.moveToElement(element.get(i)).click().perform();
 webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS)
 webDriver.findElement(By.xpath("//li[@id='furniture']")).click();
 //element.get(i).click();
 List<WebElement>	listElement=webDriver.findElements(By.xpath("//li[@id='furniture']/../li"));
 //actions.moveToElement(webDriver.findElements(By.xpath("//li[@id='furniture']/../li")));
 for(WebElement ele:listElement) {
 System.out.println(ele.getText());
 }
 }
 }
 }
 }
 catch (Exception e) {
 println "Failed"
 }
 }*/
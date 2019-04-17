package learning

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

public class GlobalVariable {


	@Keyword
	def  getdefaultArralist(ArrayList<String> listofElement) {

		for(int i=0;i<listofElement.size();i++){

			println listofElement.get(i);
		}
	}

	@Keyword
	def  convertArralisttoLikedList(ArrayList<String> listofElement) {

		List<String> list=new LinkedList<String>();

		list.addAll(listofElement);
		for(def ele:list) {
			println "Linked list ele"+ele
		}
	}

	@Keyword
	def convertToTreeMap(LinkedHashMap<String, String> hashMap) {

		Map<Integer, String> treeMap = new TreeMap<>();

		for (Map.Entry<String, String> e : hashMap.entrySet()) {
			treeMap.put(e.getKey(), Integer.parseInt(e.getValue()));
		}
		println treeMap
	}
}

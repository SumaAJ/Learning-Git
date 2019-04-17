import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import java.nio.file.Path
import java.io.*;
import java.nio.file.Files;
import java.nio.file.*;

public class replaceData {

	@Keyword
	def getFile() {

		KeywordLogger log=new KeywordLogger();

		//File oldfile=new File("D:\\Users\\703219448\\Desktop\\Desktop\\file.xlsx");

		File oldfile=new File("D:\\Users\\703219448\\Downloads\\file.xlsx");

		if(oldfile.exists()){

			File newfile=new File("D:\\Users\\703219448\\Desktop\\Desktop\\file1.xlsx");

			if(!newfile.exists())
			{
				Files.copy(oldfile.toPath(), newfile.toPath());
				log.logInfo("File is successfully moved")
				//oldfile.renameTo(newfile);
			}
			else{
				newfile.delete();
				Files.copy(oldfile.toPath(), newfile.toPath());
				KeywordUtil.logInfo("Deleted the old file and moved new file")
				//KeywordUtil.markFailedAndStop("Unable to delete folder in the existing folder")

			}
		}
	}
}



















/*try{
 if(newfile.createNewFile() || !newfile.createNewFile()) {
 reader=new BufferedReader(new FileReader(oldfile));
 writer=new PrintWriter(newfile);
 while((Line=reader.readLine()) !=null){
 writer.println(Line);
 }
 reader.close();
 writer.close();
 }
 oldfile.delete();
 }
 catch (Exception e){
 println "file not copied"
 }
 */




package assignment1

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

import internal.GlobalVariable


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellReading {

	// public Workbook workbook= null;
	// public Sheet firstSheet= null;

	public String INPUT_XLS = "D:\\Users\\703219448\\Katalon Studio\\ATHOME\\Data Files\\Data.xlsx";

	public ExcellReading() {
	}

	public ExcellReading(String filepath) {
		INPUT_XLS = filepath;
	}

	public Map<Integer, List<String>> ReadExcel() throws IOException {

		FileInputStream inputStream = new FileInputStream(new File("TestExecution.xlsx"));

		Map<Integer, List<String>> data = new HashMap<Integer, List<String>>();

		Workbook workbook = new XSSFWorkbook(inputStream);

		Sheet firstSheet = workbook.getSheetAt(5);

		Iterator<Row> iterator = firstSheet.iterator();

		// Test test=new Test();
		int rowCnt = 0;

		while (iterator.hasNext()) {
			Row nextRow = iterator.next();

			Iterator<Cell> cellIterator = nextRow.cellIterator();
			List<String> obj = new ArrayList<String>();
			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();

				String cellobj = cell.getStringCellValue();

				if ("".equals(cell.getStringCellValue())) {
					obj.add("Missing");

				} else if (cellobj.equals(null)) {
					obj.add("");

				} else {
					obj.add(cell.getStringCellValue());
				}

			}

			data.put(rowCnt, obj);
			rowCnt++;

		}
		return data;
	}

}

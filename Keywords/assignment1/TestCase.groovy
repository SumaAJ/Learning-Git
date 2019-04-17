package assignment1

import org.apache.poi.ss.usermodel.Sheet
import org.apache.poi.ss.usermodel.Workbook
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.kms.katalon.core.annotation.Keyword


//import org.testng.annotations.BeforeClass;

public class TestCase {

	String[][] tabArray = null;
	Workbook workbk;
	Sheet sheet;
	int rowCount, colCount;
	String sheetPath = "D:\\Users\\703219448\\Katalon Studio\\ATHOME\\Data Files\\Data.xlsx";

	int eRow, eCol, sRow = 0, sCol = 0;



	@DataProvider
	public Object[][] getLoginData() throws Exception {
		Object[][] retObjArr = getExcelData(sheetPath, "Data");
		System.out.println("getData function executed!!");
		return retObjArr;
	}

	//  Excel API to read test data from excel workbook
	public String[][] getExcelData(String xlPath, String shtName)
	throws Exception {
		Workbook workbk = Workbook.getWorkbook(new File(xlPath));
		Sheet sht = workbk.getSheet(shtName);
		rowCount = sht.getRows();
		colCount = sht.getColumns();
		tabArray = new String[rowCount][colCount - 2];
		System.out.println("erow: " + rowCount);
		System.out.println("ecol: " + colCount);
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < 3; j++) {
				tabArray[i][j] = sht.getCell(j, i).getContents();
			}
		}
		return (tabArray);
	}


	@Test(dataProvider = "getLoginData")
	public void LoginData(String un, String psw)
	throws InterruptedException, IOException {

		System.out.println("un: " + un);
		System.out.println("psw: " + psw);

	}

}

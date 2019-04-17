package assignment1


import org.apache.poi.ss.usermodel.Sheet
import org.apache.poi.ss.usermodel.Workbook
import org.testng.annotations.DataProvider
import org.testng.annotations.Test



import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriventoReadExcel {

	public XSSFWorkbook wb;
	public XSSFSheet sheet1;

	public DataDriventoReadExcel(String excelpath) {
		try {
			FileInputStream file=new FileInputStream(new File(excelpath));
			wb=new XSSFWorkbook(file);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String getData(int sheetNumber,int row,int column) {
		sheet1=wb.getSheetAt(sheetNumber);
		String data = sheet1.getRow(row).getCell(column).getStringCellValue();
		return data;
	}

	public int getRowCount(int sheetIndex) {
		int row = wb.getSheetAt(sheetIndex).getLastRowNum();
		System.out.println("Row Count"+row);
		row=row+1;
		return row;
	}
}

@DataProvider(name="ExcelData")
public Object[][] passData() {
	DataDriventoReadExcel config=new DataDriventoReadExcel("D:\\Users\\703219448\\Documents\\TestData.xlsx");
	int rows = config.getRowCount(0);
	Object[][] unpsdata=new Object[rows][2];

	for(int i=1;i<rows;i++) {
		unpsdata[i][0]=config.getData(0, i, 0);
		unpsdata[i][1]=config.getData(0, i, 1);
	}
	return unpsdata;
}

@Test(dataProvider="ExcelData")
public void loginExecutions(String uname, String Password) throws InterruptedException, IOException {
	System.out.println(uname)
	System.out.println(Password)
}


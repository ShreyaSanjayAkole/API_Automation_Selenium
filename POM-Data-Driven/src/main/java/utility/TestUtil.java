package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestUtil {
	
	public static String TestDataPath = "E:\\QA Automation\\Testing\\POM-Data-Driven\\src\\main\\java\\testdata\\testdata.xlsx";
	
	static Workbook book;
	static org.apache.poi.ss.usermodel.Sheet sheet;
	
	public Object[][] getTestData(String SheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TestDataPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book= WorkbookFactory.create(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		sheet = book.getSheet (SheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
			}
		}
		return data;
	}

}

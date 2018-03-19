package Practice.com.practice.tests.TestNGPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	 String fileName="userData.xlsx";
	 String sheetName="Credentials";
	
	
	@DataProvider(name="userData")
	public Object[][] userDataProvider() throws IOException {
		Object[][] userData = getUserData();
		return userData;
		
	}
	

	
	public Object[][] getUserData() throws IOException{
		//Get file from resources folder
		ClassLoader classLoader = getClass().getClassLoader();
		String path=classLoader.getResource(fileName).getPath();
		FileInputStream excelFile = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		XSSFCell cell;
		int totalRows = sheet.getPhysicalNumberOfRows();
		int totalCols = sheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[totalRows-1][totalCols];
		for(int i=1; i<totalRows; i++) {
			for(int j=0; j<totalCols; j++) {
				cell = sheet.getRow(i).getCell(j);
				if(cell.getCellTypeEnum() == CellType.NUMERIC) {
					data[i-1][j] = String.valueOf((long)cell.getNumericCellValue());
				}
				else if(cell.getCellTypeEnum() == CellType.STRING) {
					data[i-1][j] = cell.getStringCellValue();
				}
			}
		}
		return data;
	}
	
}

package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelReader {
	static FileInputStream fis = null;

	public FileInputStream getFileInputStream() {
		java.lang.String filePath = System.getProperty("user.dir") + "\\src\\test\\java\\data\\userData.csv";
		File srcfile = new File(filePath);
		try {
			fis = new FileInputStream(srcfile);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}	
		return fis;
	}

	@DataProvider(name= "testData")
	public Object[][] getExcelData() throws IOException{

		fis = getFileInputStream();
		XSSFWorkbook wb = new XSSFWorkbook(fis); //This line is for dealing with WorkBook;
		XSSFSheet sheet = wb.getSheetAt(0);
		int TotalNumberofRow = (sheet.getLastRowNum() + 1);
		int TotalNumberOfColumn = 4;
		java.lang.String[][] arrayExcelData = new java.lang.String[TotalNumberofRow][TotalNumberOfColumn];
		for (int i = 0; i < TotalNumberofRow; i++) {
			for (int j = 0; j < TotalNumberOfColumn ; j++) {
				
				XSSFRow row = sheet.getRow(i);
				arrayExcelData[i][j] = row.getCell(j).toString();
				
			}
			
		}
		wb.close();
		
		return arrayExcelData;

	}
}


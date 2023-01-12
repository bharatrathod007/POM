package TestNGPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDatafromExcel {

	public static void main(String[] args) throws IOException {
	
		FileInputStream fis = new FileInputStream("C:\\Users\\Rohit\\Desktop\\Employee.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	
	XSSFSheet sheet = workbook.getSheetAt(0);
	System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
	System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
	
	}

}

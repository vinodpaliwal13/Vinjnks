package org.ExcelMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelMethod {
	
	
	
	
	public String readData(String sheetName, int rowName, int cellValue) throws EncryptedDocumentException, IOException 
	 {
		
		 File src=new File("D:\\TestData.xlsx");
		
			FileInputStream fis= new FileInputStream(src);
			
			
		
		 
		
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet(sheetName);
	Row r=sh.getRow(rowName);
	Cell c=r.getCell(cellValue);
	
	String val=c.getStringCellValue();
	
	
	
	
	return val;
	
	
	 
	 }

}

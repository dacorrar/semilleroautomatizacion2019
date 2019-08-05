package PruebaWish;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WriteExcelFile {
	// escribir una lista de datos en excel
	public void WriteExcelFile(String filepath,String sheetName,String[] dataToWrite) throws IOException {

		File file = new File(filepath);
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook newWorbook =new XSSFWorkbook(inputStream);
		XSSFSheet newSheet = newWorbook.getSheet(sheetName);
		int rowCount = newSheet.getLastRowNum()-newSheet.getFirstRowNum();
		
		 XSSFRow row = newSheet.getRow(0);
                 // para creear al final de la fila
		 XSSFRow newRow = newSheet.getRow(rowCount+1);
		
		 for (int i = 0; i < row.getLastCellNum(); i++) {
			 XSSFCell newCell = newRow.createCell(i);
			 newCell.setCellValue(dataToWrite[i]);
		 }
		 
		 inputStream.close();
		 FileOutputStream outputSream = new FileOutputStream(file);
		 newWorbook.write(outputSream);
		 outputSream.close();
	}
	
	
	public void writeCellValue(String filepath,String sheetName,int rowNumber,int cellNumber,String resultText) throws IOException {
		
		File file = new File(filepath);
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook newWorbook =new XSSFWorkbook(inputStream);
		XSSFSheet newSheet = newWorbook.getSheet(sheetName);
		XSSFRow row = newSheet.getRow(rowNumber);
		
		//celda 2 la de resultado
		 XSSFCell firstCell = row.getCell(cellNumber-1);
		 System.out.print("first cell value is:"+ firstCell.getStringCellValue());
		 
		 XSSFCell nextCell= row.createCell(cellNumber);
		 nextCell.setCellValue(resultText);
		 System.out.print("next cell value is:"+ nextCell.getStringCellValue());
		 
		 inputStream.close();
		 FileOutputStream outputSream = new FileOutputStream(file);
		 newWorbook.write(outputSream);
		 outputSream.close();
	}
}

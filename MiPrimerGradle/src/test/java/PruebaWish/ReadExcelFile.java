package PruebaWish;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	
	public ReadExcelFile() {
		
	}
	// filepath es la ruta donde se encunetra el archovo exel 
        // sheetname nombre de la hoja excel
	public void readExcel(String filepath,String sheetName) throws IOException {
		
		File file = new File(filepath);
                // donde estan lso datos
		FileInputStream inputStream = new FileInputStream(file);
                // crear el fichero donde se va a guardar
		XSSFWorkbook newWorbook =new XSSFWorkbook(inputStream);
                // es el objeto donde se guarda la hoja 
		XSSFSheet newSheet = newWorbook.getSheet(sheetName);
                //guardamos el numero de filas de datos que tenga excel
		int rowCount = newSheet.getLastRowNum()-newSheet.getFirstRowNum();
		// 
		 for (int i = 0; i < rowCount; i++) {
                         // objeto que recorre fila x fila
			 XSSFRow row = newSheet.getRow(i);
			 // recorrer las celdas 
			  for (int j = 0; j < row.getLastCellNum(); j++) {
				  //Print Excel data in console
				  System.out.print(row.getCell(j).getStringCellValue()+"|| ");
			  }

		 }
	}
	// para leer una celda en especifico 
	public String getCellValue(String sheetName,String filepath,int rowNumber, int cellNumber) throws IOException {
		File file = new File(filepath);
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook newWorbook =new XSSFWorkbook(inputStream);
		XSSFSheet newSheet = newWorbook.getSheet(sheetName);
		
                // leer celda en numero que se encunetra la posicion
		System.out.println(newWorbook);
		XSSFRow row = newSheet.getRow(rowNumber);
                
		XSSFCell cell = row.getCell(cellNumber);
		// se devuelve la informacion de la celda 
		return cell.getStringCellValue();
	}
}
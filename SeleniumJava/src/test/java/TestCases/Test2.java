package TestCases;
import java.io.*;


import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test2  {
	
	
	public static void main(String args[]) throws IOException {
		FileInputStream file = new FileInputStream("D://Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheet("Sheet1");
		
		Iterator<Row> rowIterator = sheet.iterator();
		while (rowIterator.hasNext()) {
		    Row row = rowIterator.next();
		    Iterator<Cell> cellIterator = row.iterator();
		    while (cellIterator.hasNext()) {
		        Cell cell = cellIterator.next();
		        DataFormatter dataFormatter = new DataFormatter();
		        String cellValue = dataFormatter.formatCellValue(cell);
		        System.out.println(cellValue);
		        
		    }
		}
		
		
		Row r1= sheet.getRow(0);
		Cell c1 = r1.getCell(0);
		DataFormatter dt = new DataFormatter();
		String val1 = dt.formatCellValue(c1);
		System.out.println(val1);


		
		
	}

}

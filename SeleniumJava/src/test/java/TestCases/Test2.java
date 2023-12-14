package TestCases;
import java.io.*;


import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import Utils.BrowserSettings;

public class Test2  {
	WebDriver driver;
	@Test
	public void  test1() {
		System.out.println("test1");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.close();
	}
	@Test
	public void  test12() {
		System.out.println("test1");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Assertion asr = new Assertion();
		asr.assertTrue(true);
		driver.close();
	}
	
	@Test 
	public void test3() throws IOException {
		BrowserSettings obj = new BrowserSettings();
		driver = obj.initializeDriver();
		driver.get("https://www.google.com");
	}
	
//	public static void main(String args[]) throws IOException {
//		FileInputStream file = new FileInputStream("D://Book1.xlsx");
//		XSSFWorkbook workbook = new XSSFWorkbook(file);
//		Sheet sheet = workbook.getSheet("Sheet1");
//		
//		Iterator<Row> rowIterator = sheet.iterator();
//		while (rowIterator.hasNext()) {
//		    Row row = rowIterator.next();
//		    Iterator<Cell> cellIterator = row.iterator();
//		    while (cellIterator.hasNext()) {
//		        Cell cell = cellIterator.next();
//		        DataFormatter dataFormatter = new DataFormatter();
//		        String cellValue = dataFormatter.formatCellValue(cell);
//		        System.out.println(cellValue);
//		        
//		    }
//		}
//		
//		
//		Row r1= sheet.getRow(0);
//		Cell c1 = r1.getCell(0);
//		DataFormatter dt = new DataFormatter();
//		String val1 = dt.formatCellValue(c1);
//		System.out.println(val1);
//
//
//		
//		
//	}

}

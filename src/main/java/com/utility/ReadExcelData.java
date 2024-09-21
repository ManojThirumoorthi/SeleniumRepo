package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
	public static String getParticularCell(int rows, int column) throws InvalidFormatException, IOException {
		File file=new File("D:\\Java and Selenium\\IPT\\Data driven\\Excel Data.xlsx");
		Workbook book=new XSSFWorkbook(file);
		
		Sheet sheet= book.getSheet("TestData");
		
		Row row= sheet.getRow(rows);
		
		Cell cell= row.getCell(column);
		
//		String data=cell.getStringCellValue();
//		System.out.println(data);
		
//		double data1= cell.getNumericCellValue();
//		System.out.println(data1);
		
		DataFormatter dataFormat= new DataFormatter();
		String testData= dataFormat.formatCellValue(cell);
		System.out.println(testData);
		
		return testData;
	}
	
	public static String getParticularRowMultipleCell() throws InvalidFormatException, IOException {
		File file=new File("D:\\Java and Selenium\\IPT\\Data driven\\Excel Data.xlsx");
		Workbook book=new XSSFWorkbook(file);
		
		Sheet sheet= book.getSheet("TestData");
		
		int noOfRows= sheet.getLastRowNum();
		System.out.println("No of Rows: "+noOfRows);
		
		Short noOfCells= sheet.getRow(0).getLastCellNum();
		System.out.println("No of Cells: "+noOfCells);
		
		Row row= sheet.getRow(1);
		
		String testData = null;
		for (int i = 0; i < noOfCells; i++) {
			Cell cell = row.getCell(i);
			DataFormatter dataFormat = new DataFormatter();
			testData = dataFormat.formatCellValue(cell);
			System.out.println(testData);
		}
		return testData;
	}
	
	public static void getAllData() throws InvalidFormatException, IOException {
		File file=new File("D:\\Java and Selenium\\IPT\\Data driven\\Excel Data.xlsx");
		Workbook book=new XSSFWorkbook(file);
		
		Sheet sheet= book.getSheet("TestData");
		
		int noOfRows= sheet.getLastRowNum();
		System.out.println("No of Rows: "+noOfRows);
		
		Short noOfCells= sheet.getRow(0).getLastCellNum();
		System.out.println("No of Cells: "+noOfCells);
		
		for (int i = 0; i <= noOfRows; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < noOfCells; j++) {
				Cell cell = row.getCell(j);
				DataFormatter dataFormat = new DataFormatter();
				String testData = dataFormat.formatCellValue(cell);
				System.out.println(testData);
			} 
		}
	}
	
	public static void main(String[] args) throws InvalidFormatException, IOException {
		getParticularRowMultipleCell();
		getAllData();
	}
		
}

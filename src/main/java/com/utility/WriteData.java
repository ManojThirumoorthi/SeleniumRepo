package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {
	
	public static void main(String[] args) throws IOException {
		File file=new File("D:\\Java and Selenium\\IPT\\Data driven\\Excel Data.xlsx");
		FileInputStream fileInput=new FileInputStream(file);
		Workbook book=new XSSFWorkbook(fileInput);
		
//		book.createSheet("created sheet").createRow(0).createCell(0).setCellValue("Name");
//		book.getSheet("created sheet").createRow(0).createCell(1).setCellValue("Attendance");
//		book.getSheet("created sheet").createRow(1).createCell(0).setCellValue("Manoj");
		book.getSheet("created sheet").createRow(1).createCell(1).setCellValue("Present");
		
		FileOutputStream fileOutput=new FileOutputStream(file);
		book.write(fileOutput);
		book.close();
		System.out.println("Success");
	}
}

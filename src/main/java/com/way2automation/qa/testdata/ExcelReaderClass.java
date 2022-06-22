package com.way2automation.qa.testdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReaderClass {
	
	
	@Test
		public static void ExcelReaderMethod() throws IOException  {
		                      
		
		 File file =    new File("C:\\\\Users\\\\Lenovo\\\\eclipse-worksp\\\\Way2AutomationTest\\\\src\\\\main\\\\java\\\\com\\\\way2automation\\\\qa\\\\util\\\\DataInput.xlsx");
		 FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		XSSFSheet sheet1= workbook.getSheet("Data1");
	
		
		 String FName= sheet1.getRow(1).getCell(1).getStringCellValue();
		 String LName= sheet1.getRow(2).getCell(1).getStringCellValue();
		 String Email= sheet1.getRow(3).getCell(1).getStringCellValue();
		 double Mobile= sheet1.getRow(4).getCell(1).getNumericCellValue();
		 String Subjects= sheet1.getRow(5).getCell(1).getStringCellValue();
		 String CurrentAddress= sheet1.getRow(6).getCell(1).getStringCellValue();
		 
		 
		 
		 System.out.println(FName);
		 System.out.println(LName);
		 System.out.println(Email);
		 System.out.println(Mobile);
		 System.out.println(Subjects);
		 System.out.println(CurrentAddress);
		
		}
		}



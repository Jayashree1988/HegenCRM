package com.actitime.genericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String getExcelData(String excelPath, String sheet, int r, int c) throws Throwable
	{
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		String cellValue = wb.getSheet(sheet).getRow(r).getCell(c).toString();
		return cellValue;
	}
	
	
	
	public int getRowCount(String excelPath, String sheet) throws Throwable
	{
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		int rowCount = wb.getSheet(sheet).getLastRowNum();
		return rowCount;
	}
	
	
	
	public void setCellData(String excelPath, String sheet, int r, int c, String data) throws Throwable
	{
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(r).createCell(c).setCellValue(data);
		
		FileOutputStream fos=new FileOutputStream(excelPath);
		wb.write(fos);
		wb.close();
	}
	
	
	public String getPropKeyValue(String propPath, String key) throws Throwable
	{
		FileInputStream fis =new FileInputStream(propPath);
		Properties prop=new Properties();
		prop.load(fis);
		return prop.getProperty(key, " Key is Incorrect");
	}
	
	
	

}

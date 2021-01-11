package com.generics.actitime;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excellibrary implements Autoconstant
{
	public static String Getcellvalue(String path,String sheet,int row,int cell) throws IOException
	{
		FileInputStream fis =new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		//Sheet sh=wb.getSheet(sheet);
		String cellvalue=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellvalue;
		
		
	}

}

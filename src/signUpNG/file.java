package signUpNG;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class file {

	static	File excelFile ;
	static	FileInputStream fil;
	static	XSSFWorkbook workbook;
	static	XSSFSheet sheet;

	public static void initFile(String addr)
	{
		excelFile = new File(addr);   
		try {
			fil = new FileInputStream(excelFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getStackTrace());
			System.out.println(e.getMessage());
		}
		try {
			workbook = new XSSFWorkbook(fil);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getStackTrace());
			System.out.println(e.getMessage());
		}
	}



	public static Object[][] getData(String addr) 
	{
		
		initFile(addr);
				
		
		sheet  = workbook.getSheetAt(0);
		XSSFRow row;
		XSSFCell cell;
		row = sheet.getRow(0);
		int rowSize = sheet.getLastRowNum();
		int colSize = row.getLastCellNum();

		//ArrayList<String> arr= new ArrayList<String>();
		Object[][] arr = new Object[rowSize][colSize];
		
		for( int i =1; i< rowSize; i++)
		{
			row = sheet.getRow(i);

			for(int j= row.getFirstCellNum(); j<colSize; j++)
			{
				cell = row.getCell(j);
				arr[i][j] = cell.getStringCellValue();
				//System.out.print(cell.getStringCellValue()+ " ");
				//arr.add(cell.getStringCellValue());
			}
			//System.out.println("\r\n");


		}
		return arr;
	}


	/*
	public static void setData(ArrayList<String> arr) throws IOException
	{
		excelFile = new File("testData//TestData.xlsx");
		fil = new FileInputStream(excelFile);
		workbook = new XSSFWorkbook(fil);
		sheet  = workbook.getSheetAt(0);

		for( int i = sheet.getFirstRowNum(); i< sheet.getLastRowNum(); i++)
		{
			XSSFRow row = sheet.getRow(i);
			XSSFCell cell = row.getCell(1);

			cell.setCellValue(arr.get(i));
			//	System.out.println(cell.getStringCellValue());
		}
	}
	 */
}

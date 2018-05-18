package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import entities.TestDataDO;

public class ExcelProcessor {
	
	public static List<TestDataDO> testDataList = new ArrayList<TestDataDO>();
	
	public static Workbook createWorkbook(FileInputStream fis) throws IOException {
		
		return new XSSFWorkbook(fis); 
		
	}
	
	public static void processSheet(Workbook wb) {
		
		//for each row in excel make a new TestDataDO and append to the testDataList
		
		testDataList.add(new TestDataDO("", "", ""));
		
		
		
	}
	

}

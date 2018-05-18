package Utilities;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ApachePOIExcel {
	

	public static XSSFWorkbook workbook;
   
   
    public static void main(String[] args) throws Throwable {
        
       
            workbook = new XSSFWorkbook(new FileInputStream(System.getProperty("user.dir")+"//testdata.xlsx"));
  
       
   
        XSSFSheet sheet = workbook.getSheet("TestData");
        for(int i=0;i<sheet.getPhysicalNumberOfRows();i++)
        {
            XSSFRow currentRow = sheet.getRow(i);
            for(int j=0;j<currentRow.getPhysicalNumberOfCells();j++)
            {
                XSSFCell currentCell = currentRow.getCell(j);
                switch (currentCell.getCellType())
                {
                    case Cell.CELL_TYPE_STRING:
                        System.out.print(currentCell.getStringCellValue() + "\t");
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        System.out.print(currentCell.getNumericCellValue() + "\t");
                        break;
                }
            }
            System.out.println("\n");
        }
    
    
            List<HashMap<String, String>> mydata = new ArrayList<HashMap<String, String>>();
             sheet = workbook.getSheet("TestData");
            XSSFRow HeaderRow = sheet.getRow(0);
            for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
                XSSFRow currentRow = sheet.getRow(i);
                HashMap<String, String> currentHash = new HashMap<String, String>();
                for (int j = 0; j < currentRow.getPhysicalNumberOfCells(); j++) {
                    Cell currentCell = currentRow.getCell(j);
                    switch (currentCell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            currentHash.put(HeaderRow.getCell(j).getStringCellValue(), currentCell.getStringCellValue());
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            currentHash.put(HeaderRow.getCell(j).getStringCellValue(), String.valueOf(currentCell.getNumericCellValue()));
                            break;
                    }
                }
                mydata.add(currentHash);
            }
            for (HashMap<String, String> h : mydata) {
                for (String key : h.keySet()) {
                    System.out.println(key + "\t" + h.get(key));
                }
                System.out.println("\n");
            }
        }
   

}
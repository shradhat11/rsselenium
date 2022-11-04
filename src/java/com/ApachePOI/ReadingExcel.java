package com.ApachePOI;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingExcel {

    public static void main(String[] args) throws IOException {

        String excelFilePath="C:\\tools\\selenium\\Countries.xlsx";
        File f = new File(excelFilePath);
        FileInputStream inputStream= new FileInputStream(f);

        XSSFWorkbook workbook= new XSSFWorkbook(inputStream);
        XSSFSheet sheet=workbook.getSheet("Sheet1");

        //Using ForLoop
        int rows=sheet.getLastRowNum();
        int col=sheet.getRow(1).getLastCellNum();

        for(int r=0; r<rows;r++)
        {
            XSSFRow row=sheet.getRow(r);
            for(int c=0;c<col;c++)
            {
                XSSFCell cell=row.getCell(c);
                switch(cell.getCellType())
                {
                    case STRING:System.out.print(cell.getStringCellValue());
                    break;

                    case NUMERIC:System.out.print(cell.getNumericCellValue());
                    break;

                    case BOOLEAN:System.out.print(cell.getBooleanCellValue());
                    break;
                }
                System.out.println("  ");
            }
            System.out.println();
        }
    }
}

package Day11_ApachePOI_WriteExcel;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C01_WriteExcelExample {

    /*
Store the path of the file as string and open the file.
   Open the workbook.
Open the first worksheet.
Go to the first row.
Create a cell on the 3rd column (2nd index) on the first row.
Write “POPULATION” on that cell.
Create a cell on the 2nd row 3rd cell(index2), and write data.
Create a cell on the 3rd row 3rd cell(index2), and write data.
Create a cell on the 4th row 3rd cell(index2), and write data.
Write and save the workbook.
Close the file.
Close the workbook.
     */

    @Test
    public void WriteExcel() throws IOException {

        String path ="src\\test\\java\\resources\\excelfile.xlsx";

        FileInputStream fis = new FileInputStream(path);

        Workbook workbook = WorkbookFactory.create(fis);

        Sheet sheet2 = workbook.getSheetAt(1);

        Row row1 = sheet2.getRow(0);

        Cell row1cell3 = row1.createCell(2);

        row1cell3.setCellValue("POPULATION");

        sheet2.getRow(1).createCell(2).setCellValue("Rusya'nın populasyonu");
        sheet2.getRow(2).createCell(2).setCellValue("Çin'nın populasyonu");
        sheet2.getRow(3).createCell(2).setCellValue("ABD'nın populasyonu");

        FileOutputStream fos = new FileOutputStream(path);
        workbook.write(fos);

        fis.close();
        fos.close();

        workbook.close();


    }
}

package Day11_ApachePOI_WriteExcel;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.*;

public class C02_WriteExcelExample02 {

    @Test
    public void changeExcelData() throws IOException {

    String filePath = "src\\test\\java\\resources\\excelData.xlsx";
        File file = new File(filePath);
        FileInputStream fis = new FileInputStream(file);

        Workbook wb = WorkbookFactory.create(fis);

        Sheet informationData = wb.getSheet("informationData");
        int totalRowsUsed = informationData.getLastRowNum() - informationData.getFirstRowNum();
        System.out.println(totalRowsUsed);

        Row row5 = informationData.createRow(5);

        row5.createCell(0).setCellValue("elma");
        row5.createCell(1).setCellValue("armut");
        row5.createCell(2).setCellValue("portakal");
        row5.createCell(3).setCellValue("erik");
        row5.createCell(4).setCellValue("çilek");
        row5.createCell(5).setCellValue("vişne");

        FileOutputStream fos = new FileOutputStream(file);
        wb.write(fos);

        fis.close();
        fos.close();
        wb.close();
    }
}

package helper;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

public class Excelhelper {
    public static Object[][] data(String sheetName) {
        File src = new File("DataTest.xlsx");
        XSSFWorkbook workbook = null;
        try {
            InputStream fis = new FileInputStream(src);
            workbook = new XSSFWorkbook(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        XSSFSheet sheet = workbook.getSheet(sheetName);
        Iterator<Row> rows = sheet.rowIterator();

        Row firstRow = rows.next();
        int lastCellIndex = firstRow.getLastCellNum() - 1;
        Object[][] data = new Object[sheet.getLastRowNum()][lastCellIndex];

        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            Row r = rows.next();
            Iterator<Cell> cellIterator = r.cellIterator();
            cellIterator.next();
            for (int j = 0; j < lastCellIndex; j++) {
                int count = j + 1;
                Cell cell = cellIterator.next();
                if (cell.getCellType() == CellType.STRING || cell.getCellType() == CellType.BLANK) {
                    data[i][j] = r.getCell(count).getStringCellValue();
                } else if (cell.getCellType()== CellType.NUMERIC) {
                    data[i][j] = r.getCell(count).getNumericCellValue();
                }
            }
        }
        return data;
    }

}

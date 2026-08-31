package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;

public class ExcelUtil {

    private Workbook workbook;
    private Sheet sheet;

    public ExcelUtil(
            String filePath,
            String sheetName)
            throws IOException {

        FileInputStream input =
                new FileInputStream(filePath);

        workbook =
                WorkbookFactory.create(input);

        sheet =
                workbook.getSheet(sheetName);

        input.close();
    }

    public String getCellData(
            int row,
            int column) {

        Cell cell =
                sheet.getRow(row)
                        .getCell(column);

        return cell.toString();
    }

    public int getRowCount() {

        return sheet.getPhysicalNumberOfRows();
    }

    public void closeWorkbook()
            throws IOException {

        workbook.close();
    }
}
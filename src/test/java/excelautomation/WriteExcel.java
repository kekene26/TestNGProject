package excelautomation;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {

    @Test
    public void test() throws IOException {

        String dosyaYolu = ".\\src\\test\\resources\\ULKELER.xlsx";
        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fileInputStream);

        //yexcele yazdirma yapmak icin olusturmaliyiz
        FileOutputStream fileOutputStream = new FileOutputStream(dosyaYolu);

        //0.indexeki satirin 3. indexteki hucresine nufus hucresi ekleyin
        workbook.getSheetAt(0).getRow(0).createCell(3).setCellValue("NUFUS");
        workbook.write(fileOutputStream);

        //hucre silme islemi cin oncelikle bir degisken olusrup daha sonra silme islemi yapmaliyiz
       // Cell silmekIstedigimizHucre = workbook.getSheetAt(0).getRow(0).getCell(1);
        //workbook.getSheetAt(0).getRow(0).removeCell();

        //satirsilme islemi
        Row silmekIstedigimizSatir = workbook.getSheetAt(0).getRow(1);
        workbook.getSheetAt(0).removeRow(silmekIstedigimizSatir);




        fileInputStream.close();
        workbook.close();
        fileOutputStream.close();

    }
}

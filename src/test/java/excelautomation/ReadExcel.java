package excelautomation;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {

    @Test
    public void test() throws IOException {

        String dosyaYolu = ".\\src\\test\\resources\\ULKELER.xlsx";
        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);

        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet        = workbook.getSheetAt(0); //0 inci indexteki yani sayfa 1 e gider

        //1. satira gidelim
        Row row =          sheet.getRow(0);//0. indexe yani 1. satira gider

        //1. hucreyi alalim
        Cell ulkeler         = row.getCell(0);// index degero 0 yazarsak 1. hucreye gideriz
        Cell baskentler      = row.getCell(1);
        Cell meshurlar       = row.getCell(2);

        System.out.println(ulkeler);
        System.out.println(baskentler);
        System.out.println(meshurlar);

        System.out.println(workbook.getSheetAt(0).getRow(3).getCell(1));
        System.out.println(workbook.getSheetAt(0).getRow(10).getCell(0));
        System.out.println(workbook.getSheetAt(0).getRow(7).getCell(2));

        //son satirin numarasini almak icin (indexini' index 0 dan baslar

        int satirSayisi = workbook.getSheetAt(0).getLastRowNum() +1;
        System.out.println("satir sayisi :" + satirSayisi);

        int sonSatirinIndexi = workbook.getSheetAt(0).getLastRowNum();
        //tum ulkeleri yazdirdik
        for ( int i = 0 ; i<sonSatirinIndexi; i++){
            System.out.println(workbook.getSheetAt(0).getRow(i).getCell(0));
        }
        //tum baskentleri yazdiralim
        for ( int j = 0 ; j<sonSatirinIndexi; j++){
            System.out.println(workbook.getSheetAt(0).getRow(j).getCell(1));
        }
        //ir satirin son sutununn indexini alma
        int sonSutunIndex = workbook.getSheetAt(0).getRow(0).getLastCellNum();
        System.out.println("son sutun sayisi: " + sonSutunIndex );

        for ( int k = 0 ; k<sonSutunIndex; k++){
            System.out.println(workbook.getSheetAt(0).getRow(3).getCell(k));
        }

        fileInputStream.close();
        workbook.close();




    }
}

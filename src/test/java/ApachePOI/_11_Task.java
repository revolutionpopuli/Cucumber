package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;

public class _11_Task {
    /**
     * Soru 2:
     * yeni excel
     * Çarpım tablosunu excele yazdırınız.
     * 1 x 1 = 1 şeklinde işaretleri de yazdırınız.
     * sıfırdan excel oluşturarak.
     * her bir onluktan sonra 1 kolon boşluk bırakarak yan yana
     */


    public static void main(String[] args) {

        String path = "src/test/java/ApachePOI/resource/CarpimTablosuYanYana.xlsx";

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sayfa1");

        Row yeniSatir = null;
        Cell yeniHucre;
        int enSonHucreSayisi=0;
        int enSonSatirSayisi;

        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {

                enSonSatirSayisi = sheet.getPhysicalNumberOfRows();
                yeniSatir = sheet.createRow(enSonSatirSayisi);
                enSonHucreSayisi=yeniSatir.getPhysicalNumberOfCells();
                yeniHucre = yeniSatir.createCell(i);
                yeniHucre.setCellValue(i + "x" + j + "=" + (i * j));
            }


        }

        try {
            FileOutputStream outputStream = new FileOutputStream(path);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
        } catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }
        System.out.println("işlem tamamlandı");


    }


}

package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;

public class _10_Task {
    /**  Soru 1:
     *  yeni excel
     *  Çarpım tablosunu excele yazdırınız.
     *  1 x 1 = 1 şeklinde işaretleri de yazdırınız.
     *  sıfırdan excel oluşturarak.
     *  her bir onluktan sonra 1 satır boşluk bırakarak alt alata
     */

    /**
     * Soru 2:
     * yeni excel
     * Çarpım tablosunu excele yazdırınız.
     * 1 x 1 = 1 şeklinde işaretleri de yazdırınız.
     * sıfırdan excel oluşturarak.
     * her bir onluktan sonra 1 kolon boşluk bırakarak yan yana
     */


    public static void main(String[] args) {

        String path = "src/test/java/ApachePOI/resource/CarpimTablosuAltAlta.xlsx";

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sayfa1");

        Row yeniSatir;
        Cell yeniHucre;
        int enSonSatirSayisi=0;
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {

                enSonSatirSayisi = sheet.getPhysicalNumberOfRows();
                yeniSatir = sheet.createRow(enSonSatirSayisi);
                yeniHucre = yeniSatir.createCell(0);
                yeniHucre.setCellValue(i + "x" + j + "=" + (i * j));

            }
            yeniSatir = sheet.createRow(enSonSatirSayisi+1);

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

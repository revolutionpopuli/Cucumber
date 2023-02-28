package _JDBC.Gun2;

import _JDBC.JDBCParent;

public class _03_Printf extends JDBCParent {
    public static void main(String[] args) {
        //printf
        int a=1234;
        double pi=3.145656565;
        String isim="ali demir";
        char basHarf='i';

        System.out.printf("%5d", a);// a yı 5 hane içerisinde ondalık sistemde göster
        //virgülden önceki bölüm formatı
        //virgülden sonraki bölüm dataları temsil ediyor

        System.out.println("Merhaba");

        System.out.printf("%-5d", a);//sola dayalı yaz
        System.out.println("Merhaba");

        System.out.printf("%-5d %6.2f \n", a, pi);//pi yi 6 hane içinde kullan, noktadan (ondalıktan) sonra ise 2 sıra olsun
        //toplamda noktadan sonrası dahil 6 hane kullan
        System.out.printf("%-5d %6.2f %20s \n", a, pi, isim);

        System.out.printf("%6.1f", pi);
        System.out.println("Merhaba");

    }


}

package _JDBC.Gun1;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _4_Soru extends JDBCParent {
    // city tablosundaki tüm kayıtlardaki isimleri next ile yazdırınız
    // city tablosundaki tüm kayıtlardaki isimleri absolute ile yazdırınız
    // city tablosundaki tüm kayıtlardaki isimleri relative ile yazdırınız.

    @Test
    public void test1() throws SQLException {
        ResultSet rs=statement.executeQuery("select * from city");

        int count=0;
        while (rs.next()){//bir row bir sonraki row
            System.out.println(rs.getString("city"));
            count++;
        }
        System.out.println("count = " + count);
    }
    @Test
    public void test2() throws SQLException {
        ResultSet rs=statement.executeQuery("select * from city");

        int count=1;
        while (rs.absolute(count)){
            System.out.println(rs.getString("city"));
            count++;
        }
        System.out.println("count = " + (count-1));
    }
    @Test
    public void test3() throws SQLException {
        ResultSet rs=statement.executeQuery("select * from city");

        int count=1;
        while (rs.relative(1)){
            System.out.println(rs.getString("city"));
            count++;
        }
        System.out.println("count = " + (count-1));
    }


}

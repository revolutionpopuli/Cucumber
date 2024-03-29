package _JDBC.Gun1;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_AbsoluteRelative extends JDBCParent {
    // next(): bir sonraki row
    // previous()  : bir önceki row
    // absolute(4) : baştan itibaren 4.ROW a gider, direkt yerine, ROW a gider
    // relative(4) : bulunduğu noktadan 4 sonraki ROW a gider.
    @Test
    public void test1() throws SQLException {
        ResultSet rs=statement.executeQuery("select * from film");

        rs.absolute(10);//10. satıra git
        String title=rs.getString("title");
        System.out.println("title = " + title);

        rs.absolute(15);//baştan itibaren 15. satıra gider
        title=rs.getString("title");
        System.out.println("title = " + title);

        rs.absolute(-15);//(-) sondan 15. satıra git
        title=rs.getString("title");
        System.out.println("title = " + title);

        rs.absolute(10);//10. satıra git
        title=rs.getString("title");
        System.out.println("title = " + title);

        rs.relative(5);//10. satıra git
        title=rs.getString("title");
        System.out.println("title = " + title);

    }

}

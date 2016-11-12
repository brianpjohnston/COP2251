package Johnston20;


import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateCompare implements Comparator {

    public int compare(CreditCard cc1, CreditCard cc2) {

        DateFormat df = new SimpleDateFormat("MM/yy");
        Date Pdate = null;
        Date Qdate= null;
        try {
            Pdate = (Date) df.parse(cc1.getExpDate());
            Qdate = (Date) df.parse(cc2.getExpDate());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Pdate.compareTo(Qdate) > 0 ? 1 : 0;
    }

}

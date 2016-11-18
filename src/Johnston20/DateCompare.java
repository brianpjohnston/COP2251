package Johnston20;

import java.util.Date;
import java.util.Comparator;

/**
 * Created by Brian on 11/10/2016.
 * I worked alone
 */

public class DateCompare implements Comparator<CreditCard> {
	
	 public int compare(CreditCard cc1, CreditCard cc2) {

         Date Pdate = null;
         Date Qdate= null;
            try {
            Pdate = (Date) (cc1.getExpDate());
            Qdate = (Date) (cc2.getExpDate());
            } catch (Exception e) {
            e.printStackTrace();
            }    
              return Pdate.compareTo(Qdate) > 0 ? 1 : 0;
}

}

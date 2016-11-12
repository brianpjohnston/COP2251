package Johnston20;

import java.util.Comparator;

/**
 * Created by Brian on 11/12/2016.
 */
public class NameCompare implements Comparator<CreditCard> {

    public int compare(CreditCard cc1, CreditCard cc2) {
        if(cc1.getLastName().compareTo(cc2.getLastName()) == 0){
            return cc1.getFirstName().compareTo(cc2.getFirstName());
        }else{
            return cc1.getLastName().compareTo(cc2.getLastName());
        }
    }
}



package Johnston20;

/**
 * Created by tech140 on 11/12/2016.
 */
public class PANSort {
    final Comparator<CreditCard> PAN_ORDER = new Comparator<CreditCard>() {
        @Override
        public int compare(CreditCard cc1, CreditCard cc2) {
            return cc2.getPAN().compareTo(cc1.getPAN());
        }
    };
}
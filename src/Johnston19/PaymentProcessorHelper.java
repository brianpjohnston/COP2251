package Johnston19;

import java.util.List;
import java.util.Optional;

/**
 * Created by brian on 11/7/2016.
 */
public class PaymentProcessorHelper {

    public static <T extends Payment> double getTotal(List<T> payments) {
        return payments.stream().mapToDouble(Payment::getAmount).sum();
    }

    public static <T extends Payment> T getMax(List<T> payments) {
        return payments.stream().reduce((a, b) -> a.getAmount() > b.getAmount() ? a : b).orElse(null);
    }
}
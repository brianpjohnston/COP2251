package Johnston19;

import java.util.ArrayList;
import java.util.Optional;


/**
 * Created by brian on 11/5/2016.
 * I worked alone
 */

public class PaymentBatchProcessor<T extends Payment> {
    private ArrayList<T> list = new ArrayList<>();

    public static void main(String[] args) {
        PaymentBatchProcessor<Payment> pay = new PaymentBatchProcessor<>();
        pay.add(new Check(12.75));
        pay.add(new IOU(12.76));
        System.out.println(pay.getSize());
        System.out.println(pay.getMax().getAmount());
        System.out.println(pay.getTotal());
    }

    public void add(T t) {
        list.add(t);
    }

    public T getMax() {
        // this might also work
        Optional<T> optional = list.stream().reduce((a, b) -> a.getAmount() > b.getAmount() ? a : b);
        return optional.orElse(null);
    }

    public double getTotal() {
        return list.stream().mapToDouble(Payment::getAmount).sum();

    }

    public int getSize() {
        return list.size();
    }

}
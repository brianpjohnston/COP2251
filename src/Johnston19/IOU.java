package Johnston19;

import Johnston19.Payment;

/**
 * Created by Brian on 11/7/16.
 */
public class IOU implements Payment {
    double amount;

    public IOU(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public void setAmount(double amount) {
        this.amount = amount;
    }
}
package Johnston20;

import java.util.Date;

/**
 * Created by brian on 11/10/2016.
 */
public class CreditCard {
    String lastName;
    String firstName;
    String PAN;
    Date expDate;

    public CreditCard(String last, String first, String Pan, Date inputExpDate){
        lastName = last;
        firstName = first;
        PAN = Pan;
        expDate = inputExpDate;

    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPAN() {
        return PAN;
    }

    public Date getDate() {
        return expDate;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", PAN='" + PAN + '\'' +
                ", expDate=" + expDate +
                '}';
    }
}
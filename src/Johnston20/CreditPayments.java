package Johnston20;

import java.util.ArrayList;
import java.util.Collections;


/**
 * Created by Brian on 11/10/2016.
 */
public class CreditPayments {
    ArrayList<CreditCard> payments = new ArrayList<CreditCard>();

    public static void main(String[] args) {
    }


    public   void reset(){
        payments.clear();
    }



    public void add(CreditCard card){
        payments.add(card);
    }

    public ArrayList<CreditCard> printByPAN(){
        System.out.println("Credit Cards by PAN:");
        printTitle();

        //Collections.sort(payments);
        for (CreditCard c: payments) {
            System.out.println(c.toString());

        }

        return payments;
    }



    public ArrayList<CreditCard> printByName(){
        System.out.println("Credit Cards by Name:");
        printTitle();
        Collections.sort(payments);
        for (CreditCard c: payments) {

            System.out.println(c.toString());

        }

        return payments;
    }



    public ArrayList<CreditCard> printByDate(){
        System.out.println("Credit Cards by Date:");
        printTitle();
        // Collections.sort(payments);
        for (CreditCard c: payments) {
            System.out.println(c.toString());

        }

        return payments;
    }

    public void printTitle() {
        System.out.println("  Last Name    First Name           PAN    Exp Date");
        System.out.println(" ----------    ----------    ----------   ---------");
    }


}
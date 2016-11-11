package Johnston20;

import java.util.ArrayList;

/**
 * Created by brian on 11/10/2016.
 */
public class CreditPayments {
    static ArrayList<CreditCard> list = new ArrayList<>();
    public static void main(String[] args) {


    }

    public  void reset(){
        list.clear();

    }
    public void add(CreditCard card){
        list.add(card);
    }
    public ArrayList<CreditCard> printByPAN(){
        ArrayList<CreditCard> list = new ArrayList<>();

        return list;

    }
    public ArrayList<CreditCard> printByName(){
        ArrayList<CreditCard> list = new ArrayList<>();

        return list;

    }
    public ArrayList<CreditCard> printByDate(){
        ArrayList<CreditCard> list = new ArrayList<>();

        return list;

    }



}
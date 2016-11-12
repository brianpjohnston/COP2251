package Johnston20;

import java.util.ArrayList;

/**
 * Created by brian on 11/10/2016.
 */
public class CreditPayments {
    static ArrayList<CreditCard> list = new ArrayList<>();
    public static void main(String[] args) {


    }

    public static  void reset(){
        list.clear();

    }
    public static void add(CreditCard card){
        list.add(card);
    }

    public static void printByPAN(ArrayList<CreditCard> inList){
        System.out.println("Credit Cards by PAN:");
        printTitle();
        ArrayList<CreditCard> list = new ArrayList<>();



    }
    public static void printByName(ArrayList<CreditCard> inList){
        System.out.println("Credit Cards by Name:");
        printTitle();
        ArrayList<CreditCard> list = new ArrayList<>();



    }
    public static void printByDate(ArrayList<CreditCard> inList){
        System.out.println("Credit Cards by Date:");
        printTitle();
        ArrayList<CreditCard> list = new ArrayList<>();



    }

    public static void printTitle() {
        System.out.println("  Last Name    First Name           PAN    Exp Date");
        System.out.println(" ----------    ----------    ----------   ---------");
    }



}
package Johnston20;



import java.util.ArrayList;
import java.util.Collections;


/**
 * Created by Brian on 11/10/2016.
 * I worked alone
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
           
       Collections.sort(payments);
       printTitle("Pan");
        
        
        return payments;
    }
    
    
    
    public ArrayList<CreditCard> printByName(){
              
        Collections.sort(payments, new NameCompare());
        printTitle("Name");
        
        return payments;
    }
    
    
    
    public ArrayList<CreditCard> printByDate(){

        Collections.sort(payments, new DateCompare());
        printTitle("Date");

        return payments;
    }

    public void printTitle(String type) {
    	System.out.println("Credit Cards by " + type +":");    	
        System.out.println("  Last Name    First Name           PAN    Exp Date");
        System.out.println(" ----------    ----------    ----------   ---------");
        for (CreditCard c: payments) {
            System.out.println(c);
            
        }
    }


}
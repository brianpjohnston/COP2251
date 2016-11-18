package Johnston20;




import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by brian on 11/10/2016.
 * I worked alone
 */
public class CreditCard implements Comparable<CreditCard> {
    String lastName;
    String firstName;
    String PAN;
    Date expDate;



    CreditCard(String first, String last, String Pan, String inputExpDate){
        lastName = last;
        firstName = first;
        PAN = Pan;
        expDate = getDateFromString(inputExpDate);
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

    public Date  getExpDate() {
        return expDate;
    }

    @Override
    public String toString() {

        return String.format("|%10s|%13s|%13s|%10s|", lastName, firstName, PAN, getStringFromDate(expDate)   );
            }

    public String getStringFromDate(Date d){
        DateFormat outputFormat = new SimpleDateFormat("MM/yy");
        String dateToString = outputFormat.format(d);
        return dateToString;

    }

    public Date getDateFromString(String s){
        Date date= new Date();
        try{String yourDate = s;
            DateFormat dateFormat= new SimpleDateFormat("MM/yy");

            date = (Date)dateFormat.parse(yourDate);
            return date;

        }catch (ParseException e){
            System.out.println("Exception :" + e);
        }
        return date;
    }

    public int compareTo(CreditCard card) {
    	
    return this.getPAN().compareTo(card.getPAN());
    }
   



}
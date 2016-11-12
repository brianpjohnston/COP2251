package Johnston20;

/**
 * Created by tech140 on 11/11/2016.
 */
public class test {

    public static void main(String[] args) {

      CreditCard card = new  CreditCard("bob", "smith", "1234567890", "03/17");
        CreditPayments.add(card);
        CreditPayments.printByPAN(CreditPayments.list);

        System.out.println(card.toString());
        System.out.println(CreditPayments.list.size());
        CreditPayments.reset();
        System.out.println(CreditPayments.list.size());


    }
    }


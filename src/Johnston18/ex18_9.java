package Johnston18;

import java.util.Scanner;


/**
 * Created by tech140 on 10/20/2016.
 */
public class ex18_9 {


    public static void main(String[] args) {

        System.out.print("Enter a string: ");
        String value = new Scanner(System.in).nextLine();
        reverseDisplay(value);

    }

    private static void reverseDisplay(String value) {
        if (value.length() == 0)
            return;
        System.out.print(value.substring(value.length() - 1));
        reverseDisplay(value.substring(0, value.length() - 1));
    }
}
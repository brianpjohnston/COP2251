package Johnston18;

import java.util.Scanner;


/**
 * Created by tech140 on 10/20/2016.
 */
public class ex18_21 {

    public static void main(String[] args) {


        System.out.print("Enter a number: ");
        int number = new Scanner(System.in).nextInt();

        System.out.print(dec2Bin(number) + " is the binary number of " + number);
    }

    public static String dec2Bin(int value) {

        String s = ((value & 1) == 1) ? "1" : "0";
        if (value == 0 || value == 1)
            return s;
        else
            return dec2Bin(value >> 1) + s;
    }
}

package Johnston17;

import java.io.*;
import java.util.Arrays;


/**
 * Created by brian on 10/14/2016.
 */
public class readex17_05 {
    public static void main(String[] args) throws ClassNotFoundException, IOException {

        try (
                ObjectInputStream input = new ObjectInputStream(new FileInputStream("Exercise17_05.dat"));

        ) {
            int[] newNumbers;
            newNumbers = (int[]) (input.readObject());
            System.out.println(Arrays.toString(newNumbers));
            double doubleValue = input.readDouble();
            System.out.println(doubleValue);
            java.util.Date date = (java.util.Date) (input.readObject());
            System.out.println(date);
        }
    }


}

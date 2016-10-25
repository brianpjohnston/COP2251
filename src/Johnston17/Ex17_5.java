package Johnston17;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by brian on 10/14/2016.
 */
public class Ex17_5 {
    public static void main(String[] args) throws IOException {


        try (
                ObjectOutputStream output = new ObjectOutputStream(new
                        FileOutputStream("Exercise17_05.dat"));
        ) {

            output.writeObject(new int[]{1, 2, 3, 4, 5});
            output.writeDouble(5.5);
            output.writeObject(new java.util.Date());
        }
    }
}
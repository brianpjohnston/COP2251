package Johnston18;

import java.util.Scanner;

/**
 * Created by tech140 on 10/20/2016.
 */
public class recursive_substraction {
    public static void main(String[] args) {
        double count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two doubles, in descending order ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if (b!= 0){
            divide(a,b, count);

        }else  {
            System.out.println("You cannot davide by 0");
        }




    }

    private static void  divide(double a, double b, double count){

        if (a> b) {
            a = a - b;
            count++;
            divide(a, b, count);
        }else{
            double mod = a/b;
            double result = count+mod;
            System.out.println("The quotient is "+  result);        }


    }

}
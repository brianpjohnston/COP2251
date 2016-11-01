package Johnston18;


import java.util.Scanner;

/**
 * Created by brian on 10/31/2016.
 */
public class Finder {
    public static int sum = 0;
    public static int max;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string value");
        String input = scanner.next();
        scanner.close();

        System.out.println("The sum of all the integers in the string is " + sumIt(input));
        System.out.println("The largest of all the integers in the string is " + findMax(input, max));


    }

    public static int sumIt(String s) {
        if (s.matches("")) {

        } else {
            String a = String.valueOf(s.charAt(0));
            s = s.substring(1);
            String pattern = "[0-9]";
            if (a.matches(pattern)) {
                sum = sum + Integer.parseInt(a);
                sumIt(s);

            } else {
                sumIt(s);

            }


        }


        return sum;
    }


    public static int findMax(String s, int max) {
        String temp ="0";

        if (s.matches("")) {
            return max;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {

                for (int j = 0; j < s.length(); j++) {
                    char d = s.charAt(j);
                    if (Character.isLetter(d)  ) {

                        if (j>0){
                            temp = s.substring(0, j);
                            int tempNum = 0;
                            tempNum = Integer.parseInt(temp);
                            if (max <= tempNum) {
                                max = tempNum;
                        }

                        s = s.substring(j + 1);



                            findMax(s, max);
                        }
                    }


                }

            }

        }
        int tempNum = Integer.parseInt(temp);
        if (max <= tempNum) {
            max = tempNum;

        }
        return max;

    }
}



        






package Johnston18;


import java.util.Scanner;

/**
 * Created by brian on 10/31/2016.
 */
public class Finder {

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
        int sum = 0;


        if (s.matches("")) {

        } else {
            ;
            String a = String.valueOf(s.charAt(0));
            Integer i = 0;
            if (tryParseInt(a)) {
                i = Integer.parseInt(a);
            }
            if (s.length() > 1) {
                sum = i + sumIt(s.substring(1));


            } else {
                sum = i;
            }
        }


        return sum;
    }


    public static int findMax(String s, int max) {
        String temp = "0";
        if (s.matches("")) {
            return max;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                if (tryParseInt(s)) {
                    int tempNum = Integer.parseInt(s);
                    if (max <= tempNum) {
                        max = tempNum;
                    }

                } else {
                    for (int j = 0; j < s.length(); j++) {
                        char d = s.charAt(j);
                        if (Character.isLetter(d)) {

                            if (j > 0) {
                                temp = s.substring(0, j);
                                int tempNum = 0;
                                if (tryParseInt(temp)) {
                                    tempNum = Integer.parseInt(temp);
                                    if (max <= tempNum) {
                                        max = tempNum;
                                    }

                                }

                                s = s.substring(j + 1);


                                return findMax(s, max);

                            }

                        }
                    }


                }

            } else {
                s = s.substring(i + 1);
                return findMax(s, max);

            }

        }

        return max;
    }


    public static boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

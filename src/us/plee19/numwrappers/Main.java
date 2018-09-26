package us.plee19.numwrappers;

import java.util.Scanner;

/**
 * Main method to illustrate use of numeric wrappers.
 * @author plee19
 * @version 1
 */
public class Main {

    public static void main(String[] args) {
        System.out.print("Please enter a number: ");
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();

        try {
            long wholeNumber = Long.parseLong(input);
            if (wholeNumber < Byte.MAX_VALUE && wholeNumber > Byte.MIN_VALUE) {
                System.out.println("Byte");
            } else if (wholeNumber < Short.MAX_VALUE && wholeNumber > Short.MIN_VALUE) {
                System.out.println("Short");
            } else if (wholeNumber < Integer.MAX_VALUE && wholeNumber > Integer.MIN_VALUE) {
                System.out.println("Integer");
            } else {
                System.out.println("Long");
            }
        } catch (NumberFormatException e) {
            double decimalNumber = Double.parseDouble(input);

            if (decimalNumber < Float.MAX_VALUE && decimalNumber > Float.MIN_VALUE) {
                System.out.println("Float");
            } else {
                System.out.println("Double");
            }
        }
    }
}
/**
 * Name: James Wong
 * Teacher: Mr Lee
 * Date: Feb 11 2022
 * Description: Write a program that repeatedly asked for the numerator and divisor.
                For each set of data, the program prints out the result (quotient),
                or an informative error message if there is a problem (division by zero or poor input data).
                The program continues looping, even if there is a problem.
                Exit the loop when data entered for the numerator start with characters “q” or “Q”.
                Don’t print out an error message in this case. Don’t ask for the divisor if the user just asked to quit.
 */

import java.util.Scanner;   // import scanner class

public class Wong_James_FoolProof {
    public static void main (String[] args) {

        // variables
        Scanner sc = new Scanner(System.in);
        final String q = "q";
        double numerator = 0;
        String input1 = "";
        double denominator;
        String input2 = "";
        double quotient;
        boolean stop;

        do {
            try {
                // ask user for numerator
                System.out.print("Enter the numerator: ");
                input1 = sc.nextLine();
                stop = input1.toLowerCase().startsWith(q);
                numerator = Double.parseDouble(input1);

                // if numerator doesn't start with a 'q' or 'Q', ask for denominator
                if (!input1.equals(q)) {
                    System.out.print("Enter the denominator: ");
                    input2 = sc.nextLine();
                    denominator = Double.parseDouble(input2);

                    // if denominator is 0, output that you cannot divide by 0. if not, output the quotient
                    if (denominator == 0) {
                        System.out.printf("You can't divide by %.0f!", denominator);
                    } else {
                        quotient = numerator / denominator;
                        System.out.printf("%.2f / %.2f is %.2f", numerator, denominator, quotient);
                    }
                    System.out.println("\n");
                }
            } catch (IllegalArgumentException e) {
                stop = input1.toLowerCase().startsWith(q);

                // if the user does not want to stop (if the numerator does NOT start with q), output a data type error message
                if (!stop) {
                    System.out.println("You entered bad data.");
                    System.out.println("Please try again.\n");
                }
            }
        } while (!stop); // loop if user wants to keep going.
    sc.close();
    }
}


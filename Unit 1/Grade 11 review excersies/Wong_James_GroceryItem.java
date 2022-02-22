/**
 * Name: James Wong
 * Teacher: Mr Lee
 * Date: Feb 07 2022
 * Description: Create a program that asks for two grocery items and their price.
                The names of the items will not exceed 20 characters.
                The price will not exceed $99.99.
 */

import java.util.Scanner; // import the scanner class

public class Wong_James_GroceryItem {
    public static void main (String [] args) {

        int pos1, pos2 ; // variable of the position of the grocery's price

        Scanner sc = new Scanner (System.in); // create a scanner

        System.out.print("Enter Grocery 1: ");
        String food1 = sc.nextLine(); // import user's first food
        System.out.print("Enter price of " + food1 + ": ");
        double price1 = sc.nextDouble(); // import user's first food price
        sc.nextLine();

        System.out.print("Enter Grocery 2: ");
        String food2 = sc.nextLine(); // import user's second food
        System.out.print("Enter price of " + food2 + ": ");
        double price2 = sc.nextDouble(); // import user's second food price

        // calculate the price position of the grocery's
        if (price1<10) {
            pos1 = -15;
        } else {
            pos1 = -14;
        }
        if (price2<10) {
            pos2 = -15;
        } else {
            pos2 = -14;
        }

        // final output
        System.out.println("---------------------");
        System.out.printf("%"+pos1+"s $%.2f \n", food1, price1);
        System.out.printf("%"+pos2+"s $%.2f \n", food2, price2);
        System.out.println("---------------------");

        sc.close(); // close scanner

    }
}

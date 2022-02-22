/**
 * Name: James Wong
 * Teacher: Mr Lee
 * Date: Feb 9 2022
 * Description: Create a method that returns the smallest angle in a triangle in degrees,
                given two sides and an angle in between them.
                The sides and angles can have decimals, and the angle is given in radians.
 */

import java.util.Scanner;   //import the scanner class
import java.lang.Math;      //import the math class

public class Wong_James_SASTriangleSolver {
    public static void main (String[] args) {

        // variable for the smallest degree
        double smallestDegree;

        // create a scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("The first side(cm): ");
        double sidea = sc.nextDouble();         //import first side

        System.out.print("The second side(cm): ");
        double sideb = sc.nextDouble();         //import second side

        System.out.print("The degree of the two sides from above: ");
        double degreeC = sc.nextDouble();       //import degree between first and second side
        sc.nextLine();                          //next line

        // calculate the smallest degree in the second method
        smallestDegree = solve(sidea, sideb, degreeC);

        // output statement
        System.out.printf("The smallest angle in radians is %.2f", smallestDegree);

        sc.close(); // close scanner
    }

    /**
     * @param sidea
     * @param sideb
     * @param degreeC
     * @return
     */
    public static double solve(double sidea, double sideb, double degreeC) {

        double sidec;              // third side variable
        double degreeB, degreeA;   // variables for the degrees of B and C
        double radianA, radianB, radianC;            // variable for the radian of the user's degree input
        double smallestDegree = 0;     // variable of the smallest angle in the triangle

        radianC = Math.toRadians(degreeC);      //convert degreeC to radianC

        // calculation of the third side using cosine law
        sidec = Math.sqrt(Math.pow(sidea, 2) + Math.pow(sideb, 2) - (2 * sidea * sideb * Math.cos(radianC)));

        // calculation of the two other angles using cosine law
        degreeB = Math.toDegrees(Math.acos((Math.pow(sidec, 2) + Math.pow(sidea, 2) - Math.pow(sideb, 2)) / (2 * sidec * sidea)));
        degreeA = 180 - (degreeB + degreeC);

        // if statement to find the smallest angle, also converts the smallest angle into radians
        if (degreeA < degreeB && degreeA < degreeC) {
            smallestDegree = Math.toRadians(degreeA);
        } else if (degreeB < degreeA && degreeB < degreeC) {
            smallestDegree = Math.toRadians(degreeB);
        } else if (degreeC < degreeA && degreeC < degreeA) {
            smallestDegree = Math.toRadians(degreeC);
        }

        // return statement
        return smallestDegree;
    }
}

/**
 * Name: James Wong
 * Teacher: Mr Lee
 * Date: Feb 26 2022
 * Description: Vegetable class
 */
import java.io.File;  // Import the File class
import java.io.*;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files


public class Vegetable {
    /*
    Attributes
    Used to describe a object
     */

    /**
     * the name of the vegetable
     */
    private String vegetable;

    /**
     * the amount of calories of the vegetable
     */
    private int calories;

    /**
     * the weight of the vegetable
     */
    private double weight;

    /*
    Constructor
     */
    public Vegetable(){
        this.vegetable = "";
        this.weight = -1;
        this.calories = -1;
    }

    /**
     * Constructing a cookie
     * sets name
     * initializes calories and weight
     * @param vegetable
     * @param calories
     * @param weight
     */
    public Vegetable(String vegetable, int calories, double weight) {

        this.vegetable = vegetable;     // initializing the name of the vegetable

        // initializing the calories
        if (calories < 0) {             // cannot be less than 0
            this.calories = 0;
        } else {
            this.calories = calories;
        }

        // initializing the weight
        if (weight < 0) {               // cannot be less than 0
            this.weight = 0;
        } else {
            this.weight = weight;
        }
    }

    /*
    Method
     */

    /**
     * get the colour
     *
     * @return the colour
     */
    public String getColour() {
        return this.colour;
    }

    /**
     * is it green
     *
     * @return if green
     */
    public boolean getIsGreen() {
        return this.isGreen;
    }

    /**
     * get the vegetable name
     *
     * @return the vegetable name
     */
    public String getVegetable() {
        return this.vegetable;
    }

    /**
     * get the calories
     *
     * @return the calories
     */
    public int getCalories() {
        return this.calories;
    }

    /**
     * is it edible
     *
     * @return if edible
     */
    public boolean getEdible() {
        return this.edible;
    }

    /**
     * get the weight
     *
     * @return the weight
     */
    public double getWeight() {
        return this.weight;
    }
    /*
    Mutators
     */

    /**
     * changes the weight
     * of the vegetable, cannot be less than zero or greater than the original weight
     * changes the calories of the vegetable, cannot be less than the zero or greater than the original calories
     * @param newWeight expected new weight
     */

    public void setWeight(double newWeight) {
        // cannot be bigger than the original weight. must be > 0
        if (newWeight > this.weight){
            this.weight = this.weight;  // not to do anything
        } else if (newWeight < 0){      // restriction from negative weight
            this.weight = 0;
        } else if (newWeight == 0){     // specifically for 0
            this.weight = 0;
        } else {                        // all other cases
            this.weight = newWeight;
        }
    }

    public void setCalories(int newCalories) {
        // cannot be greater than original calories or less than zero
        if (newCalories < this.calories) {
            this.calories = newCalories;        // set calories to the new calories
        } else if (newCalories < 0) {           // restriction from negative calories
            this.calories = 0;
        } else {
            this.calories = this.calories;      // not to do anything
        }
    }

}




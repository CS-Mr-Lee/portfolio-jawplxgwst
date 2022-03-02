/**
 * Name: James Wong
 * Teacher: Mr Lee
 * Date: Feb 26 2022
 * Description: Vegetable class
 */

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

    /**
     * Default constructor
     * Sets name to “”, weight to -1, calories to -1
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
     * get the vegetable name
     * @return the vegetable name
     */
    public String getVegetable() {
        return this.vegetable;
    }

    /**
     * get the calories
     * @return the calories
     */
    public int getCalories() {
        return this.calories;
    }

    /**
     * get the weight
     * @return the weight
     */
    public double getWeight() {
        return this.weight;
    }

    /*
    Mutators
     */

    /**
     * Vegetable gets eaten
     * The amount of vegetable removed is taken as a parameter
     * @param weight
     * @return
     */
    public int eaten(double weight){
        if (weight > this.weight) {
            this.weight = -1;                                                       // flag that the weight is greater than the original weight
        } else if (weight > 0 && weight < this.weight) {                            // if the weight is less than original or greater than 0
            this.calories = (int)((this.weight-weight)/this.weight)*this.calories;  // set the calories
            this.weight = this.weight - weight;                                     // set weight
        } else {
            this.weight = 0;                                                        // other option is less than 0
        }
        return this.calories;                                                       // Returns the amount of calories it gives
    }

    public String toString(){

        // casting the variables to string
        String weightToString = Double.toString(this.weight);
        String caloriesToString = Integer.toString(this.calories);

        // Returns the important information of Vegetable
        return "Name: " + vegetable + "\n" + "Weight to grams: " + weightToString + "\n" + "Calories: " + caloriesToString;
    }

}




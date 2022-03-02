/**
 * Name: James Wong
 * Teacher: Mr Lee
 * Date: Feb 25 2022
 * Description: create a human class with 5 attributes
 */


public class Human {

    /*
    Attribute
    name
    weight (in kg)
     */

    /* the name of the human */
    private String name;

    /* the weight of the human */
    private double weight;

    /* the energy level of the human */
    private int energyLevel;

    /*
    Constructor
     */
    public Human() {
        this.name = "";
        this.weight = -1;
        this.energyLevel = -1;
    }

    public Human(String name, double weight, int energyLevel) {

        // setting the name of the human
        this.name = name;

        // sets restrictions for weight
        //if weight is below zero, weight is zero
        if (weight < 0) {
            this.weight = 0;
        } else {
            this.weight = weight;
        }

        // setting restriction for energy levels
        if (energyLevel < 0) {              // if energy level is negative, sets to 0
            this.energyLevel = 0;
        } else if (energyLevel > 100) {     // if energy levels exceeds maximum, set to 100
            this.energyLevel = 100;
        } else {
            this.energyLevel = energyLevel; // all other cases apoint to the energy level being within the parameters set above
        }
    }

    /*
    Method
     */

    /**
     * gets the name of the human
     *@return the name
     */
    public String getName(){
        return this.name;
    }

    /**
     * gets the weight of the human
     *@return the weight
     */
    public double getWeight(){
        return this.weight;
    }

    /**
     * gets the energy level of the human
     *@return the energy level
     */
    public double getEnergyLevel(){
        return this.energyLevel;
    }

    /*
    Mutator
     */

    /**
     * The person sleeps
     * Raises energyLevel by hours * 10%
     * @param hours
     */
    public void sleep(int hours){
        this.energyLevel = this.energyLevel+ ((1+(10/this.energyLevel))*hours);     // setting the new energy level

        // make sure the energy level isn't above 100 or less than 0 percent
        if (this.energyLevel > 100) {
            this.energyLevel = 100;
        } else if (this.energyLevel < 0) {
            this.energyLevel = 0;
        } else {
            this.energyLevel = this.energyLevel;
        }
    }

    /**
     * Loses energy using formula (1km = 3%), decreases weight by 0.001 per km
     * @param km
     */
    public void run(double km){
        this.energyLevel =  this.energyLevel - (int)((3/this.energyLevel)*km);    // loses energy using formula (1km = 3%)
        this.weight = 0.001*km;                                             // decreases weight by 0.001 per km
    }

    /**
     * Vegetable is the food being eaten, grams is the amount of food
     * @param veg
     * @param grams
     */
    public void eat(Vegetable veg, double grams) {              // Vegetable is the food being eaten, grams is the amount of food being eaten
        if (grams > this.weight) {
            System.out.println("I don’t have that much food");  // If it is unsuccessfully eaten, the person does not change and print out “I don’t have that much food”
        } else if (grams < this.weight && grams > 0) {
            this.weight = this.weight + grams;                  // Person gains the weight eaten
            this.energyLevel = (int) ((veg.eaten(grams)/15)/this.energyLevel)+this.energyLevel;     // Energy level is increased by the calories (15 cal = 1%)
        } else {    // catch if less than 0
            grams = 0;
            this.weight = this.weight = grams;                  // all other cases
        }
    }

    /**
     * Cookie is the food being eaten, grams is the amount of food
     * @param food
     * @param grams
     */
    public void eat(Cookie food, double grams){                 // Cookie is the food being eaten, grams is the amount of food

        if (food.getIsPackaged()) {                             // Prints out “I can’t eat the bag” if the cookie is packaged
            System.out.println("I can't eat the bag");
        } else {
            if (grams > this.weight) {
                System.out.println("I don’t have that much food");  // If it is unsuccessfully eaten, the person does not change and print out “I don’t have that much food”
            } else if (grams < this.weight && grams > 0) {
                this.weight = this.weight + grams;                  // Person gains the weight eaten
                this.energyLevel = (int) ((food.eaten(grams)/15)/this.energyLevel)+this.energyLevel;     // Energy level is increased by the calories (15 cal = 1%)
            } else {    // catch if less than 0
                grams = 0;
                this.weight = this.weight = grams;                  // all other cases
            }
        }
    }

    /**
     * Return the important information of Human
     * @return
     */
    public String toString(){
        // casting the variables to string
        String weightToString = Double.toString(this.weight);
        String energyLevelToString = Integer.toString(this.energyLevel);

        // Returns the important information of Human
        return "Name: " + name + "\n" + "Weight in grams: "  + weightToString + "\n" + "Energy Level: " + energyLevelToString;
    }
}


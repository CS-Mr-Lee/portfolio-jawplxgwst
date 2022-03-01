/**
 * Name: James Wong, Cyrus Yang
 * Teacher: Mr Lee
 * Date: Feb 25 2022
 * Description: create a human class with 5 attributes
 */


public class Human {

    @SuppressWarnings("unused")
    /*
    Attribute

    name
    weight (in kg)
    energyLevel (from 0 - 100%)
    age
    race
     */

    /* the name of the human */
    private String name;

    /* the weight of the human */
    private double weight;

    /* the energy level of the human */
    private double energyLevel;

    /* the age of the human (James' Attribute) */
    private int age;

    /* the race of the human (Cyrus Attribute) */
    private String race;

    /*
    Constructor - for human gaming setup
     */
    public Human(String name, double weight, double energyLevel, int age, String race) {
        this.name = name;
        this.race = race;

        // sets restrictions for weight
        //if weight is below zero, weight is zero
        if (weight < 0){
            this.weight = 0;
        } else {
            this.weight = weight;
        }

        // setting restriction for energy levels
        if (energyLevel < 0) {            //if energy level is negative, sets
            this.energyLevel = 0;
        } else if (energyLevel > 100) {  //if energy levels exceeds maximum, set to 100
            this.energyLevel = 100;
        } else {
            this.energyLevel = energyLevel;
        }

        // setting restrictions for age
        if (age < 0) {
            this.age = 0; // if age is negative, automatically convert to 0
        } else {
            this.age = age;
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

    /**
     * gets the age of the human
     *@return the age
     */
    public int getAge (){
        return this.age;
    }
    /**
     * gets the race of the human
     *@return the race
     */
    public String getRace(){
        return this.race;
    }

    /*
    Mutator
     */

    /**
     * changes the weight of the human cannot be less than zero or greater than the original weight
     * changes the energy level of the human, cannot be greater than 100 or less than 0
     * changes the age of the human, cannot be less than original age
     * @param newWeight expected new weight
     */

    public void setWeight(double newWeight){

        // cannot be bigger than the original weight or less than zero
        if (newWeight < this.weight) {
            this.weight = this.weight;      // not to do anything
        } else if (newWeight < 0) {         // restriction from negative weight
            this.weight = 0;
        } else if (newWeight == 0) {        // specifically for 0
            this.weight = 0;
        } else {                            // all other cases
            this.weight = newWeight;
        }
    }

    public void setEnergyLevel(double newEnergyLevel) {

        // set new energy level, cannot be less than zero or greater than 100
        if (newEnergyLevel < 0){                // set restrictions for negative energy level
            this.energyLevel = 0;
        } else if (newEnergyLevel > 100) {      // set restrictions for over 100 energy level
            this.energyLevel = 100;
        } else {                                // all other cases
            this.energyLevel = newEnergyLevel;
        }
    }

    public void setAge(int newAge){

        // set new age, cannot be less than original age
        if (newAge < this.age) {    // set restrictions for age lower than the original
            this.age = this.age;
        } else {                    // all other cases
            this.age = newAge;
        }
    }
}


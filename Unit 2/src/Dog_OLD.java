/**
 * This is a dog class
 *
 * Class: ICS4U1
 * Date: March 03 2022
 * @author James Wong
 * @author Jessica Lu
 */

public class Dog_OLD {

    /*
    Attributes
    */

    /* The name of the dog */
    private String name;

    /* The colour of the dog */
    private String colour;

    /* The age of the dog */
    private int age;

    /* The weight of the dog */
    private double weight;

    /* The energy level of the dog */
    private int energyLevel;

    /* Is the dog tired or not*/
    private boolean isTired;

    /* Is the dog Hypoallergenic or not */
    private boolean isHypoallergenic;

  /*
  Constructor
  */

    /**
     Name: Dog
     Description: creates a basic dog
     @param name the name of the dog
     @param colour the colour of the dog
     @param age the age of the dog
     @param weight the weight of the dog in kg
     @param energyLevel the energy level of the dog 0-100
     @param isTired whether the dog is tired or not
     @param isHypoallergenic whether the dog is hypoallergenic or not
     */
    public Dog_OLD(String name, String colour, int age, double weight, int energyLevel, boolean isTired, boolean isHypoallergenic) {

        this.name = name;
        this.colour = colour;
        this.isTired = isTired;
        this.isHypoallergenic = isHypoallergenic;

        // age cannot be less than 0
        if (age < 1) {
            this.age = 1;
        } else {
            this.age = age;
        }

        // weight cannot be less than 0
        if (weight < 0) {
            this.weight = 0;
        } else {
            this.weight = weight;
        }

        // energy level as a percentage cannot be less than 0 or greater than 100
        if (energyLevel < 0) {
            this.age = 0;
        } else if (energyLevel > 100) {
            this.energyLevel = 100;
        } else {
            this.energyLevel = energyLevel;
        }
    }

  /*
  Method
  */

    /**
     Name: getName
     Description: return the dog name
     */
    public String getName() {return this.name;}

    /**
     Name: getColour
     Description: return the dog colour
     */
    public String getColour() {return this.colour;}

    /**
     Name: getAge
     Description: return the age of the dog
     */
    public int getAge() {return this.age;}

    /**
     Name: getWeight
     Description: return the weight of the dog
     */
    public double getWeight() {return this.weight;}

    /**
     Name: getEnergyLevel
     Description: return the energy level of the dog form 0-100
     */
    public int getEnergyLevel() {return this.energyLevel;}

    /**
     Name: getIsTired
     Description: return whether the dog is tired or not
     */
    public boolean getIsTired() {return this.isTired;}

    /**
     Name: getHypoallergenic
     Description: return whether the dog is hypoallergenic or not
     */
    public boolean getIsHypoallergenic() {return this.isHypoallergenic;}

  /*
  Mutators
  */

    /**
     Name: setWeight
     Description: set a new weight for the dog
     @param newWeight new possible weight for the dog
     */
    public void setWeight(double newWeight) {
        if (newWeight < 0) {
            this.weight = 0;
        } else {
            this.weight = newWeight;
        }
    }

    /**
     Name: setIsTired
     Description: set if the dog is tired or not
     @param newIsTired if the dog is tired or not
     */
    public void setIsTired(boolean newIsTired) {
        this.isTired = newIsTired;
    }

    /**
     Name: play
     Description: Dog plays and loses weight and energy
     @param time the minutes the dog spent playing
     */
    public void play(int time) {

        if (isTired) {        // if the dog is tired, the dog won't have enough energy to play
            System.out.println(this.name + " is too tired to play");
        } else {            // if the dog has enough energy, the dog can play

            this.weight = this.weight - time / 10;      // the dog gains weight of the time divide by 10

            this.energyLevel = this.energyLevel - (int) (0.01 * (time / 10)) * this.energyLevel;    // the dog's energy level is the time divided by 10 as a percentage of the original energy level subtracted from the enegy level

            // keep the energy level within 0-100
            if (this.energyLevel > 100) {          // if the energy level is greater than 100
                this.energyLevel = 100;
            } else if (this.energyLevel < 0) {    // if the energy level is less than 0
                this.energyLevel = 0;
            }

            // if the dog plays for over 100 minutes, then the dog will be tired
            if (time > 100) {
                this.isTired = true;
            } else {
                this.isTired = false;    // if the dog plays for less than 100 minutes, then the dog will not be tired
            }
            System.out.println(this.name + " is not tired to play and has a play time of " + time + " minutes");
            System.out.println(this.name + " has a new energy level of " + this.energyLevel + "% has a new weight of " + this.weight + "kg");
        }
    }

    /**
     Name: run
     Description: Dog runs and loses energy.
     For each 50 metres = -1% energy (not multiplied, added)
     @param metres the distance ran in metres
     */
    public void run(double metres){
        if (getEnergyLevel() < 50) {
            System.out.print(getName() + " doesn't have enough energy to run this far. (Try sleeping!)");
        } else if (metres > 0) {
            this.energyLevel = (int)(this.energyLevel - metres/50);

            System.out.println(getName() + " went on a run. They ran for " + metres + "m and lost some energy.");
            System.out.println("They now have an energy level of " + getEnergyLevel() + "%.");
        }
    }

    /**
     * Name: eat
     * Description: Dog eats and gains energy and weight
     For every gram of food, the dog's weight is the grams plus 10 added to the original weight
     For every gram of food, the dog's energy level is the grams divide by 10 as a percentage of the original energy level added to the energy level
     * @param grams
     */
    public void eat(double grams){

        this.weight = this.weight + grams / 10;          // the dog's weight is the grams plus 10 added to the original weight

        this.energyLevel = this.energyLevel + (int) (0.01 * (grams / 10)) * this.energyLevel;    // the energy level is the grams divide by 10 as a percentabge of the original energy level added to the energy level

        // keep the energy level within 0-100
        if (this.energyLevel > 100) {          // if the energy level is greater than 100
            this.energyLevel = 100;
        } else if (this.energyLevel < 0) {    // if the energy level is less than 0
            this.energyLevel = 0;
        }

        System.out.println(this.name + " ate food which weighted " + grams + "kg");
        System.out.println(this.name + " has a new energy level of " + this.energyLevel + "% and has a new weight of " + this.weight + "kg");
    }

    /**
     Name: sleep
     Description: Dog sleeps and gains energy
     @param sleep the minutes the dog spent sleeping
     */
    public void sleep ( int sleep) {
        if (isTired) {
            if (sleep > 60) {
                this.isTired = false;

                this.energyLevel = 100;

                System.out.println(this.name + "fell asleep and woke up with a replenishing energy level of 100%");

            } else if (sleep < 60 && sleep > 0) {
                this.energyLevel = this.energyLevel + 25;
                // keep the energy level within 0-100
                if (this.energyLevel > 100) {          // if the energy level is greater than 100
                    this.energyLevel = 100;
                } else {                      // all other cases is if energy level is less than 0
                    this.energyLevel = 0;
                }
                System.out.println(this.name + " fell asleep and woke up with a new energy level of " + this.energyLevel);
            }
        } else {
            System.out.println(this.name + " is not tired enough to sleep");
        }

    }
    /**
     Name: birthday
     Description: the dog gets one year older!
     */
    public void birthday() {
        this.age = this.age + 1;
        System.out.println("It's " + this.name + "'s birthday! " + this.name + " is now " + this.age + " years old.");
    }

    /**
     Name: toString
     Description: returns all dog attributes
     @return all turtle attributes
     */
    public String toString() {

        // String name, String colour, int age, double weight, int energyLevel, boolean isTired, boolean isHypoallergenic
        return "Name: " + this.name + "\nColour: " + this.colour + "\nAge: " + this.age + "\nWeight: " + this.weight + "kg\nEnergy Level: " + this.energyLevel + "%\nIs tired: " + this.isTired + "\nIs Hypoallergenic: " + this.isHypoallergenic;
    }
}
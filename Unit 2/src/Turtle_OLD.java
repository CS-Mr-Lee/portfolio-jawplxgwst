/**
 * This is a turtle subclass
 *
 * Class: ICS4U1
 * Date: March 03 2022
 * @author James Wong
 * @author Jessica Lu
 */

public class Turtle_OLD {
    /* attributes */

    /** name of the cookie */
    private String name;
    /** colour of the turtle */
    private String colour;
    /** age of the turtle */
    private int age;
    /** energy level of the turtle in % */
    private int energyLevel;
    /** weight of the turtle in kg */
    private double weight;
    /** whether the turtle is a pet or not */
    private boolean isPet;
    /** breed of the turtle */
    private String breed;
    /** whether the turtle is tired or not */
    private boolean isTired;
    /** whether the turtle has a home or not */
    private boolean hasHome;

    /* constructors */

    /**
     Name: Turtle
     Description: creates a basic turtle
     @param name the name of the turtle
     @param breed the breed of the turtle
     @param colour the colour of the turtle
     @param age the age of the turtle
     @param weight the weight of the turtle in kg
     @param isPet whether the turtle is a pet or not
     @param isTired whether the turtle is tired or not
     @param hasHome whether the turtle has a home or not
     */
    public Turtle_OLD(String name, String breed, String colour, int age, int energyLevel, double weight, boolean isPet, boolean isTired, boolean hasHome) {
        this.name = name;
        this.breed = breed;
        this.colour = colour;
        this.isPet = isPet;
        this.isTired = isTired;

        // age must be positive
        if (age < 1) {
            this.age = 1;
        } else {
            this.age = age;
        }

        // energy level must be between 0 and 100 inclusive
        if (energyLevel < 0) {
            this.energyLevel = 0;
        } else if (energyLevel > 100) {
            this.energyLevel = 100;
        } else {
            this.energyLevel = energyLevel;
        }

        // weight must be positive. if not, defaults to 150kg
        if (weight < 0) {
            this.weight = 150;
        } else {
            this.weight = weight;
        }

        // can only have a home if they are not a pet
        if (!isPet) {
            this.hasHome = hasHome;
        } else {
            this.hasHome = false;
        }
    }

    /* accessors */

    /**
     Name: getName
     Description: return the turtle name
     @return the name of the turtle
     */
    public String getName() {
        return this.name;
    }

    /**
     Name: getBreed
     Description: return the turtle breed
     @return the breed of the turtle
     */
    public String getBreed() {
        return this.breed;
    }

    /**
     Name: getColour
     Description: return the turtle colour
     @return the colour of the turtle
     */
    public String getColour() {
        return this.colour;
    }

    /**
     Name: getAge
     Description: return the turtle age
     @return the age of the turtle
     */
    public int getAge() {
        return this.age;
    }

    /**
     Name: getWeight
     Description: return the turtle weight in kg
     @return the weight of the turtle in kg
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     Name: getIsPet
     Description: return whether the turtle is a pet or not
     @return whether the turtle is a pet or not
     */
    public boolean getIsPet() {
        return this.isPet;
    }

    /**
     Name: getIsTired
     Description: return whether the turtle is tired or not
     @return whether the turtle is tired or not
     */
    public boolean getIsTired() {
        return this.isTired;
    }

    /**
     Name: getHasHome
     Description: return whether the turtle has a home or not
     @return whether the turtle has a home or not
     */
    public boolean getHasHome() {
        return this.hasHome;
    }

    /* mutators */

    /**
     Name: setWeight
     Description: set a new weight for the turtle
     @param newWeight new possible weight for the turtle
     */
    public void setWeight(double newWeight) {
        if (newWeight > 0) {
            this.weight = newWeight;
        }
    }

    /**
     Name: setIsPet
     Description: set if the turtle is a pet or not
     @param newIsPet if the turtle is now a pet or not
     */
    public void setIsPet(boolean newIsPet) {
        this.isPet = newIsPet;

        // if they become a pet then their outside home is destroyed and gone
        if (this.hasHome) {
            this.hasHome = false;
        }
    }

    /**
     Name: setIsTired
     Description: set if the turtle is tired or not
     @param newIsTired if the turtle is tired or not
     */
    public void setIsTired(boolean newIsTired) {
        this.isTired = newIsTired;
    }

    /**
     Name: setHasHome
     Description: set if the turtle has a home or not
     @param newHasHome if the turtle has a home or not
     */
    public void setHasHome(boolean newHasHome) {
        this.hasHome = newHasHome;
    }

    /* other methods */

    /**
     Name: run
     Description: turtle runs and loses energy. for each 40 metres = -1% energy (not multiplied, added)
     @param metres the distance ran in metres
     */
    public void run(int metres) {
        final int METRES_TO_ENERGY = 40; // 40 metres = -1%

        int energyUsed = metres / METRES_TO_ENERGY; // how much energy needed to run that distance (may exceed turtle's energy level)

        if (energyUsed > this.energyLevel) { // only runs if they have enough energy
            System.out.println(this.name + " doesn't have enough energy to run this far. (Try sleeping!)");
        } else if (metres > 0) { // only run if the distance is positive (it actually exists)
            this.energyLevel = this.energyLevel - metres / METRES_TO_ENERGY;

            System.out.println(this.name + " went on a run. They ran for " + metres + "m and lost some energy.");
            System.out.println("They now have an energy level of " + this.energyLevel + "%.");
        }
    }

    /**
     Name: swim
     Description: turtle swims and loses energy. for each 80 metres = -1% energy (not multiplied, added)
     @param metres the distance swam in metres
     */
    public void swim(int metres) {
        final int METRES_TO_ENERGY = 80; // 80 metres = -1%

        int energyUsed = metres / METRES_TO_ENERGY; // how much energy needed to run that distance (may exceed turtle's energy level)

        if (energyUsed > this.energyLevel) { // only swims if they have enough energy
            System.out.println(this.name + " doesn't have enough energy to swim this far. (Try sleeping!)");
        } else if (metres > 0) { // only swim if the distance is positive (it actually exists)
            this.energyLevel = this.energyLevel - metres / METRES_TO_ENERGY;

            System.out.println(this.name + " went on a swim. They ran for " + metres + "m and lost some energy.");
            System.out.println("They now have an energy level of " + this.energyLevel + "%.");
        }
    }

    /**
     Name: eat
     Description: turtle eats food and gains energy level. for each 50 grams = + 1% energy (not multiplied, added)
     @param grams the amount of food eaten in grams
     */
    public void eat(int grams) {
        final int GRAMS_TO_ENERGY = 50; // 50 grams = 1%
        if (grams > 0) { // only if the weight is positive (it actually exists)
            this.energyLevel = this.energyLevel + grams / GRAMS_TO_ENERGY; // old energy + gained energy
        }

        // if energy is more than 100%, bring down to 100% (max)
        if (energyLevel > 100) {
            this.energyLevel = 100;
        }
    }

    /**
     Name: birthday
     Description: the turtle gets one year older!
     */
    public void birthday() {
        this.age = this.age + 1;
        System.out.println("It's " + this.name + "'s birthday! They are now " + this.age + " years old.");
    }

    /**
     Name: buildHome
     Description: if the turtle is not a pet, it builds a home that it can sleep in
     */
    public void buildHome() {
        if (!this.isPet) { // if they're not a pet
            if (!this.hasHome) { // if they don't have a home
                this.hasHome = true;
                this.isTired = true;
                this.energyLevel = 0;
                System.out.println(this.name + " built a home. They are now exhausted.");
            } else { // they already have a home
                System.out.println(this.name + " already has a home! (They' can't build another one).");
            }
        } else { // they are a pet
            System.out.println(this.name + " can't build a home because they are a pet and their owner already has something for them!");
        }
    }

    /**
     Name: sleep
     Description: if the turtle has a home or is a pet, they go to sleep and get 100% energy level
     */
    public void sleep() {
        if (this.hasHome || this.isPet) {
            System.out.println(this.name + " went to sleep. They're rejuvenated and happy now! :)");
            this.energyLevel = 100;
            System.out.println("They also got all their energy back. They now have an energy level of " + energyLevel + "%.");
            this.isTired = false; // no longer tired
        } else {
            System.out.println(this.name + " has nowhere to sleep! (Try build them a home first).");
        }
    }

    /**
     Name: toString
     Description: returns all turtle attributes
     @return all turtle attributes
     */
    public String toString() {
        String attributes;

        // String name, String breed, String colour, int age, int energyLevel, double weight, boolean isPet, boolean isTired, boolean hasHome
        attributes = "Name: " + this.name + "\nBreed: " + this.breed + "\nColour: " + this.colour + "\nAge: " + this.age + "\nEnergy Level: " + this.energyLevel + "%\nWeight: " + this.weight + " kg\nIs a pet: " + this.isPet + "\nIs tired: " + this.isTired + "\nHas a home: " + this.hasHome;

        return attributes;
    }
}
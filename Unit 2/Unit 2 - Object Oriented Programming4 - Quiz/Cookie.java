/**
 * Name: James Wong
 * Teacher: Mr Lee
 * Date: Feb 26 2022
 * Description: Cookie class (the commenting on the Cookie class will be emphasized.)
 */

public class Cookie {
    /*
    Attributes
     */

    /**
     * the name of the cookie
     */
    private String cookie;

    /**
     * the weight of the cookie
     */
    private double weight;

    /**
     * the number of calories of the cookie
     */
    private int calories;

    /**
     * is the cookie packaged or not
     */
    private boolean isPackaged;

    /*
    Constructor
     */

    /**
     * Default constructor
     * Sets name to “”, weight to -1, calories to -1, and isPackaged to false
     */
    public Cookie() {
        this.cookie = "";
        this.weight = -1;
        this.calories = -1;
        this.isPackaged = false;
    }

    /**
     * Constructing an unpackaged cookie
     * Sets name, weight, and calories from parameters, and isPackaged is false
     *
     * @param name
     * @param weight
     * @param calories
     */
    public Cookie(String name, double weight, int calories) {
        this.cookie = cookie;               // setting the name of the cookie

        // initializing the parameters of the weight
        if (weight < 0) {                   // cannot be less than 0
            this.weight = 0;
        } else {
            this.weight = weight;
        }

        // initializing the parameter of the calories
        if (calories < 0) {                 // cannot be less than 0
            this.calories = 0;
        } else {
            this.calories = calories;
        }

        this.isPackaged = false;       // setting if it is packaged or not
    }

    /**
     * Constructing a cookie
     * Sets name, weight, calories, and isPackaged from parameters
     *
     * @param cookie
     * @param weight
     * @param calories
     * @param isPackaged
     */
    public Cookie(String cookie, double weight, int calories, boolean isPackaged) {

        this.cookie = cookie;               // setting the name of the cookie

        // initializing the parameters of the weight
        if (weight < 0) {                   // cannot be less than 0
            this.weight = 0;
        } else {
            this.weight = weight;
        }

        // initializing the parameter of the calories
        if (calories < 0) {                 // cannot be less than 0
            this.calories = 0;
        } else {
            this.calories = calories;
        }

        this.isPackaged = isPackaged;       // setting if it is packaged or not
    }

    /*
    Method
     */

    /**
     * get the colour
     *
     * @return
     */
    public String getCookie() {
        return this.cookie;
    }

    /**
     * get the weight
     *
     * @return
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     * get the calories
     *
     * @return
     */
    public int getcalories() {
        return this.calories;
    }

    /**
     * is it packaged or not
     *
     * @return
     */
    public boolean getIsPackaged() {
        return this.isPackaged;
    }

    /**
     * take the cookie out of the package before eating
     */
    public void open() {
        this.isPackaged = false;
    }

    /**
     * Cookie gets eaten
     *
     * @param weight
     * @return
     */
    public int eaten(double weight) {

        if (!this.isPackaged) {
            if (weight > this.weight) {                         // cannot gain weight when being eaten, flag with -1
                this.weight = -1;
            } else if (weight < this.weight && weight > 0) {    // if the weight is less than the original weight and greater than 0
                this.calories = ((int) this.weight - (int) weight); // if the weight is less than the original set the new calories
                this.weight = weight;
            } else {                                            // if the new weight is less than o
                this.weight = 0;
            }
        } else {
            return -2;          /**NOTE */
        }
    }

    public String toString() {
        String isPackagedToString = "undetermined";
        String weightToString = Double.toString(this.weight);
        String caloriesToString = Integer.toString(this.calories);
        if (this.isPackaged){
            isPackagedToString = "is packaged";
        } else {
            isPackagedToString = "is not packaged";
        }
        return "Name: " + cookie + "\n" + weightToString + "\n" + caloriesToString + "\n" + isPackagedToString;
    }
}


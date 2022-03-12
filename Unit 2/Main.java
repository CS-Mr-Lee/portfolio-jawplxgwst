/**
 * creates a dog and turtle that run and sleep and have other methods
 *
 * Class: ICS4U1
 * Date: March 10 2022
 * @author James Wong
 * @author Jessica Lu
 */

public class Main {
    public static void main(String[] args) {

  /*
  what to do:
  - create the turtle (not a pet, no home)
  - tries to go on a swim but can't
  - try to go to sleep but can't because they have no home
  - build a home
  - go to sleep, have energy
  - now they go on a run!!
  - it's their birthday
  - and then (with mutator) they are now suddenly a pet
    */

        // creates an Animal / Turtle
        Animal turtle = new Turtle("Donatello", "Snapping Turtle", "Brown", 45, 20, 20, false, false, false, true);

        // outputs turtle attributes
        System.out.println("Say hi to this new turtle!");
        System.out.println(turtle.toString());
        System.out.println();

        // turtle goes on a fun journey
        try {
            if (turtle instanceof Turtle) { // only if the turtle object is an instance of the Turtle class (it is)
                System.out.println(turtle.getName() + " wants to go on a swim. They try to swim 10000 metres.");

                // downcasts the turtle (that is an Animal) into a Turtle so it can use methods that come from the Turtle class
                // it will call from the subclass instead of the superclass
                ((Turtle)turtle).swim(10000); // tries to swim but can't (not enough energy)
                Thread.sleep(1000);
                System.out.println();

                System.out.println("They try to go to sleep.");
                ((Turtle)turtle).sleep(); // tries to sleep but can't (no home)
                Thread.sleep(1000);
                System.out.println();

                ((Turtle)turtle).buildHome(); // successfully builds a home
                Thread.sleep(1000);
                System.out.println();

                ((Turtle)turtle).sleep(); // successfully goes to sleep
                Thread.sleep(1000);
                System.out.println();

                ((Turtle)turtle).run(500); // successfully runs
                Thread.sleep(1000);
                System.out.println();

                turtle.birthday(); // birthday woo
                Thread.sleep(1000);
                System.out.println();

                System.out.println("All of a sudden, " + turtle.getName() + " gets adopted (how? I don't know!) and is now a pet. WOO!");
                ((Turtle)turtle).setIsPet(true);
            }
        } catch (Exception e) {
        }

        System.out.println();
        System.out.println("------------------");
        System.out.println();

        // create a dog
        Dog thisDog = new Dog("Rachel", "Bichon-Frise", "Yellow", 17, 20.5, 50, false, false, false);

        // outputs dog attributes
        System.out.println("Say hi to this new dog!");
        System.out.println(thisDog.toString());
        System.out.println();

        try {
            if (thisDog instanceof Dog) {
                Thread.sleep(1000);

                // downcasting thisDog object from the animal super class to the dog subclass
                // it will call from the subclass instead of the superclass
                System.out.println(thisDog.getName() + " goes out to play.");
                ((Dog)thisDog).play(110);          // plays for more than 100 minutes
                Thread.sleep(1000);
                System.out.println();

                ((Dog)thisDog).play(20);           // plays for less than 100 minutes
                Thread.sleep(1000);
                System.out.println();

                ((Dog)thisDog).run(600);               // successfully runs
                Thread.sleep(1000);
                System.out.println();

                System.out.println(thisDog.getName() + " tries to eat");
                ((Dog)thisDog).eat(20);           // Dog eats and replenishes energy and gains weight
                Thread.sleep(1000);
                System.out.println();

                System.out.println(thisDog.getName() + " tries to sleep");
                ((Dog)thisDog).sleep(70);               // Dog sleeps and is no longer tired, and replenishes energy level
                Thread.sleep(1000);
                System.out.println();

                System.out.println(thisDog.getName() + "'s birthday! WOO!");
                thisDog.birthday();              // Dog has another birthday
                Thread.sleep(1000);
                System.out.println();
            }
        } catch (Exception e) {
        }
    }
}
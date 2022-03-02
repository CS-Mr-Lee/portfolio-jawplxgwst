/**
 * Name: James Wong
 * Teacher: Mr Lee
 * Date: Mar 01 2022
 * Description:
 *      Create 1 humans
 *      Create 1 vegetable
 *      Create 3 cookies (use each of the constructors)
 *          One of the cookies should be packaged
 *      Person should try to eat packaged cookie
 *      Person should try to eat too much of a vegetable
 *      Person should eat a cookie and gain energy
 */

public class Wong_James_OOQuiz1 {
    public static void main (String []args){
        Human thisHuman = new Human ("Yako", 80.7, 50);
        Vegetable thisVegetable = new Vegetable ("Kale", 7, 67);
        Cookie thisCookie1 = new Cookie();
        Cookie thisCookie2 = new Cookie("Gingerbread Cookie", 16, 90);
        Cookie thisCookie3 = new Cookie("Oatmeal Raisin Cookie", 35.9, 50, true);

        thisHuman.eat(thisCookie3, 10);     // Person should try to eat packaged cookie
        thisHuman.eat(thisVegetable, 100);  // Person should try to eat too much of a vegetable
        thisHuman.eat(thisCookie2, 5);      // Person should eat a cookie and gain energy

        System.out.println("Weight: " + thisHuman.getWeight());
        System.out.println("Energy Level: " + thisHuman.getEnergyLevel());
    }


}

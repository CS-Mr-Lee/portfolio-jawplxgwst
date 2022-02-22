/**
 * Name: James Wong
 * Teacher: Mr Lee
 * Date: Feb 11 2022
 * Description: Read the file at https://github.com/ngryman/lol-champions/blob/master/champions.json.
                In the file, MaxChampStats.txt, write out in separate lines:
                    a) the name and hp of the champion with the highest hp
                    b) the name and armor of the champion with the lowest armor
 */

import java.io.*;       // import all java.io mainly the file ones

public class Wong_James_ChampionFilter {
    public static void main(String[] args) {

        String fileIn = "champions.json";   // importing file to code

        // hp and armor champion variables
        String hpChampion= " ";
        String armorChampion = " ";
        double maxHp = 0;               // set max hp to lowest number
        double minArmor = 99999999;     // set min armor to highest number

        double hp;                      // hp of the champion
        double armor;                   // armor of the champion

        String championName = " ";      // name of champion

        // try a buffered reader
        try (BufferedReader in = new BufferedReader(new FileReader(fileIn))) {
            String input;                   // declare a variable to hold the input of the file being read

            // loop the reader until there is no more data to read
            while ((input = in.readLine()) != null) {
                if (input.contains("\"name\"")){                        // if "name" is read isolate the name as a string
                    String[] holdName = input.split(": \"");
                    championName = holdName[1];
                    // variable to hold the name of the current champion
                    championName = championName.substring(0, championName.length() - 2);
                }

                // if "hp" is read isolate then parse the hp as a double
                if (input.contains("\"hp\"")) {
                    String[] holdHp = input.split(": ");
                    String championHp =  holdHp[1];
                    hp = Double.parseDouble(championHp.substring(0, championHp.length()-1));

                    // compare the current max hp with the new hp
                    if (hp>maxHp){
                        maxHp = hp;                 // keep the larger value
                        hpChampion = championName;  // change the champion
                    }
                }

                // if "armor" is read isolate then parse the armor as a double
                if (input.contains("\"armor\"")){
                    String[] holdArmor = input.split(": ");
                    String championArmor =  holdArmor[1];
                    armor = Double.parseDouble(championArmor.substring(0, championArmor.length() - 1));

                    if (armor<minArmor) {
                        minArmor = armor;               // keep the lower value
                        armorChampion = championName;   // change the champion
                    }
                }
            }
        } catch (FileNotFoundException e) {     // error if File is not found
            System.out.println("An error occurred(File not found).");
            e.printStackTrace();
        } catch (IOException ex) {              // error for IOException
            System.out.println("An error occurred(IOException).");
        }

        // send variables to second function
        printFile(maxHp,hpChampion, minArmor, armorChampion);
    }

    /**
     * @param hp
     * @param hpChamp
     * @param armor
     * @param armorChamp
     */
    public static void printFile (double hp, String hpChamp, double armor, String armorChamp) {
        String file = "MaxChampStats.txt";      // write to this file

        // try a file writer
        // output of file
        try (FileWriter output = new FileWriter(file)) {
            output.write("The champion with the highest hp is: " + hpChamp + "\n");
            output.write("Hp: " + hp + "\n");
            output.write("\n");
            output.write("The champion with lowest armor is " + armorChamp + "\n");
            output.write("Armor: " + armor);
        } catch (IOException i) {               // catch IOException
            System.out.println("An error occurred(IOException).");
        }
    }
}

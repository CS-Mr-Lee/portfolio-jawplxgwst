/**
 * Name: James Wong
 * Teacher: Mr Lee
 * Date: Feb 11 2022
 * Description: Code a program which encrypts a line of code. The encryption
                specifications are as follows:
                    -first and last character of each word are exchanged.
                    -Middle characters of each word are shifted to the character two (+2) after it in the ASCII table (works for non-letters as well.)
                    -spaces are kept and unchanged
 */
import java.util.Scanner;   //import scanner class

public class Wong_James_Encryption {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);        // make a scanner

        // prompt user for word to be encrypted
        System.out.print("Enter a line to be encrypted: ");
        String encrypt = sc.nextLine();

        // variables
        int length = encrypt.length();                  // length of encryption
        char [] storage = new char [length];            // array to store each character of the original encryption
        char h ;                                        // hold value for char
        int baseValue = 1;                              // base value for int when subtracting length to encrypt the middle characters
        int count = 0;                                  // count subtraction value
        int [] ascii = new int [length];                // array to convert to ascii


        // swap the first and last character of each word and converting the word into char
        for (int i = 0; i < length; i++) {      // for words with spaces after
            if (encrypt.charAt(i) == ' '){
                storage[i] = ' ';
                h = storage[i-count];
                storage[i-count] = storage[i-1];
                storage[i-1] = h;
                count = 0;
            } else if (i+1 == length) {         // for the last word
                storage[i] = encrypt.charAt(i);
                h = storage[i-count];
                storage[i-count] = storage[i];
                storage[i] = h;
                count = 0;
            } else {                            // convert String to char
                storage[i] = encrypt.charAt(i);
                count = count + 1;
            }
        }

        // converting all characters to ascii values and moving two up
        for (int k = 0; k < length; k++) {
           ascii[k] = (int) storage[k];
           ascii[k] = ascii[k] + 2;
        }

        // switching the middle characters out with their new ascii values
        for (int q = 0; q < length; q++){
            if (encrypt.charAt(q) == ' '){      // detects for space and the encrypts the middle characters of the word
                count = q-1;
                while (count>baseValue) {
                    count--;
                    storage[count] = (char) ascii[count];
                }
                baseValue = q+2;
            } else if (q+1 == length){          // detects for the last word and encrypts the middle character of the last word
                count = q;
                while (count>baseValue){
                    count--;
                    storage[count] = (char) ascii[count];
                }
            }
        }


        // final output
        System.out.print("The encryption is: ");
        for (int j = 0; j < length; j++) {
            System.out.print(storage[j]);
        }


        sc.close();         // close scanner
    }
}

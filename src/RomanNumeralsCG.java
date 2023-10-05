/*
Collin Grover
CMIS 106 - Exam 2
11/18/2022
RomanNumeralsCG.java
 */
import java.util.Scanner;

public class RomanNumeralsCG {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //initialize scanner
        System.out.println("Enter a number between 1 – 10: "); // prompt user
        int normNum = input.nextInt(); // takes input
        if (normNum <= 0 || normNum > 10){ // sorts out invalid numbers
            System.out.println("That is not a valid number. Please enter a number between 1 – 10.");
        } else { // for all valid #s, show roman numeral counterpart
            switch (normNum) {
                case 1:
                    System.out.println("The number you entered was " + normNum + ", which converts to I in Roman Numerals.");
                    break;
                case 2:
                    System.out.println("The number you entered was " + normNum + ", which converts to II in Roman Numerals.");
                    break;
                case 3:
                    System.out.println("The number you entered was " + normNum + ", which converts to III in Roman Numerals.");
                    break;
                case 4:
                    System.out.println("The number you entered was " + normNum + ", which converts to IV in Roman Numerals.");
                    break;
                case 5:
                    System.out.println("The number you entered was " + normNum + ", which converts to V in Roman Numerals.");
                    break;
                case 6:
                    System.out.println("The number you entered was " + normNum + ", which converts to VI in Roman Numerals.");
                    break;
                case 7:
                    System.out.println("The number you entered was " + normNum + ", which converts to VII in Roman Numerals.");
                    break;
                case 8:
                    System.out.println("The number you entered was " + normNum + ", which converts to VIII in Roman Numerals.");
                    break;
                case 9:
                    System.out.println("The number you entered was " + normNum + ", which converts to XI in Roman Numerals.");
                    break;
                case 10:
                    System.out.println("The number you entered was " + normNum + ", which converts to X in Roman Numerals.");
                    break;
            }
        }
    }
}

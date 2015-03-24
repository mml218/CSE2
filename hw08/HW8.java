/////////////////////////////////////////////
//Matthew Lambert
//Homework 8 Game Java Program
//
//  first compile the program
//      javac HW8.java
//  run the program
//      java HW8//

//  define a class

import java.util.Scanner;
import java.io.*;
import java.math.*;
import java.lang.Math; //imports scanner, Math to use within program

public class HW8 {

    // add main method
    public static void main(String[] args) {

        char option; //creates character option
        Scanner scan = new Scanner(System.in); //imports scanner
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc"); //checks for c or C response by referring to method, also assigns value to input
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc"); //checks for c or C response by referring to method
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave(); //goes to method cave
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc"); //checks for c or C response by referring to method
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc"); //checks for c or C response by referring to method
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant(); //goes to method giant
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10); //checks other method, for AaEe, 10 trial, sent to lower method
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 treasure boxes in front of you! Enter the box number you want to open!");
        box(); //goes to method box
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }

    public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");      //picture of the giant
    }

    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");       //warrior approaching a cave
    }

    public static void box() {
        System.out.println("                     *********************     *********************    *********************              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************              ");      //3 chests to choose treasure from
    }

    public static String getInput(Scanner scan, String string) {
        String input = scan.next(); //checks next input value
        String value = "null";
        switch (input) {
            case "c":
                value = "c"; //assigns value of C
                break;
            case "C":
                value = "C"; //assigns value of C
                break;
            default: //not c or C
                System.out.println("Yea right LOSER!");
                System.exit(0); //exits program
        }

        return value; //returns c or C value to continue

    }

    public static String getInput(Scanner scan, String string, int trial) { //assigns new method
        String userInput = scan.next(); //checks next input value
        String option = "null"; 
        String output = "null"; //assigned values to string variables
        int start = 0; //starting value to giant damage
        switch (userInput) { //assigns switch statement for input
            case "a":
            case "A": //condition of a or A
                    if ((int)(Math.random() * 2) == 1) { //checks if random value, 0 or 1, is 1
                        System.out.println("Critical hit!");
                        System.out.println("The giant's current damange is " + (-(trial-11)) + "/10"); //displays current updated damange to giant
                        trial--; //counts down trial from 10
                        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                            if (trial <= 0){ //once trial is 0, return to continue
                                return "null"; //returns to continue
                            }
                        String retrial = getInput(scan, string, trial); //restart method to retry
                    }
                    else { //otherwise
                        System.out.println("Missed!"); //missed message
                        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                        String retrial = getInput(scan, string, trial); //restart method to retry

                    }
                
                break;
            case "e":
            case "E": //condition of e or E
                    if ((int)(Math.random() * 11) == 10) { //random number between 1 and 10
                        System.out.println("Successfully escaped!"); //esape method
                        return "null"; //returns null to continue 
                    }
                    else { //otherwise
                        System.out.println("You tried to escape, but could not!");
                        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                        String retrial = getInput(scan, string, trial); //restarts method
                    }
                break; //end
            default:
                System.out.println("Executed by the GIANT! Game over!");
                System.exit(0); //end program

        }
        return "null"; //returns to continue
    }

    public static String getInput(Scanner scan) { //new method for rewards
        String choice = scan.next(); //inputs user input
        String reward = "null";
        switch (choice) { //creates switch statement based on input
            case "1": //if user chooses 1
                System.out.println("You uncover a diamond encrusted goblet.");
                reward = "You uncover a diamond encrusted goblet."; //reward 1
                break;
            case "2": //if user chooses 2
                System.out.println("You find 5,000 gold coins.");
                reward = "You find 5,000 gold coins."; //reward 2
                break;
            case "3": //if user chooses 3
                System.out.println("You discover a new sword.");
                reward = "You discover a new sword."; //reward 3
                break;
            default: //otherwise
                System.out.println("A wrong number! You get nothing! Better restart the game LOL"); //message
                System.exit(0); //end program
        }

        return reward; //return statement of reward
    }

} //end of class
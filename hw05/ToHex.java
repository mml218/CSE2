/////////////////////////////////////////////
//Mathew Lambert
//ToHex Java Program
//
//  first compile the program
//      javac ToHex.java
//  run the program
//      java ToHex//

import java.util.Scanner;
import java.util.InputMismatchException;

//  define a class
public class ToHex {

    //  add main method
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
       
        System.out.println("Enter three numbers representing RGB values: "); //prompts user to enter numbers
        int nRed = scan.nextInt();
        int nGreen = scan.nextInt();
        int nBlue = scan.nextInt(); // enters three numbers between 0 and 255 to convert to Hexidecimal
       
        int nRedHex1;
        int nRedHex2; //establishes decimal number of value of number
        String nRedZero1;
        String nRedZero2; //establishes hexidecimal value based on nRedHex
        if (nRed > -1 && nRed < 256) { //ensures number is between 0 and 255
            nRedHex1 = nRed / 16; //finds int number of times 16 goes into nRedHex
            if (nRedHex1 < 10) { //if number < 10, uses that number as the value for 1 decimal places
                    nRedZero1 = Integer.toString(nRedHex1); //converts integer to string value
                }
            else if (nRedHex1 == 10) {
                    nRedZero1 = "A";
                }
            else if (nRedHex1 == 11) {
                    nRedZero1 = "B";
                }
            else if (nRedHex1 == 12) {
                    nRedZero1 = "C";
                }
            else if (nRedHex1 == 13) {
                    nRedZero1 = "D";
                }
            else if (nRedHex1 == 14) {
                    nRedZero1 = "E";
                }
            else {
                    nRedZero1 = "F"; //this function and those above convert int values >= 10 to 1 digit hexidecimal values
                }

            nRedHex2 = nRed % 16; //finds remainder of 16 in nRed
            if (nRedHex2 < 10) {
                    nRedZero2 = Integer.toString(nRedHex2); //converts int value to string value if less than 10
                }
            else if (nRedHex2 == 10) {
                    nRedZero2 = "A";
                }
            else if (nRedHex2 == 11) {
                    nRedZero2 = "B";
                }
            else if (nRedHex2 == 12) {
                    nRedZero2 = "C";
                }
            else if (nRedHex2 == 13) {
                    nRedZero2 = "D";
                }
            else if (nRedHex2 == 14) {
                    nRedZero2 = "E";
                }
            else {
                    nRedZero2 = "F"; //converts values >= 10 to 16-base
                }
             }
        else
        {
            System.out.println("Hexidecimal cannot be found because value is not between 0 and 255"); //else if value is not in range
            return; //close program
        }
        
        int nGreenHex1;
        int nGreenHex2; //used for remainder and division by 16
        String nGreenZero1;
        String nGreenZero2; //used to convert integer values to string values
        if (nGreen > -1 && nGreen < 256) { //checks if value in range
            nGreenHex1 = nGreen / 16; //finds nGreen divided by 16 in int form
            if (nGreenHex1 < 10) { //checks if below 10
                    nGreenZero1 = Integer.toString(nGreenHex1); //converts int value < 10 to string
                }
            else if (nGreenHex1 == 10) {
                    nGreenZero1 = "A";
                }
            else if (nGreenHex1 == 11) {
                    nGreenZero1 = "B";
                }
            else if (nGreenHex1 == 12) {
                    nGreenZero1 = "C";
                }
            else if (nGreenHex1 == 13) {
                    nGreenZero1 = "D";
                }
            else if (nGreenHex1 == 14) {
                    nGreenZero1 = "E";
                }
            else {
                    nGreenZero1 = "F"; //converts decimal values to 16-base
                }
            nGreenHex2 = nGreen % 16; //finds remainder of 16 into nGreen
            if (nGreenHex2 < 10) {
                    nGreenZero2 = Integer.toString(nGreenHex2);
                }
            else if (nGreenHex2 == 10) {
                    nGreenZero2 = "A";
                }
            else if (nGreenHex2 == 11) {
                    nGreenZero2 = "B";
                }
            else if (nGreenHex2 == 12) {
                    nGreenZero2 = "C";
                }
            else if (nGreenHex2 == 13) {
                    nGreenZero2 = "D";
                }
            else if (nGreenHex2 == 14) {
                    nGreenZero2 = "E";
                }
            else {
                    nGreenZero2 = "F"; //converts numbers greater than 9 to one digit hexidecimal numbers
                }
        }
        else
        {
            System.out.println("Hexidecimal cannot be found because value is not between 0 and 255"); //error message
            return;
        }
        
        int nBlueHex1;
        int nBlueHex2; //used for division and remainder
        String nBlueZero1;
        String nBlueZero2; //reassigned numeric values to Strings
        if (nBlue > -1 && nBlue < 256) { //checks if in range
            nBlueHex1 = nBlue / 16; //finds int value by dividing by 16
            if (nBlueHex1 < 10) { //checks if below 10
                    nBlueZero1 = Integer.toString(nBlueHex1); //converts int value to String of same value
                }
            else if (nBlueHex1 == 10) {
                    nBlueZero1 = "A";
                }
            else if (nBlueHex1 == 11) {
                    nBlueZero1 = "B";
                }
            else if (nBlueHex1 == 12) {
                    nBlueZero1 = "C";
                }
            else if (nBlueHex1 == 13) {
                    nBlueZero1 = "D";
                }
            else if (nBlueHex1 == 14) {
                    nBlueZero1 = "E";
                }
            else {
                    nBlueZero1 = "F"; //converts values greater than 9 to one digit hexidecimal values
                }
            nBlueHex2 = nBlue % 16;   
            if (nBlueHex2 < 10) {
                    nBlueZero2 = Integer.toString(nBlueHex2); //converts value to string of same value
                }
            else if (nBlueHex2 == 10) {
                    nBlueZero2 = "A";
                }
            else if (nBlueHex2 == 11) {
                    nBlueZero2 = "B";
                }
            else if (nBlueHex2 == 12) {
                    nBlueZero2 = "C";
                }
            else if (nBlueHex2 == 13) {
                    nBlueZero2 = "D";
                }
            else if (nBlueHex2 == 14) {
                    nBlueZero2 = "E";
                }
            else {
                    nBlueZero2 = "F"; //converts values greater than 9 to one digit hexidecimal
                }
        }
        else
        {
            System.out.println("Hexidecimal cannot be found because value is not between 0 and 255"); //error message
            return; //close program
        }
        
        System.out.println("The decimal numbers R:" + nRed + ", G:" + nGreen + ", B:" + nBlue + ", is represented in hexidecimal as: " + nRedZero1 + nRedZero2 + nGreenZero1 + nGreenZero2 + nBlueZero1 + nBlueZero2); 
                //displays explanation of value as well as combined string values to show full hexidecimal value
    }

}

/////////////////////////////////////////////
//Matthew Lambert
//Demo 0
//Waves Java Program
//
//  first compile the program
//      javac waves.java
//  run the program
//      java waves//

import java.lang.Math;
import java.util.Scanner;
import java.math.*;

//  define a class
public class waves{
    
    //  add main method
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in); //imports scanner
        System.out.println("Enter a number between 1 and 30: "); //prompts user to enter number
        
        
        int nNumber; //initializes number
            if (scan.hasNextInt()) {  //checks if input is int
                 nNumber = scan.nextInt(); //assigns value to nNumber
            }
            else { //otherwise
                System.out.println("That value is not an integer."); //displays message
                return; //end program
            }
      
      
        int numberUsed = 0; //initializes number to be used cheking range of number
        if (nNumber > 0 && nNumber < 31) //checks to see if value is 1 to 30
            {
               numberUsed = nNumber; //assigns same value to numberUsed
            }
        else { //otherwise
            System.out.println("Number not in the range."); //will notify if value is too high or too low
            return; //close program
        }        
        
        System.out.println("");    //space to aesthetics
        System.out.println("For Loop:"); //name of loop

        for (int place1=0; place1 <= numberUsed; place1++){ //posts number numbers in column, counting up to numberUsed
            for (int place2=0; place2 < place1; place2++){ //posts number numbers in each row, counting up to place1
                System.out.print(place1); //displays number
                if (place1 % 2 > 0){ //checks if number is odd
                    for (int place3=place1-1; place3 > place2; place3--) { //counts down, then postdecrement
                    System.out.print(place1); //displays number
                    }
                    System.out.println(""); //new line
                }
                else { //otherwise even
                    for (int place3=0; place3 < place2; place3++) { //counts up, then postincrement
                    System.out.print(place1); //displays number
                    }
                    System.out.println(""); //new line
                }
            }
        }
        
        System.out.println(""); //space for aesthetics
        System.out.println("Do While Loop"); //name of loop
        
        int value1=1; //initalizes first column values
        int value2=0; //itializes row values
        int value3; //itilalizes row widths
        
        do {
            value2=1; //corrects for running do, then checking
            do {
                value2++; //postincrement
                    if (value1 % 2 > 0){ //checks if odd
                        value3=value1-1; //countdown
                        do {
                            System.out.print(value1); //displays number
                            value3--; //postdecrement
                        }
                        while (value3 >= value2-2);
                        System.out.println(""); //new line
                    }
                    else { //otherwise number is even for increasing rows
                        value3=0; //sets to 0 for increase
                        do {
                            System.out.print(value1); //displays number
                            value3++; //postincrement
                        }
                        while (value3 <= value2 -2); //corrects for run then check
                        System.out.println(""); //new line
                    }
            }
            while (value2 < value1 +1); //corrects for run then check
            value1++; //postincrement
        }
        while (value1 <= numberUsed); //counts up to numberUsed
        
        System.out.println("");  //space for new line
        System.out.println("While Loop:");  //shows type of loop
        
        int count1=0; //initializes first column values
        int count2=0; //initializes numbers in each row
        int count3; //initializes width of row
        
        while (count1 <= numberUsed) {//counts to number then stops
            count2=0;
            while (count2 < count1){
                System.out.print(count1);
                if (count1 % 2 > 0){ //checks if odd number
                    count3=count1-1; //sets count3 to 1 less than count1 for countdown
                    while (count3 > count2) { //countdown 
                        System.out.print(count1); //posts number
                        count3--; //postdecrement count3
                    }
                    System.out.println(""); //new line
                }
                else { //otherwise is even number
                    count3=0; //sets to 0
                    while (count3 < count2){ //counts up from 0
                        System.out.print(count1); //displays number
                        count3++; //postincrement count3
                    }
                    System.out.println("");
                }
                count2++; //postincrement count2
            }
            count1++; //postincrement count1
        }
        
    }
    
}
// Thank you for accepting this a few days late!
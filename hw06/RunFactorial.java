/////////////////////////////////////////////
//Matthew Lambert
//Demo 0
//Run Factorial Java Program
//
//  first compile the program
//      javac RunFactorial.java
//  run the program
//      java RunFactorial//

import java.lang.Math;
import java.util.Scanner;

//  define a class
public class RunFactorial{
    
    //  add main method
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in); //initialies scanner
        System.out.print("Enter integer that is between 9 and 16: "); //prompts user input
        
        int firstNumber = 0; //initializes firstNumber
        int number = 0; //initializes number
        int start; //initializes start value
        int end = 1; //initializes end value
        
            for (start = 0; start < end; start++){ //for statement used to collect input value between range and as an int
                if (scan.hasNextInt()){ //checks for int
                    number = scan.nextInt(); //assigns value to input
                        if (number >= 9 && number <= 16) { //checks if value between 9 and 16
                            System.out.println("Input accepted."); //
                        }
                        else {
                            System.out.println("Invalid input, enter again."); //error message
                            start = start - 1; //if not valid, reset
                        }
                }
                else {
                    System.out.println("Invalid input, enter again."); //error message
                    scan.next(); //collects scan value and resets
                    start = start - 1; //if not valid, reset
                }
            }

        int counter = 1; //define counter
        int factorial = 1; //define factorial
        while (counter < number){ //checks if counter is less than number using while statement
            factorial *= counter; //changes factorial by multiplying it by counter
            counter++; //adds one to counter, approaches number
        }
        
        System.out.println(number + "! = " + factorial); //displays factorial
    }
    
}
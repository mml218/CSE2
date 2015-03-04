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
        
        int firstNumber; //initializes firstNumber
        int number; //initializes number
            while (scan.hasNextInt()) { //if int, assigns value
                firstNumber = scan.nextInt(); //assigns value to firstNumber
            }
            else { //otherwise
                System.out.println("Not an accepted integer."); //error message
                return;
            }
        
            while (firstNumber >= 9 && firstNumber <= 16){ //ensures number in range
                number = firstNumber; //corrects number value to correct value in range
            }
            else {
                System.out.println("Not in range."); //error message
                return;
            }


        int counter = 1; //define counter
        int factorial = 1; //define factorial
        System.out.println("Input accepted."); //it works
        while (counter < number){ //checks if counter is less than number
            factorial *= counter; //changes factorial by multiplying it by counter
            counter++; //adds one to counter, approaches number
        }
        
        System.out.println(number + "! = " + factorial); //displays factorial
    }
    
}
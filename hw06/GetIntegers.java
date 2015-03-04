/////////////////////////////////////////////
//Matthew Lambert
//Demo 0
//Get Integers Java Program
//
//  first compile the program
//      javac GetIntegers.java
//  run the program
//      java GetIntegers//

import java.lang.Math;
import java.util.Scanner;

//  define a class
public class GetIntegers{
    
    //  add main method
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in); //initialies scanner
        System.out.print("Enter 5 positive integers: "); //prompts user input

        int value;
        int end = 5;
        int number;
        int sum = 0;
        
            for (value = 0; value < end; value++){
                if (scan.hasNextInt()){
                    number = scan.nextInt();
                        if (number >= 0) {
                            sum += number;
                        }
                        else {
                            System.out.println("Invalid input, enter again.");
                            value = value - 1;
                        }
                }
                else {
                    System.out.println("Invalid input, enter again.");
                    scan.next();
                    value = value - 1;
                }
            }
        System.out.println("The sum is: " + sum); //displays sum
    }
    
}
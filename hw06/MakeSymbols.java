/////////////////////////////////////////////
//Matthew Lambert
//Demo 0
//Make Symbols Java Program
//
//  first compile the program
//      javac MakeSymbols.java
//  run the program
//      java MakeSymbols//

import java.lang.Math;

//  define a class
public class MakeSymbols{
    
    //  add main method
    public static void main(String[] args){
        
        int number = (int)(Math.random()*100); //assigns random number between 0 and 100
        int counter = number; //sets counter equal to number
        System.out.println("Random number generated: " + number); //displays number
    //    while (counter > 0){ //counts down counter
        do {
	        if (number % 2 == 1) { //checks if number is odd
	            System.out.print("&"); //displays $ number times if odd
    	        counter--; //counts down counter without affecting number
	        }
	        else{ //number is even 
	            System.out.print("*"); //displays * number times if even
	            counter--; //counts down counter without affecting number
	        }
        } while (counter > 0);
    
        
        System.out.println(" "); //added space purely for aesthetics to create new line
    }
    
}
/////////////////////////////////////////////
//Matthew Lambert
//Root Java Program
//
//  first compile the program
//      javac Root.java
//  run the program
//      java Root//

import java.util.Scanner;

//  define a class
public class Root{
    
    //  add main method
    public static void main(String[] args){
        
    Scanner myScanner;
    myScanner = new Scanner( System.in );
    System.out.print("Enter a number to find its cube root: "); //prompts user to enter number to find cubed root
    double nNumber = myScanner.nextDouble(); //converts to variable
    double guessOne = nNumber/3; //creates first guess
    System.out.println("The cube root guess is: " + guessOne); //displays first guess
    System.out.println("   That guess cubed is: " + guessOne * guessOne * guessOne); //cubes first guess
    double guessTwo = (guessOne * guessOne * guessOne + nNumber) / (3 * guessOne * guessOne); //creates second guess
    System.out.println("The cube root guess is: " + guessTwo); //displays second guess
    System.out.println("   That guess cubed is: " + guessTwo * guessTwo * guessTwo); //cubes second guess
    double guessThree = (2 * guessTwo * guessTwo * guessTwo + nNumber) / (3 * guessTwo * guessTwo); //creates third guess
    System.out.println("The cube root guess is: " + guessThree); //displays third guess
    System.out.println("   That guess cubed is: " + guessThree * guessThree * guessThree); //cubes third guess
    double guessFour = (2 * guessThree * guessThree * guessThree + nNumber) / (3 * guessThree * guessThree); //creates fourth guess
    System.out.println("The cube root guess is: " + guessFour); //displays fourth guess
    System.out.println("   That guess cubed is: " + guessFour * guessFour * guessFour); //cubes fourth guess
    double guessFive = (2 * guessFour * guessFour * guessFour + nNumber) / (3 * guessFour * guessFour); //creates fifth guess
    System.out.println("The cube root guess is: " + guessFive); //displays fifth guess
    System.out.println("   That guess cubed is: " + guessFive * guessFive * guessFive); //cubes fifth guess
    }
    
}
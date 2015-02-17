/////////////////////////////////////////////
//Matthew Lambert
//Banking Java Program
//
//  first compile the program
//      javac Banking.java
//  run the program
//      java Banking//

import java.util.Scanner;

//  define a class
public class Banking{
    
    //  add main method
    public static void main(String[] args){
        
    Scanner myScanner;
    myScanner = new Scanner( System.in ); //imports scanner
    int range = (5000 - 1000) + 1; //sets range for values
    int startingBalance = (int)(Math.random() * range) + 1000; //creates and assigns starting value
    System.out.print("Enter any key to view balance: "); 
    String response = myScanner.next(); //prompts user to enter any key to continue
    System.out.println("Current balance is: $" + startingBalance + ".00"); //displays balance
    System.out.print("Would you like to deposit or withdraw money (d/w): "); //prompts user to choose d/w
        String function = myScanner.next();
        switch (function) {
            case "d":
            case "D": //capitalization doesn't matter
                System.out.print("Enter integer amount you would like to deposit: ");
                int deposit = myScanner.nextInt(); //prompts deposit amount
                int depositBalance = startingBalance + deposit; //adds to new amount
                if (deposit > 0) {  //checks if value is positive
                    System.out.println("New balance is: $" + (int) depositBalance + ".00"); //shows new balance
                    System.out.println("Thank you for banking with us.");
                }
                    else {
                        System.out.println("You cannot deposit that amount."); //if value is not > 0, closes program
                        return;
                    }
                break;
            case "w":
            case "W": //capitalization doesn't matter
                System.out.print("Enter integer amount you would like to withdraw: "); //prompts withdraw amount
                int withdraw = myScanner.nextInt(); //assigns variable
                int withdrawBalance = startingBalance - withdraw; //calculates balance
                    if (startingBalance + 0.01 > withdraw && withdraw > 0) { //checks if within range
                        System.out.println("New balance is: $" + (int) withdrawBalance + ".00"); //displays new balance
                        System.out.println("Thank you for banking with us."); 
                    }
                    else {
                        System.out.println("You cannot withdraw that amount."); //error message for withdraw amount
                        return;
                    }
                    break;
            default:
                System.out.println("Incorrect command."); //error message for not entering d/w
                return;
        }
    }
    
} //end program
/////////////////////////////////////////////
//Matthew Lambert
//Which Number Java Program
//
//  first compile the program
//      javac WhichNumber.java
//  run the program
//      java WhichNumber//

import java.util.Scanner;

//  define a class
public class WhichNumber{
    
    //  add main method
    public static void main(String[] args){
        
    Scanner myScanner;
    myScanner = new Scanner( System.in );
    System.out.println("Think of a number between 1 and 10 inclusive."); 
    System.out.print("Is your number even? (y/n) ");//prompts user to enter number
    String answerEven = myScanner.next(); //finds yes or no
        switch (answerEven) {
            case "y":
            case "Y": //ignores capitalization of answer
                System.out.print("Is your number divisible by 3? ");
                String answerThree = myScanner.next(); //finds answer to divisible by 3
                    switch (answerThree) {
                        case "y":
                        case "Y": //ignores capitalization of answer
                            System.out.println("Your number is 6.");
                            return;
                        case "n":
                        case "N":
                            System.out.print("Is your number divisible by 4? ");
                            String answerFour = myScanner.next(); //finds answer to divisible by 4
                                switch (answerFour) {
                                    case "y":
                                    case "Y": //ignores capitalization
                                        System.out.print("Is the number divided by 4 greater than 1? ");
                                        String answerModulo = myScanner.next(); //finds answer to % 4
                                            switch (answerModulo) {
                                                case "y":
                                                case "Y": //ignores capitalization 
                                                    System.out.println("Your number is 8."); //guess
                                                    return;
                                                case "n":
                                                case "N":
                                                    System.out.println("Your number is 4."); //guess
                                                    return;
                                                default: System.out.println("Invalid response."); //error message
                                                    return;
                                                }
                                    case "n":
                                    case "N": //ignores capitalization
                                        System.out.print("Is the number divisible by 5? "); //finds answer to divisible by 5
                                        String answerFive = myScanner.next();
                                            switch (answerFive) {
                                                case "y":
                                                case "Y": //ignores capitalization
                                                    System.out.println("Your number is 10."); //guess
                                                    return;
                                                case "n":
                                                case "N": //ignores capitalization
                                                    System.out.println("Your number is 2."); //guess
                                                    return;
                                                default: System.out.println("Invalid response."); //error message
                                                    return;
                                                }
                                    default: System.out.println("Invalid response."); //error message  
                                        return;
                            }
                            default: System.out.println("Invalid response."); //error message
                            return;
                    }
            default: System.out.println("Invalid response."); //error message
                return;
            case "n":
            case "N": //ignores capitalization
                System.out.print("Is your number divisible by 3? "); //finds answer to divisible by 3
                answerThree = myScanner.next(); //assigns variable
                    switch (answerThree) {
                        case "y":
                        case "Y": //ignores capitalization
                            System.out.print("When divided by 3 is the result greater than 1? "); //asks % 3
                            String answerThreeModulo = myScanner.next(); //assigns variable 
                                switch (answerThreeModulo) {
                                    case "y":
                                    case "Y": //ignores capitalization
                                        System.out.println("Your answer is 9."); //guess
                                        return;
                                    case "n":
                                    case "N": //ignores capitalization
                                        System.out.println("Your number is 3."); //guess
                                        return;
                                    default: System.out.println("Invalid response."); //error message
                                        return;
                                }
                        case "n":
                        case "N": //ignores capitalization
                            System.out.print("Is your number greater than 6? "); //asks if > 6
                            String answerSix = myScanner.next(); //assigns variable
                                switch (answerSix) {
                                    case "y":
                                    case "Y": //ignores capitalization
                                        System.out.println("Your number is 7."); //guess
                                        return;
                                    case "n":
                                    case "N": //ignores capitalization
                                        System.out.print("Is your number less than 3? "); //asks if number < 3
                                        String answerFourModulo = myScanner.next(); //assigns variable
                                            switch (answerFourModulo) {
                                                case "y":
                                                case "Y": //ignores capitalization
                                                    System.out.println("Your number is 1."); //guess
                                                case "n":
                                                case "N": //ignores capitalization
                                                    System.out.println("Your number is 5."); //guess
                                                default: System.out.println("Invalid response."); //error message
                                                return;
                                            }
                                    default: System.out.println("Invalid response."); //error message
                                        return;
                                }
                            default: System.out.println("Invalid response."); //error message
                            return;
                    }
            }
    }
}
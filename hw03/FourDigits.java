/////////////////////////////////////////////
//Matthew Lambert
//Four Digits Java Program
//
//  first compile the program
//      javac FourDigits.java
//  run the program
//      java FourDigits//

import java.util.Scanner;

//  define a class
public class FourDigits{
    
    //  add main method
    public static void main(String[] args){
        
    Scanner myScanner;
    myScanner = new Scanner( System.in );
    System.out.print("Enter a number in the format of xxx.xxxx: "); //prompts user to enter number
    double nNumber = myScanner.nextDouble(); //converts to variable
    double nSubtractedNumber = (int) nNumber * 10000; //used to calculate decimals
    double nSubtractionNumber = nNumber * 10000; //used to calculate decimals
    int nNewNumber = (int) nSubtractionNumber - (int) nSubtractedNumber; //finds decimal value
   
    String nZero = ""; //used to account for zeroes before decimals values if value is < 4 digits
    if (nNewNumber < 10) {
        nZero = "000";
    } else if (nNewNumber < 100){
        nZero = "00";
    } else if (nNewNumber < 1000){
        nZero = "0";
    }
    
    System.out.println("The four digits are: " + nZero + nNewNumber); //displays value after decimal point
    }
    
}
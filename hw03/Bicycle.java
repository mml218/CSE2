/////////////////////////////////////////////
//Matthew Lambert
//Bicycle Java Program
//
//  first compile the program
//      javac Bicycle.java
//  run the program
//      java Bicycle//

import java.util.Scanner;

//  define a class
public class Bicycle{
    
    //  add main method
    public static void main(String[] args){
        
    Scanner myScanner;
    myScanner = new Scanner( System.in );
    System.out.print("Enter number of counts: "); //prompts user to enter wheel counts
    double nCyclometer = myScanner.nextDouble(); //converts input to variable
    System.out.print("Enter number of seconds: "); //prompts user to enter seconds
    double nSeconds = myScanner.nextDouble(); //converts input to variable
   
    double wheelDiameter=27.0;  // diameter of wheel in inches
    double  PI=3.14159; // PI used for wheel circumference
    int feetPerMile=5280;  // feet per mile
    int inchesPerFoot=12;   // inches per foot
    int secondsPerMinute=60;  // seconds per minute
    int minutesPerHour=60; // minutes per hour
    double distance = ((((PI * wheelDiameter * nCyclometer) / inchesPerFoot) / feetPerMile)); //calculates distance
    double nMPH = distance / (nSeconds/(secondsPerMinute * minutesPerHour)); //calculates MPH
        
    System.out.println("The distance was " + Math.round(distance*100.0)/100.0 + " miles and took " + nSeconds / secondsPerMinute + " minutes."); //displays rounded distance and time
    System.out.println("The average miles per hour was " +  Math.round(nMPH*100.0)/100.0 + "."); //displays rounded MPH
   
    }
    
}
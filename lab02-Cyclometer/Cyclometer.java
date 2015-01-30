/////////////////////////////////////////////
//Matthew Lambert
//January 23, 2015
//CSE2
//Demo 0
//Cyclometer Java Program
//
//  first compile the program
//      javac Cyclometer.java
//  run the program
//      java Cyclometer//

//  define a class
public class Cyclometer{
    
    //  add main method
    public static void main(String[] args){
        
        int secsTrip1=480;  // duration of trip 1, in seconds
        int secsTrip2=3220;  // duration of trip 2, in seconds
        int countsTrip1=1561;  // cycles of wheel in Trip1
        int countsTrip2=9037;  // cycles of wheel in Trip2
        
        double wheelDiameter=27.0;  // diameter of wheel in inches
        double  PI=3.14159; // PI used for wheel circumference
        int feetPerMile=5280;  // feet per mile
        int inchesPerFoot=12;   // inches per foot
        int secondsPerMinute=60;  // seconds per minute
        double distanceTrip1, distanceTrip2, totalDistance; // distances to be defined later
        
        System.out.println("Trip 1 took "+
                (secsTrip1/secondsPerMinute)+" minutes and had "+
                 countsTrip1+" counts.");   // diplays total time in minute and wheel cycle counts in Trip1
        System.out.println("Trip 2 took "+
                (secsTrip2/secondsPerMinute)+" minutes and had "+
                 countsTrip2+" counts.");  // diplays total time in minute and wheel cycle counts in Trip2
        
        // Above gives distance in inches
        // (for each count, a rotation of the wheel travels
        // the diameter in inches times PI)
            distanceTrip1=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile; // Converts to distance in miles
            distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; // Converts to distance
            totalDistance=distanceTrip1+distanceTrip2; // Computes total distance
        System.out.println("Trip 1 was "+distanceTrip1+" miles"); // displays Trip1 distance
        System.out.println("Trip 2 was "+distanceTrip2+" miles"); // displays Trip2 distance
        System.out.println("The total distance was "+totalDistance+" miles"); // Displays total distance
        
        
    }   //end of main method
    
}   //end of class
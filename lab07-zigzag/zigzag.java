/////////////////////////////////////////////
//Matthew Lambert
//Demo 0
//Get Integers Java Program
//
//  first compile the program
//      javac zigzag.java
//  run the program
//      java zigzag//

import java.lang.Math;
import java.util.Scanner;

//  define a class
public class zigzag{
    
    //  add main method
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an in between 3 and 33: ");
        
        int nStars = scan.nextInt();
        int storedStars = nStars;
        while (nStars > 0 ) { //(Math.random()*33)){
	    System.out.print("*");
    	nStars--;
        }
        
        System.out.println("");
        
        int lineValues = storedStars;
        
        while (lineValues > 0 ) { //(Math.random()*33)){
	    System.out.println(" ");
    	lineValues--;
        }
        
        nStars = storedStars;
        while (nStars > 0 ) { //(Math.random()*33)){
	    System.out.print("*");
    	nStars--;
        }
        
    }
    
}
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
public class zigzag {

    //  add main method
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Enter an int between 3 and 33: ");

            int nStars = -1;
            nStars = scan.nextInt();
            int storedStars = nStars;
            while (nStars > 0) { //(Math.random()*33)){
                System.out.print("*");
                nStars--;
            }

            System.out.println("");

            int lineValues = storedStars;

            while (lineValues-2 > 0) { //(Math.random()*33)){
                for (int z = 2; lineValues - z > 0; z++) {
                    System.out.print(" ");
                }
                System.out.println("*");
                lineValues--;
            }

            nStars = storedStars;
            while (nStars > 0) { //(Math.random()*33)){
                System.out.print("*");
                nStars--;
            }
        System.out.println("");
        } while (3 > 2);

    }
}
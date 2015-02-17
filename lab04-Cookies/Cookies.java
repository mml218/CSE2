/////////////////////////////////////////////
//Mathew Lambert
//Cookies Java Program
//
//  first compile the program
//      javac Cookies.java
//  run the program
//      java Cookies//

import java.util.Scanner;

//  define a class
public class Cookies {

    //  add main method
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of people: ");
        int nPeople = scan.nextInt();
        if (nPeople < 0) {
            System.out.println("No negative ints.");
            return;
                }
        

        else if (nPeople == 1) {
            System.out.println("You did not enter an int.");
            return; //leaves the program, i.e.
            //the program terminates
        }

        System.out.print("Enter the number of cookies you plan to buy: ");
        int nCookies = scan.nextInt();
        if (nCookies < 0) {
            System.out.println("No negative ints.");
            return;
        }

        else {
            System.out.println("You did not enter an int.");
            return; //leaves the program, i.e.
            //the program terminates
        }

        System.out.print("How many do you want each person to get? ");
        int nCookiesEach = scan.nextInt();
        if (nCookiesEach < 0) {
            System.out.println("No negative ints.");
            return;
        }
        else {
            System.out.println("You did not enter an int.");
            return; //leaves the program, i.e.
            //the program terminates

        }



        if ((nCookiesEach * nPeople) < nCookies) {
                System.out.println("You do not have enough cookies.");
            }
            else {
                System.out.println("You have enough cookies.");
            }
    }

}

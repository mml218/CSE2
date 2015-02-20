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
        

        System.out.print("Enter the number of cookies you plan to buy: ");
        int nCookies = scan.nextInt();
        if (nCookies < 0) {
            System.out.println("No negative ints.");
            return;
        }


        System.out.print("How many do you want each person to get? ");
        int nCookiesEach = scan.nextInt();
        if (nCookiesEach < 0) {
            System.out.println("No negative ints.");
            return;
        }

        int moreCookies = nCookiesEach * nPeople - nCookies;

        if ((nCookiesEach * nPeople) > nCookies) {
                System.out.println("You do not have enough cookies. You need to buy at least " + moreCookies + " more.");
            }
        if ((nCookiesEach * nPeople) < nCookies) {
                if (nCookies % nPeople != 0){
                    System.out.println("You have enough cookies, but they will not divide evenly.");
                }
                else{
                System.out.println("You have enough cookies.");
                }
            }
    }

}

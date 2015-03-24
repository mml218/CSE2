/////////////////////////////////////////////
//Matthew Lambert
//Factorials Java Program
//
//  first compile the program
//      javac Factorials.java
//  run the program
//      java Factorials//
// The program will count the number of Big Macs you purchase and give you the total cost including tax

import java.util.Scanner;

//  define a class
public class Factorials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter an integer to the find super factorial: ");
        int sup = scan.nextInt();
        int sum = 0;
        for(int i = 1; i <= sup; i++){
            sum += factorial(i);
        }
        print(sum);
  }
    public static int factorial(int key){
        int mul = 1;
        for (int i = 1; i <= key; i++){
            mul *= i;
        }
        System.out.println(mul);
        return mul;
    }
    public static void print(int num){
        System.out.println("The super factorial is equal to " + num);
    }
}
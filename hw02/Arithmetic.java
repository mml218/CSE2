/////////////////////////////////////////////
//Matthew Lambert
//Arithmetic Java Program
//
//  first compile the program
//      javac Arithmetic.java
//  run the program
//      java Arithmetic//

//  define a class
public class Arithmetic{
    
        // add main method
    public static void main(String[] args){
    
        //Number of pairs of socks
    int nSocks=3;
        //Cost per pair of socks
        //(‘$’ is part of the variable name)
    double sockCost$=2.58;
    
        //Number of drinking glasses
    int nGlasses=6;
        //Cost per glass
    double glassCost$=2.29;

        //Number of boxes of envelopes
    int nEnvelopes=1;
        //cost per box of envelopes
    double envelopeCost$=3.25;
    double taxPercent=0.06;
    double taxMultiplier=(1+taxPercent);
    
    double totalSocksCost$=nSocks*sockCost$; //total cost of Socks
    double totalGlassCost$=nGlasses*glassCost$; //total cost of Glass
    double totalEnvelopeCost$=nEnvelopes*envelopeCost$; //total cost of Envelopes
    double totalPurchaseCost$=totalEnvelopeCost$+totalGlassCost$+totalSocksCost$;
    double totalPurchaseCostPlusTax$=totalPurchaseCost$*taxMultiplier;
    
    
    System.out.println("Total cost of socks: $" + totalSocksCost$);
    System.out.println("Total cost of glasses: $" + totalGlassCost$);
    System.out.println("Total cost of envelopes: $" + totalEnvelopeCost$); 
    System.out.println(" ");
    System.out.println("Total cost of socks after tax: $" + totalSocksCost$*taxMultiplier);
    System.out.println("Total cost of glasses after tax: $" + totalGlassCost$*taxMultiplier);
    System.out.println("Total cost of envelopes after tax: $" + totalEnvelopeCost$*taxMultiplier); 
    System.out.println(" ");
    System.out.println("Total cost of purchase: $" + totalPurchaseCost$);
    System.out.println("Total cost of purchase after tax: $" + totalPurchaseCostPlusTax$);
    
    
    }
    
}
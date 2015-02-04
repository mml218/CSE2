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
        //pecent of tax cost at 6%
    double taxPercent=0.06;
        //multiplier for total purchase plus 6% tax
    double taxMultiplier=(1+taxPercent);
    
    double totalSocksCost$=nSocks*sockCost$; //total cost of Socks
    double totalGlassCost$=nGlasses*glassCost$; //total cost of Glass
    double totalEnvelopeCost$=nEnvelopes*envelopeCost$; //total cost of Envelopes
    double totalPurchaseCost$=totalEnvelopeCost$+totalGlassCost$+totalSocksCost$; //total cost of purchase
    double totalPurchaseCostPlusTax$=totalPurchaseCost$*taxMultiplier; //total cost of purchase, including 6% tax
    
    System.out.println("Item being purchased: socks");  //displays item socks
    System.out.println("Item being purchased: glasses");    //displays item glasses
    System.out.println("Item being purchased: envelopes");  //displays item envelopes
    System.out.println("");
    System.out.println("Number of socks purchased: " + nSocks); //displays number of socks  
    System.out.println("Number of glasses purchased: " + nGlasses); //displays number of glasses
    System.out.println("Number of envelopes purchased: " + nEnvelopes); //displays number of envelopes
    System.out.println("");
    System.out.println("Total cost of socks: $" + totalSocksCost$); //calculates socks cost
    System.out.println("Total cost of glasses: $" + totalGlassCost$);   //calculates glasses cost
    System.out.println("Total cost of envelopes: $" + totalEnvelopeCost$);  //calculates envelopes cost
    System.out.println(" ");
    System.out.println("Tax on socks: $" + (Math.round(100.0 * totalSocksCost$ * taxPercent))/100.0);   //calculates socks tax to two decimals
    System.out.println("Tax on glasses: $" + (Math.round(100.0 * totalGlassCost$ * taxPercent))/100.0); //caculates glasses tax to two decimals
    System.out.println("Tax on envelopes: $" + (Math.round(100 * (int) totalEnvelopeCost$ * taxPercent))/100.0);    //calculates envelopes tax to two decimals
    System.out.println(" ");
    System.out.println("Total cost of socks after tax: $" + (Math.round(100 * (int) totalSocksCost$ * taxMultiplier))/100.0);   //calculates cost plus tax
    System.out.println("Total cost of glasses after tax: $" + (Math.round(100.0 * totalGlassCost$ * taxMultiplier))/100.0); //calculates cost plus tax
    System.out.println("Total cost of envelopes after tax: $" + (Math.round(100.0 * totalEnvelopeCost$ * taxMultiplier))/100.0); //calculates cost plus tax
    System.out.println(" ");
    System.out.println("Total cost of purchase: $" + (Math.round(100.0 * totalPurchaseCost$))/100.0);   //calculates total purchase cost
    System.out.println("Total tax on purchase: $" + (Math.round(100.0 * totalPurchaseCost$ * taxPercent))/100.0);   //calculates tax on purchase
    System.out.println("Total cost of purchase after tax: $" + (Math.round(100.0 * totalPurchaseCostPlusTax$))/100.0);  //calculates total purchase cost plus tax
    
        // computes and displays all values as indicated above
    
    } // end of main method
    
}   //end of class Arithmetic
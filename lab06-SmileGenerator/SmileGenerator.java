/////////////////////////////////////////////
//Matthew Lambert
//Demo 0
//Smile Generator Java Program
//
//  first compile the program
//      javac SmileGenerator.java
//  run the program
//      java SmileGenerator//

//  define a class
public class SmileGenerator{
    
    //  add main method
    public static void main(String[] args){
        
        int counter = 0;
        while (counter < 5){
	    System.out.print(":)");
    	counter++;
        }
        
        System.out.println(" ");
        
        int counter2 = 0;
        while (counter2 < (Math.random()*1000)){
	    System.out.print(":)");
    	counter2++;
        }
        
        System.out.println(" ");
        
        int counter3 = 0;
        while (counter3 < 30){
	    System.out.print(":)");
    	counter3++;
        }
        
        System.out.println(" ");
        
        int x=0;
        int y=0;
        int random=30;
        while (x != y && y != random){
            if (x == y){
                y++;
                System.out.print(":)");
            }
            System.out.print(":)");
            
        }
        
        int counter4 = 0;
        int linelimit = 1;
        while (counter <= linelimit){
	    System.out.print(":)");
    	counter++;
        }        
        
    

        System.out.println(" ");
        return;
    }
    
}
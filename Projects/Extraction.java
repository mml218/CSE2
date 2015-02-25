import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Extraction {

public static void main(String [] args) throws IOException {
    Scanner scan = new Scanner(System.in);
        //    System.out.print("Enter company: ");
        //    String company = scan.next();
    URL url = new URL ("http://research.stlouisfed.org/fred2/data/GDPC1.txt");
    BufferedReader reader = null;
    BufferedWriter writer = null;
    String message = null;
    String errorMessage = "Try again.";
    String line = null;
    String substr1 = "<title>";
    String substr2 = "</title>";
    int start;
    int end;
        reader = new BufferedReader(new InputStreamReader(url.openStream()));
        writer = new BufferedWriter(new FileWriter("data5.txt"));

    String stockPrice;


        while ((line = reader.readLine()) != null) {
             // start = line.indexOf(substr1);
             // end = line.indexOf(substr2);
             // stockPrice = line.substring();
                     writer.write(line);
                     writer.newLine();
            }
//    System.out.println("Start is: " + start + " End is: " + end);
    }
}
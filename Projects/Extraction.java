import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Extraction {

public static void main(String [] args) throws IOException {
    Scanner scan = new Scanner(System.in);
            System.out.print("Enter company: ");
            String company = scan.next();
    URL url = new URL ("http://finance.yahoo.com/q;_ylt=ApXYM9sPHVWXtOB_j4pOewsnv7gF?uhb=uhb2&fr=uh3_finance_vert_gs&type=2button&s=" + company + "%2C");
    BufferedReader reader = null;
    BufferedWriter writer = null;
    String message = null;
    String errorMessage = "Try again.";
    String line = null;
    int start = line.indexOf("<title>");
    int end = line.indexOf("</title>");
    try {
        reader = new BufferedReader(new InputStreamReader(url.openStream()));
        writer = new BufferedWriter(new FileWriter("data5.txt"));

        if ((line = reader.readLine()) != null) {

            if (start != -1) {
            line.substring(start + "<title>".length(), end);
            // message = line.substring(0, 100);
            }
        }

            if ((line = reader.readLine()) != null) {
                System.out.println("Maybe this worked");
                writer.write(message);
                writer.newLine();
            }

        } 
    
    finally {
        if (reader != null)
            return;
    }
}
}
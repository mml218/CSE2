import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Extraction2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.print("Enter company: ");
            String company = scan.next();
        try {
            URL url = new URL ("http://finance.yahoo.com/q;_ylt=ApXYM9sPHVWXtOB_j4pOewsnv7gF?uhb=uhb2&fr=uh3_finance_vert_gs&type=2button&s=" + company + "%2C");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            BufferedWriter writer = new BufferedWriter(new FileWriter("data4.txt"));
            String line;
            int start;
            int end;
            String message;
            
            while ((line = reader.readLine()) != null) {
            start = line.indexOf("<title>");
            end = line.indexOf("</title>");

            if (start != -1) {
               message = line.substring(start + "<title>".length(), end);
                }
            }
        
        
        
        
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                writer.write(line);
                writer.newLine();
            }
            reader.close();
            writer.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Extraction3 {

public static void main(String [] args) throws IOException {
    URL url = new URL(address);
    BufferedReader reader = null;
    try {
        reader = new BufferedReader(new InputStreamReader(url.openStream()));

        String line = null;
        while ((line = reader.readLine()) != null) {
            int start = line.indexOf("<title>");
            int end = line.indexOf("</title>");

            if (start != -1) {
                return line.substring(start + "<title>".length(), end);
            }
        }

        return "";
    } finally {
        if (reader != null)
            reader.close();
    }
}
}
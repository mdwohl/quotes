/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException{
        Gson gson = new Gson();
        Scanner scanQuotes = new Scanner(new File ("/src/main/resources/quotes.json"));
//        Quote quote = new Quote("body", "author");
        String quotesJSON = scanQuotes.nextLine();
        Quote gsonQuote = gson.fromJson(quotesJSON, Quote.class);
        System.out.println(gsonQuote);

    }

}

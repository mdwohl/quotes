package quotes;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Quote {
    public String quoteBody;
    public String author;
//    Gson gson = new Gson();

    public Quote(String quoteBody, String author){
        this.quoteBody = quoteBody;
        this.author = author;
    }

    public String toString(){
        return String.format("' %s ' - %s");
    }
}


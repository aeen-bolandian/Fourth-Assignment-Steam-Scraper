import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Parser {
    static List<Game> games = new ArrayList<>();

    public List<Game> sortByName(){
        List<Game> sortedByName = new ArrayList<>(games);
        // Sort games alphabetically (least)
        //TODO
        return  sortedByName;
    }

    public List<Game> sortByRating(){
        List<Game> sortedByRating = new ArrayList<>(games);
        // Sort games by rating (most)
        //TODO
        return sortedByRating;
    }

    public List<Game> sortByPrice(){
        List<Game> sortedByPrice = new ArrayList<>(games);
        // Sort games by price (most)
        //TODO
        return sortedByPrice;
    }

    public void setUp() throws IOException {

        //Parse the HTML file using Jsoup
        //TODO

        // Extract data from the HTML
        //TODO

        // Iterate through each Game div to extract Game data
        //TODO
    }

    public static void main(String[] args) {
        //you can test your code here before you run the unit tests
    }
}

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.File;
import java.io.IOException;
import java.util.*;

import javax.print.Doc;

public class Parser {
    static List<Game> games = new ArrayList<>();

    public void sortByName(){

        games.sort(Comparator.comparing(Game::getName));

    }

    public void sortByRating(){

        games.sort((game1 , game2) -> Double.compare(game2.getRating(), game1.getRating()));

    }

    public void sortByPrice(){

        games.sort((game1 , game2) -> Integer.compare(game2.getPrice(), game1.getPrice()));

    }

    public void setUp() throws IOException {

        File input = new File("D:\\AP\\Fourth-Assignment-Steam-Scraper\\src\\Resources");

        Document doc = Jsoup.parse(input , "UTF-8");

        Elements games = doc.select("div.game");

        for(Element game : games) {
            String name = game.selectFirst(".game-name").text();
            String price = game.selectFirst(".game-price").text();
            String rating = game.selectFirst(".game-rating").text();

            Parser.games.add(new Game(name , Double.parseDouble(rating) , Integer.parseInt(price)));

        }
    }

    public static void main(String[] args) {
        //you can test your code here before you run the unit tests
    }
}

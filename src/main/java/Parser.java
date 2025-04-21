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

    public List<Game>  sortByName(){

        games.sort(Comparator.comparing(Game::getName));
        return Parser.games;

    }

    public List<Game> sortByRating(){

        games.sort((game1 , game2) -> Double.compare(game2.getRating(), game1.getRating()));
        return Parser.games;

    }

    public List<Game> sortByPrice(){

        games.sort((game1 , game2) -> Integer.compare(game2.getPrice(), game1.getPrice()));
        return Parser.games;

    }

    public void setUp() throws IOException {
        File input = new File("D:\\AP\\Fourth-Assignment-Steam-Scraper\\src\\Resources\\Video_Games.html");
        Document doc = Jsoup.parse(input , "UTF-8");
        Elements games = doc.select("div.game");

        for (Element game : games) {
            String name = game.selectFirst(".game-name").text();

            String priceText = game.selectFirst(".game-price").text();
            String priceValue = priceText.replace("€", "").replace(" ", "");
            int price = Integer.parseInt(priceValue);
            
            String ratingText = game.selectFirst(".game-rating").text();
            String ratingValue = ratingText.split("/")[0].trim();
            double rating = Double.parseDouble(ratingValue);

            Parser.games.add(new Game(name, rating, price));
        }
    }


    public static void main(String[] args) {
        //you can test your code here before you run the unit tests
    }
}

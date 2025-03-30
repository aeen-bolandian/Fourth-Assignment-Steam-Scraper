import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParserTest {

    public static Parser handle;

    @BeforeAll
    static void setUp() throws IOException {
        handle = new Parser();
        handle.setUp();
    }

    @Test
    public void testSortByName() {
        List<Game> sortedGames = handle.sortByName();
        Game g1 = new Game("Crusader Kings III" ,4.5,83);
        Game g2 = new Game("Forza Motorsport 4" ,4.0,80);
        Game g3 = new Game("Gears of War 3" ,4.2,85);
        Game g4 = new Game("Killzone 2" ,3.8,62);
        Game g5 = new Game("Crysis" ,4.6,79);
        Game g6 = new Game("God of War: Chains of Olympus" ,4.8,88);

        //Todo
//        assertEquals(250, sortedCountries.size());
//        assertEquals(sortedCountries.get(57),g1);
//        assertEquals(sortedCountries.get(79),g2);
//        assertEquals(sortedCountries.get(84),g3);
//        assertEquals(sortedCountries.get(243),g4);
//        assertEquals(sortedCountries.get(134),g5);
    }

        @Test
        public void testSortByPrice() {
            List<Game> sortedGames = handle.sortByPrice();
            Game g1 = new Game("Crusader Kings III" ,4.5,83);
            Game g2 = new Game("Forza Motorsport 4" ,4.0,80);
            Game g3 = new Game("Gears of War 3" ,4.2,85);
            Game g4 = new Game("Killzone 2" ,3.8,62);
            Game g5 = new Game("Crysis" ,4.6,79);
            Game g6 = new Game("God of War: Chains of Olympus" ,4.8,88);

//            assertEquals(250, sortedCountries.size());
//            assertEquals(sortedCountries.get(18),g1);
//            assertEquals(sortedCountries.get(148),g2);
//            assertEquals(sortedCountries.get(74),g3);
//            assertEquals(sortedCountries.get(12),g4);
//            assertEquals(sortedCountries.get(66),g5);
//            assertEquals(sortedCountries.get(35),g6);
        }

    @Test
    public void testSortByRating() {
        List<Game> sortedGames = handle.sortByRating();
        Game g1 = new Game("Crusader Kings III" ,4.5,83);
        Game g2 = new Game("Forza Motorsport 4" ,4.0,80);
        Game g3 = new Game("Gears of War 3" ,4.2,85);
        Game g4 = new Game("Killzone 2" ,3.8,62);
        Game g5 = new Game("Crysis" ,4.6,79);
        Game g6 = new Game("God of War: Chains of Olympus" ,4.8,88);

//        assertEquals(250, sortedCountries.size());
//        assertEquals(sortedCountries.get(11),g1);
//        assertEquals(sortedCountries.get(166),g2);
//        assertEquals(sortedCountries.get(97),g3);
//        assertEquals(sortedCountries.get(67),g4);
//        assertEquals(sortedCountries.get(24),g5);
//        assertEquals(sortedCountries.get(2),g6);
    }
}

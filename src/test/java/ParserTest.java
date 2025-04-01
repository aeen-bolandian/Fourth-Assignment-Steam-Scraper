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
        Game g1 = new Game("Bloodborne" ,4.8,88);
        Game g2 = new Game("Gran Turismo 2" ,4.6,90);
        Game g3 = new Game("Resident Evil Code: Veronica" ,4.6,85);
        Game g4 = new Game("Super Smash Bros. Brawl" ,4.6,88);
        Game g5 = new Game("The Last of Us" ,4.9,92);
        Game g6 = new Game("Wipeout XL" ,4.3,86);

        //Todo
        assertEquals(57, sortedGames.size());
        assertEquals(sortedGames.get(2),g1);
        assertEquals(sortedGames.get(13),g2);
        assertEquals(sortedGames.get(24),g3);
        assertEquals(sortedGames.get(35),g4);
        assertEquals(sortedGames.get(41),g5);
        assertEquals(sortedGames.get(55),g6);
    }

        @Test
        public void testSortByPrice() {
            List<Game> sortedGames = handle.sortByPrice();
            Game g1 = new Game("Tekken 3" ,4.4,91);
            Game g2 = new Game("Super Smash Bros. Melee" ,4.8,91);
            Game g3 = new Game("Advance Wars" ,4.7,89);
            Game g4 = new Game("Company of Heroes" ,4.7,87);
            Game g5 = new Game("Uncharted 3: Drake's Deception" ,4.7,84);
            Game g6 = new Game("Final Fantasy XII" ,4.7,76);

            assertEquals(57, sortedGames.size());
            assertEquals(sortedGames.get(6),g1);
            assertEquals(sortedGames.get(12),g2);
            assertEquals(sortedGames.get(26),g3);
            assertEquals(sortedGames.get(38),g4);
            assertEquals(sortedGames.get(44),g5);
            assertEquals(sortedGames.get(52),g6);
        }

    @Test
    public void testSortByRating() {
        List<Game> sortedGames = handle.sortByRating();
        Game g1 = new Game("God of War II" ,4.9,90);
        Game g2 = new Game("Diablo" ,4.8,87);
        Game g3 = new Game("Advance Wars" ,4.7,89);
        Game g4 = new Game("Unreal Tournament 2004" ,4.6,88);
        Game g5 = new Game("Gran Turismo 3: A-Spec" ,4.5,84);
        Game g6 = new Game("Flipnote Studio" ,4.2,75);

        assertEquals(57, sortedGames.size());
        assertEquals(sortedGames.get(5),g1);
        assertEquals(sortedGames.get(12),g2);
        assertEquals(sortedGames.get(29),g3);
        assertEquals(sortedGames.get(38),g4);
        assertEquals(sortedGames.get(44),g5);
        assertEquals(sortedGames.get(55),g6);
    }
}

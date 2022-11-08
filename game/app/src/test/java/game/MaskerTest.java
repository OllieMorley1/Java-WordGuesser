package game;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import org.junit.Test;

public class MaskerTest {
    
    // @Test public void TestMasker() {
    //     WordChooser mockedWordChooser = mock(WordChooser.class);
    //     when(mockedWordChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
    //     Game game = new Game(mockedWordChooser);
    //     assertEquals(game.Masker(), "M_____");
    // }

    // @Test public void testMasker2(){
    //     WordChooser mockedWordChooser = mock(WordChooser.class);
    //     when(mockedWordChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
    //     Game game = new Game(mockedWordChooser);
    //     game.guessLetter('K');
    //     assertEquals(game.Masker(), "M_K___");
    // }
    
    @Test public void testGetsMaskedWord() {
        Masker mockMasker = mock(Masker.class);
        ArrayList<Character> guessedLetters = new ArrayList<Character>();
        guessedLetters.add('E');
        assertEquals(mockMasker.getMaskedWord("MAKERS", guessedLetters), "M__E__");
    }
}

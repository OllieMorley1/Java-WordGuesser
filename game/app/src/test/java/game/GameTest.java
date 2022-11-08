package game;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.util.Arrays;

public class GameTest {

    @Test public void testGetRemainingAttempts(){
        WordChooser mockedWordChooser = mock(WordChooser.class);
        Game game = new Game(mockedWordChooser);
        assertEquals(game.getRemainingAttempts(), Integer.valueOf(10));
    }

    @Test public void testGuessLetter(){
        WordChooser mockedWordChooser = mock(WordChooser.class);
        when(mockedWordChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
        Game game = new Game(mockedWordChooser);
        assertEquals(game.guessLetter('M'), true);
        assertEquals(game.guessLetter('Y'), false);
    }
}

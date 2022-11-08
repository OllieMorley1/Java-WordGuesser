package game;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class WordChooserTest {
    @Test public void testgetRandomWordFromDictionary(){
        WordChooser word_chooser = new WordChooser();
        String[] DICTIONARY = {"MAKERS", "CANDIES", "DEVELOPER", "LONDON"};
        assertTrue(Arrays.asList(DICTIONARY).contains(word_chooser.getRandomWordFromDictionary()));
    }
}

package game;

import java.util.Random;

public class WordChooser {
    private String[] DICTIONARY = {"MAKERS", "CANDIES", "DEVELOPER", "LONDON"};

    public static void main(String[] args) {
    }

    public String getRandomWordFromDictionary(){
        Random rand = new Random();
        return DICTIONARY[rand.nextInt(DICTIONARY.length)];
    }
}
